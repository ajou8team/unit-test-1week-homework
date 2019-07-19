//모현민
package ajouTeam8;

import org.junit.Test;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertThat;
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

    @Test
    public void getTwoString_for_Same_name_but_str1_is_UpperCase_str2_is_SmallLetterCase(){
        compareString = new CompareString();
        String str1 = "MOHYEONMIN";
        String str2 = "mohyeonmin";

        //equalToIgnoringCase
        assertThat(str1, equalToIgnoringCase(str2));
    }
}
