package chat;

public class Client implements IClient {

    private Message message;

    @Override
    public void sendMessage(Message message) {
        System.out.println(message);
    }

    @Override
    public void recieveMessage(Message message) {
        System.out.println(message);
    }
}
