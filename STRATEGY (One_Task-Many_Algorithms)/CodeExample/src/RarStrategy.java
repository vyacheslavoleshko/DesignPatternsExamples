/**
 * Algorithm for creating RAR files
 *
 * @author Viacheslav Oleshko
 */
public class RarStrategy implements Strategy{
    @Override
    public void archive(String filePath) {
        System.out.println(String.format(
                "Creating RAR archive for file %s", filePath));
    }
}
