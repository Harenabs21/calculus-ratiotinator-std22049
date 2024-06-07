package vérité;

import calculus.std22049.affirmations.Verite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VeriteTest {

    @Test
    public void verifier_est_toujours_vraie() {
        Verite verite = new Verite("Lou est beau");
        Assertions.assertTrue(verite.isStatut());
    }
}
