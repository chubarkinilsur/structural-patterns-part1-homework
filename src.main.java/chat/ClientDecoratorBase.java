package chat;

public class ClientDecoratorBase implements IClient {

    protected IClient client;

    public ClientDecoratorBase(IClient client) {
        this.client = client;
    }

    @Override
    public void sendMessage(Message message) {
        client.sendMessage(message);
    }

    @Override
    public void recieveMessage(Message message) {
         client.recieveMessage(message);
    }
}
