package calculus.std22049.affirmations;

import static calculus.std22049.affirmations.ValeurDeVerite.*;

public final class Donc extends AffirmationComposee {
    public Donc(Affirmation affirmation1, Affirmation affirmation2) {
        super(affirmation1, "donc",affirmation2);
    }

    @Override
    public ValeurDeVerite valeurDeVerite() {
        var valeur1 = affirmation1.valeurDeVerite();
        var valeur2 = affirmation2.valeurDeVerite();

        if(valeur1.equals(vraie) && valeur2.equals(vraie) || valeur1.equals(faux) && valeur2.equals(faux) || valeur1.equals(jenesaispas) && valeur2.equals(jenesaispas)){
            return vraie;
        }
        else {
            return faux;
        }
    }
}
