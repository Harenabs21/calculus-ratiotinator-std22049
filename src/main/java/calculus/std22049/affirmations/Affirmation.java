package calculus.std22049.affirmations;

import lombok.Getter;

@Getter
public sealed class Affirmation permits Verite, Mensonge {
    private String phrase;
    public Affirmation(String phrase){
        this.phrase = phrase;
    }
}
