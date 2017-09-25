/**
 * Algorithm for creating ZIP files
 *
 * @author Viacheslav Oleshko
 */
public class ZipStrategy implements Strategy{
    @Override
    public void archive(String filePath) {
        System.out.println(String.format(
                "Creating ZIP archive for file %s", filePath));
    }
}
