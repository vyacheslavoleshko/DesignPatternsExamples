import util.SpaceAdder;

import java.util.List;

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

    @Override
    public void add(Data data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Data data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Data> getChilds() {
        throw new UnsupportedOperationException();
    }
}
