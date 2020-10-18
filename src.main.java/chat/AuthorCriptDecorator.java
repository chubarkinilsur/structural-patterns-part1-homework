package chat;

public class AuthorCriptDecorator extends ClientDecoratorBase {

    public AuthorCriptDecorator(IClient decoratee) {
        super(decoratee);
    }

    @Override
    public void sendMessage(Message message) {
        message.setAuthor("anonim");
        super.sendMessage(message);
    }
}
