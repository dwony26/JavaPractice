package ObserverPattern;

public interface Publisher {
    public void add(Observer observer);
    public void delete(Observer observer);
    public void notifyObserver();
    public void notifyObserver(Observer observer);
}
