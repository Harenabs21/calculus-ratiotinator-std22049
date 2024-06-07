package calculus.std22049.affirmations;

import lombok.Getter;

@Getter
public final class Verite extends Affirmation {
    private boolean statut;
    public Verite(String phrase) {
        super(phrase);
        this.statut = true;
    }
}
