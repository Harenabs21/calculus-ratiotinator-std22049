package affirmation;

import calculus.std22049.Ratiotinator;
import calculus.std22049.affirmations.Affirmation;
import calculus.std22049.affirmations.Mensonge;
import calculus.std22049.affirmations.Verite;
import org.junit.jupiter.api.Test;

import static calculus.std22049.affirmations.ValeurDeVerite.faux;
import static calculus.std22049.affirmations.ValeurDeVerite.vraie;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AffirmationTest {

    private final Ratiotinator ratiotinator = new Ratiotinator();

    @Test
    public void faire_une_affirmation() {
        Affirmation affirmation = new Affirmation("Je mange une glace");
    }

    @Test
    void lou_est_pauvre_et_lou_est_genereux() {
        Mensonge mensonge = new Mensonge("Lou est pauvre ");
        Affirmation affirmation = new Affirmation("Lou est généreux");
        assertEquals(faux, ratiotinator.apply(mensonge.et(affirmation)));
    }

    @Test
    void lou_est_beau_ou_pauvre() {
        var lou_est_beau = new Verite("Lou est beau");
        var lou_est_pauvre = new Mensonge("Lou est pauvre");
        assertEquals(vraie, ratiotinator.apply(lou_est_beau.ou(lou_est_pauvre)));
    }

    @Test
    void une_affirmation_complexe() {
        var lou_est_beau = new Verite("Lou est beau");
        var lou_est_pauvre = new Mensonge("Lou est pauvre");
        var lou_est_genereux = new Affirmation("Lou est généreux");
        assertEquals(faux, ratiotinator.apply((lou_est_beau.ou(lou_est_genereux)).donc(lou_est_pauvre)));
    }
}
