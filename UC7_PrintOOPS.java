public class UC7_PrintOOPS {

    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap getCharacterPattern(char ch) {

        switch (ch) {

            case 'O':
                return new CharacterPatternMap('O', new String[]{
                        "  *****  ",
                        " **   ** ",
                        "**     **",
                        "**     **",
                        "**     **",
                        " **   ** ",
                        "  *****  "
                });

            case 'P':
                return new CharacterPatternMap('P', new String[]{
                        "******   ",
                        "**    ** ",
                        "**    ** ",
                        "******   ",
                        "**       ",
                        "**       ",
                        "**       "
                });

            case 'S':
                return new CharacterPatternMap('S', new String[]{
                        " ******  ",
                        "**       ",
                        "**       ",
                        " *****   ",
                        "      ** ",
                        "      ** ",
                        " ******  "
                });

            default:
                return null;
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";
        CharacterPatternMap[] letters = new CharacterPatternMap[word.length()];

        for (int i = 0; i < word.length(); i++) {
            letters[i] = getCharacterPattern(word.charAt(i));
        }

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap letter : letters) {
                line.append(letter.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}