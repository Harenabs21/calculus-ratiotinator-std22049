package calculus.std22049.affirmations;

import lombok.Getter;

import static calculus.std22049.affirmations.ValeurDeVerite.jenesaispas;

@Getter
public sealed class Affirmation permits Verite, Mensonge, AffirmationComposee {
    protected String phrase;
    public Affirmation(String phrase){
        this.phrase = phrase;
    }

    public ValeurDeVerite valeurDeVerite() {
        return jenesaispas;
    }

    public final Affirmation et(Affirmation affirmation2){
        return new Et(this, affirmation2);
    }

    public final Affirmation ou(Affirmation affirmation2) {
        return new Ou(this, affirmation2);
    }

    public final Affirmation donc(Affirmation affirmation2) {
        return new Donc(this, affirmation2);
    }
}
