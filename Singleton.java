public class Singleton {
    // Step 1: Make the default constructor private
    private Singleton() {}

    // Step 2: Create a static field to hold the single instance
    private static Singleton instance;

    // Step 3: Create a static method to return the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        // Perform some action here
    }
}
