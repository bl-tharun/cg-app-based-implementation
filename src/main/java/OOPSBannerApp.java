/**
 * OOPSBannerApp
 *
 * @author tharun
 * @version 1.0
 */

public class OOPSBannerApp {

    // method to print "O"
    public static String[] getOPattern() {
        return new String[]
                {
                        "   ***    ",
                        " **   **  ",
                        "**     ** ",
                        "**     ** ",
                        "**     ** ",
                        "**     ** ",
                        "**     ** ",
                        " **   **  ",
                        "   ***    "
                };
    }

    // method to prin "P"
    public static String[] getPPattern() {
        return new String[]
                {
                        "******    ",
                        "**    **  ",
                        "**     ** ",
                        "**    **  ",
                        "******    ",
                        "**        ",
                        "**        ",
                        "**        ",
                        "**        "
                };
    }

    // method to print "S"
    public static String[] getSPattern() {
        return new String[]
                {
                        "   ***** ",
                        " **      ",
                        "**       ",
                        " **      ",
                        "   ***   ",
                        "      ** ",
                        "       **",
                        "      ** ",
                        " *****   "
                };
    }

    public static void main(String[] args) {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
        for(int i = 0; i < oPattern.length; i++){
            System.out.println(oPattern[i] + oPattern[i] + pPattern[i] + sPattern[i]);
        }
    }
}
