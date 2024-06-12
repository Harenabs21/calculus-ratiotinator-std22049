package calculus.std22049.affirmations;

import lombok.Getter;

import static calculus.std22049.affirmations.ValeurDeVerite.jenesaispas;

@Getter
public sealed class Affirmation permits Verite, Mensonge {
    protected String phrase;
    public Affirmation(String phrase){
        this.phrase = phrase;
    }

    public ValeurDeVerite valeurDeVerite() {
        return jenesaispas;
    }
}
