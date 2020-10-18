package chat;

public class BodyCriptDecorator extends ClientDecoratorBase {

    public BodyCriptDecorator(IClient decoratee) {
        super(decoratee);
    }

    @Override
    public void sendMessage(Message message) {
        message.setBody("<<<" + message.getBody() + ">>>");
        super.sendMessage(message);
    }

    @Override
    public void recieveMessage(Message message) {
        message.setBody(message.getBody().replaceAll("<", "").replaceAll(">", ""));
        super.recieveMessage(message);
    }

}
