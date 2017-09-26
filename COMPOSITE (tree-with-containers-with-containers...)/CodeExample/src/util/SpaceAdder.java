package util;

/**
 * This is util class that isn't associated with pattern business logic.
 * Just adds spaces to output to make it beautiful
 *
 * @author Viacheslav Oleshko
 */
public class SpaceAdder {
    private static final int NUMBER_OF_SPACES = 3;

    public static final StringBuilder spaces = new StringBuilder();

    public static void addSpaces() {
        for (int i = 0; i < NUMBER_OF_SPACES; i++) {
            spaces.append(".");
        }
    }

    public static void removeSpaces() {
        spaces.setLength(spaces.length() - NUMBER_OF_SPACES);
    }
}
