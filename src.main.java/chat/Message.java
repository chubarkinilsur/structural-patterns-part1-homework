package chat;

public class Message {
    private String author;

    public Message(String author, String to, String body) {
        this.author = author;
        this.to = to;
        this.body = body;
    }

    private String to;
    private String body;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Message{" +
                "author='" + author + '\'' +
                ", to='" + to + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
