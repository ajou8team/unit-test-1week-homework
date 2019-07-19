//모현민
package ajouTeam8;

public class CompareString {
    public boolean compareTwoString(String str1, String str2, int choose) {
        if (choose == 0) {
            if (str1 == null || str2 == null) {
                return false;
            }
        }

            //equals
            else if (choose == 1) {
                return str1.equals(str2);
            }

            //contains
            else if (choose == 2) {
                return str1.contains(str2);
            }

            return false;
    }

}
