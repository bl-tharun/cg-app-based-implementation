/**
 * OOPSBannerApp
 *
 * @author tharun
 * @version 1.0
 */

public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] lines = {
                "   ***       ***    ******       *****",
                " **   **   **   **  **    **   **",
                "**     ** **     ** **     ** **",
                "**     ** **     ** **    **   **",
                "**     ** **     ** ******       ***",
                "**     ** **     ** **              **",
                "**     ** **     ** **               **",
                " **   **   **   **  **              **",
                "   ***       ***    **         *****"
        };
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
