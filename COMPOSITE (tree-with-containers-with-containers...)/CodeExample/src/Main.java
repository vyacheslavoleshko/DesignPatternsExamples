/**
 * @author Viacheslav Oleshko
 */
public class Main {

    public static void main(String[] args) {
        // Generate FOLDERS
        Data documents  = new Folder("MY DOCUMENTS");
        Data music      = new Folder("Music");
        Data movies     = new Folder("Movies");
        Data workFiles  = new Folder("Work Files");
        Data linkinPark = new Folder("Linkin Park");

        // Generate FILES
        Data shawshankRedemption = new File("Shawshank Redemption.avi");
        Data workFile            = new File("App.java");
        Data oneMoreLight        = new File("One more light.mp3");
        Data leaveOutAllTheRest  = new File("Leave out all the rest.mp3");

        // Add FOLDERS to FOLDERS
        documents.add(workFiles);
        documents.add(movies);
        documents.add(music);

        // Add FILES to FOLDERS
        workFiles.add(workFile);
        movies.add(shawshankRedemption);
        music.add(linkinPark);
        linkinPark.add(oneMoreLight);
        linkinPark.add(leaveOutAllTheRest);

        // Display final TREE
        documents.display();
    }
}
