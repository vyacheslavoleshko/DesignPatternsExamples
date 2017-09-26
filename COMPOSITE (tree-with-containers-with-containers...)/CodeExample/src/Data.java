import java.util.List;

/**
 * @author Viacheslav Oleshko
 */
public interface Data {
    void display();
    void add(Data data);
    void remove(Data data);
    List<Data> getChilds();
}
