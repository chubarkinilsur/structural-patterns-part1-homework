package chat;

public interface IClient {

    void sendMessage(Message message);

    void recieveMessage(Message message);
}
