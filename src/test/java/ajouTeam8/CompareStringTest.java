//모현민
package ajouTeam8;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
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

    @Test
    public void getTwoString_But_str1_has_WhiteSpace_Str2_has_not_WhiteSpace(){
        compareString = new CompareString();
        String str1 = "    MoHyeonMin";
        String str2 = "MoHyeonMIn";

        //equalToIgnoringWhiteSpace
        assertThat(str1, equalToIgnoringWhiteSpace(str2));
    }

    @Test
    public void getTwoStringSearchString(){
        compareString = new CompareString();

        String str1 ="MoHyeonMIn";
        String str2 ="Hyeon";

        //containsString
        assertThat(str1, containsString(str2));
    }

    @Test
    public void getNothingchoose(){
        compareString = new CompareString();
        int choose = 1;

        //notNullvalue
        assertThat(choose, is(notNullValue()));

        //Nullvalue
        assertThat(null,is(nullValue()));

    }
}
