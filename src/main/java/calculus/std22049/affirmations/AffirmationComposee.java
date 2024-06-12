package calculus.std22049.affirmations;

public abstract sealed class AffirmationComposee extends Affirmation permits Et, Ou, Donc {
    protected Affirmation affirmation1;
    protected Affirmation affirmation2;

    public AffirmationComposee(Affirmation affirmation1, String conjonction, Affirmation affirmation2) {
        super(String.format("%s %s %s", affirmation1.phrase, conjonction, affirmation2.phrase));
        this.affirmation1 = affirmation1;
        this.affirmation2 = affirmation2;
    }
}
