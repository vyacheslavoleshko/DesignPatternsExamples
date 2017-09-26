import util.SpaceAdder;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite element
 *
 * @author Viacheslav Oleshko
 */
public class Folder implements Data {
    private String folderName;
    private List<Data> dataList;

    public Folder(String folderName) {
        this.folderName = folderName;
        dataList = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println(SpaceAdder.spaces + folderName);
        SpaceAdder.addSpaces();
        for (Data data : dataList) {
            data.display();
        }
        SpaceAdder.removeSpaces();
    }

    public void add(Data data) {
        dataList.add(data);
    }

    public void remove(Data data) {
        dataList.remove(data);
    }

    public List<Data> getChilds() {
        return dataList;
    }
}
