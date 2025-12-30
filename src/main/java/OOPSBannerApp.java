import java.util.HashMap;

/**
 * OOPSBannerApp
 *
 * @author tharun
 * @version 1.0
 */

public class OOPSBannerApp {

    static public class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {return character;}

        public String[] getPattern() {return pattern;}
    }

    public static CharacterPatternMap[] createCharacterPatternMap() {
        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('P', getPPattern()),
                new CharacterPatternMap('S',  getSPattern())
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    // method to print the message
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int patternHeight = charMaps[0].getPattern().length;

        for (int row = 0; row < patternHeight; row++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                if (pattern != null)
                    System.out.print(pattern[row] + "  ");
            }
            System.out.println();
        }
    }


    // method to print "O"
    public static String[] getOPattern() {
        return new String[]
                {
                        "   ***   ",
                        " **   ** ",
                        "**     **",
                        "**     **",
                        "**     **",
                        "**     **",
                        "**     **",
                        " **   ** ",
                        "   ***   "
                };
    }

    // method to prin "P"
    public static String[] getPPattern() {
        return new String[]
                {
                        "******   ",
                        "**    ** ",
                        "**     **",
                        "**    ** ",
                        "******   ",
                        "**       ",
                        "**       ",
                        "**       ",
                        "**       "
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

    // creates a hashmap with key as char and value as pattern
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> map = new HashMap<>();
        map.put('O', getOPattern());
        map.put('P', getPPattern());
        map.put('S', getSPattern());
        return map;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> map) {
        int patternHeight = map.get('O').length;
        for (int row = 0; row < patternHeight; row++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = map.get(ch);
                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        CharacterPatternMap[] maps = createCharacterPatternMap();
        HashMap<Character, String[]> characterHashMap =  createCharacterMap();
        String message = "OOPS";
        displayBanner(message, characterHashMap);
//        printMessage(message, maps);
    }
}
