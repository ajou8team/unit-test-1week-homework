package ajouTeam8;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CompareStringTest {

    private CompareString compareString ;


    @Test
    public void getTwoString_for_null_inuput(){
        compareString = new CompareString();
        String str1 =null;
        String str2 =null;

        //assertTrue
        assertTrue(str1==null);

        assertTrue(str2 ==null);
    }
}
