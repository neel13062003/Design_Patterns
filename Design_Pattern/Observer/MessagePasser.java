public class MessagePasser extends Observable {
    public void sendMessage(String message) {
        // Perform some message sending logic here
        notifyObservers(message);
    }
}

