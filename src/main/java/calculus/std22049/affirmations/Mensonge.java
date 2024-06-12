package calculus.std22049.affirmations;


import lombok.Getter;

import static calculus.std22049.affirmations.ValeurDeVerite.faux;

@Getter
public final class Mensonge extends Affirmation {

    public Mensonge(String phrase) {
        super(phrase);
    }

    @Override
    public ValeurDeVerite valeurDeVerite() {
        return faux;
    }
}
