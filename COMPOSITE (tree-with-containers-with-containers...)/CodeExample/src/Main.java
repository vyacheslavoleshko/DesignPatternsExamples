/**
 * @author Viacheslav Oleshko
 */
public class Main {

    public static void main(String[] args) {
        Folder documents = new Folder("MY DOCUMENTS");
        Folder music = new Folder("Music");
        Folder movies = new Folder("Movies");
        Folder workFiles = new Folder("Work Files");
        Folder linkinPark = new Folder("Linkin Park");

        File shawshankRedemption = new File("Shawshank Redemption.avi");
        File workFile = new File("App.java");
        File oneMoreLight = new File("One more light.mp3");
        File leaveOutAllTheRest = new File("Leave out all the rest.mp3");

        documents.add(workFiles);
        documents.add(movies);
        documents.add(music);

        workFiles.add(workFile);

        movies.add(shawshankRedemption);

        music.add(linkinPark);

        linkinPark.add(oneMoreLight);
        linkinPark.add(leaveOutAllTheRest);

        documents.display();
    }
}
