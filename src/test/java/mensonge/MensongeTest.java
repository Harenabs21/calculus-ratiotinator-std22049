package mensonge;

import calculus.std22049.affirmations.Mensonge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MensongeTest {

    @Test
    public void un_mesonge_est_toujours_fausses(){
        Mensonge mensonge =  new Mensonge("Lou est pauvre");
        Assertions.assertFalse(mensonge.isStatut());
    }
}
