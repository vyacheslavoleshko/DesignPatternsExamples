/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        TwitterPost post         = new TwitterPost("This is Observer pattern!");
        TwitterUser JoshuaBloch  = new TwitterUser("Joshua Bloch",  post);
        TwitterUser MartinFauler = new TwitterUser("Martin Fauler", post);
        post.attachObserver(JoshuaBloch);
        post.attachObserver(MartinFauler);
        post.changeState("Look, I changed state!");
    }
}
