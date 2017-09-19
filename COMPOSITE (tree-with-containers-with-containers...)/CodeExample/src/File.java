import util.SpaceAdder;

/**
 * Leaf element
 *
 * @author Viacheslav Oleshko
 */
public class File implements Data {

    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println(SpaceAdder.spaces + fileName);
    }
}
