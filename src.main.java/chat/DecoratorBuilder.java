package chat;

public class DecoratorBuilder {

    private IClient client;

    public DecoratorBuilder(IClient client) {
        this.client = client;
    }

    public DecoratorBuilder withAuthorCript() {
        client = new AuthorCriptDecorator(client);
        return this;
    }

    public DecoratorBuilder withBodyCript() {
        client = new BodyCriptDecorator(client);
        return this;
    }

    public IClient build() {
        return client;
    }
}
