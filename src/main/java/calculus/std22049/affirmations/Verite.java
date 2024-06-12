package calculus.std22049.affirmations;

import lombok.Getter;

import static calculus.std22049.affirmations.ValeurDeVerite.vraie;

@Getter
public final class Verite extends Affirmation {
    public Verite(String phrase) {
        super(phrase);
    }

    @Override
    public ValeurDeVerite valeurDeVerite() {
        return vraie;
    }
}
