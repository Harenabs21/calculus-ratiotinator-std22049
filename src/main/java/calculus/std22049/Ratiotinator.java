package calculus.std22049;

import calculus.std22049.affirmations.Affirmation;
import calculus.std22049.affirmations.ValeurDeVerite;

import java.util.function.Function;

public class Ratiotinator implements Function<Affirmation, ValeurDeVerite> {

    @Override
    public ValeurDeVerite apply(Affirmation affirmation) {
        return affirmation.valeurDeVerite();
    }
}
