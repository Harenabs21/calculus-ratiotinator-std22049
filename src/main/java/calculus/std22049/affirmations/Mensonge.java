package calculus.std22049.affirmations;


import lombok.Getter;

@Getter
public final class Mensonge extends Affirmation {
    private boolean statut;

    public Mensonge(String phrase){
        super(phrase);
        this.statut = false;
    }
    public String estFausse(){
        return "fausse";
    }
}
