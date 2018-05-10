package ObserverPattern;

public class EmailSubscriber implements Observer {
    private String newsString;
    private Publisher publisher;

    public EmailSubscriber(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    public void checkNews() {
        System.out.println("===뉴스 확인 ===");
        publisher.notifyObserver(this);
    }

    @Override
    public void update(String title, String news) {
        newsString = title + "\n------------------\n" + news;
        display();
    }

    public void display() {
        System.out.println("\n\n=== 이메일 유저 ===");
        System.out.println("\n\n" + newsString);
    }
}
