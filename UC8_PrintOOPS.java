import java.util.HashMap;
import java.util.Map;

public class UC8_PrintOOPS {

    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***  ",
                "*   * ",
                "*   * ",
                "*   * ",
                " ***  "
        });

        patternMap.put('P', new String[]{
                "****  ",
                "*   * ",
                "****  ",
                "*     ",
                "*     "
        });

        patternMap.put('S', new String[]{
                " **** ",
                "*     ",
                " ***  ",
                "     *",
                "****  "
        });

        return patternMap;
    }

    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                if (patternMap.containsKey(ch)) {
                    line.append(patternMap.get(ch)[row]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        String message = "OOPS";

        renderBanner(message, patternMap);
    }
}