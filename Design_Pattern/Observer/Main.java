public class Main(){
    public static void main(String[] args) {
        MessagePasser messagePasser = new MessagePasser();

        UserGroup group1 = new UserGroup("Group 1");
        UserGroup group2 = new UserGroup("Group 2");

        messagePasser.addObserver(group1);
        messagePasser.addObserver(group2);

        messagePasser.sendMessage("Hello, World!");
    }
}
