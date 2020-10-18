package chat;

public class Main {

    public static void main(String[] args) {

        IClient client = new Client();

        Message message = new Message("user", "toUser", "message body");
        client = new DecoratorBuilder(client)
                .withAuthorCript()
                .withBodyCript()
                .build();

        client.sendMessage(message);
        client.recieveMessage(message);
    }
}
