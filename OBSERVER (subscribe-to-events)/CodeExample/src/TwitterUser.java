/**
 * Twitter user which are subscribers
 *
 * @author Viacheslav Oleshko
 */
public class TwitterUser implements Observer {
    private String nickName;
    private Subject twitterPost;

    public TwitterUser(String nickName, Subject twitterPost) {
        this.twitterPost = twitterPost;
        this.nickName = nickName;
    }

    @Override
    public void getNotification() {
        System.out.println(String.format("I'm %s and I was notified about tweet updates: %s",
                this.nickName,
                this.twitterPost.getState()));
    }
}
