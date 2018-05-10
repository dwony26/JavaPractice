package ObserverPattern;

public class AnnualSubscriber implements Observer {
    private String newsString;
    private Publisher publisher;

    public AnnualSubscriber(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        this.newsString = title + "\n------------------\n" + news;
        display();
    }

    public void display() {
        System.out.println("\n\n=== 정기 구독자 ===");
        System.out.println("\n\n" + newsString);    }
}
