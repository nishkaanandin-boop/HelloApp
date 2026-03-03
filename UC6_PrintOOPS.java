public class UC6_PrintOOPS {

    public static void main(String[] args) {

        String[] banner = {
                buildLine(0),
                buildLine(1),
                buildLine(2),
                buildLine(3),
                buildLine(4),
                buildLine(5),
                buildLine(6)
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Combines O O P S for each row
    public static String buildLine(int row) {
        return getOPattern(row) + getO2Pattern(row) + getPPattern(row) + getSPattern(row);
    }

    // First O
    public static String getOPattern(int row) {
        String[] O = {
                "   ***   ",
                " **   ** ",
                "**    ** ",
                "**    ** ",
                "**    ** ",
                " **  **  ",
                "   ***   "
        };
        return O[row];
    }

    // Second O (spacing exactly as you typed)
    public static String getO2Pattern(int row) {
        String[] O2 = {
                "   ***    ",
                " **    ** ",
                " **    ** ",
                " **    ** ",
                " **    ** ",
                "  **   **  ",
                "   ***    "
        };
        return O2[row];
    }

    // P pattern
    public static String getPPattern(int row) {
        String[] P = {
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                " **       "
        };
        return P[row];
    }

    // S pattern
    public static String getSPattern(int row) {
        String[] S = {
                "   ***** ",
                " **      ",
                " **      ",
                "  *****  ",
                "      ** ",
                " **  **  ",
                "  ****   "
        };
        return S[row];
    }
}