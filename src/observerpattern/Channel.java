package observerpattern;

public interface Channel {
    public void subscribe(User user);
    public void unsubscribe(User user);
    public void sendNotification(String msg);
}
