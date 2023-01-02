//Eager Initialisation
class SingletonEager{
    private static SingletonEager instance  = new SingletonEager();
    
    //constroctor
    private SingletonEager() { };

    //methods for returning the SingletonEager type
    public static SingletonEager getInstance(){
         return  instance; 
    }
}

//Lazy initialization  = Most Common.
//Whenever it is need or call then it will create a object.
//Here at a time multiple thread can access at same time

class Singleton {
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

    /*public void doSomething() {
        // Perform some action here
    }*/
}

//When multiple user wants to access same singleton then use synchronoized
//Here at a time only one thread can access
class SingletonSynchronizatiedMethod {
    // Step 1: Make the default constructor private
    private SingletonSynchronizatiedMethod() {}

    // Step 2: Create a static field to hold the single instance
    private static SingletonSynchronizatiedMethod instance;

    // Step 3: Create a static method to return the single instance
    public static synchronized SingletonSynchronizatiedMethod getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronizatiedMethod();
        }
        return instance;
    }

    /*public void doSomething() {
        // Perform some action here
    }*/
}

//For read not want to synchronise but want to perfrom some action for some part want to synchronize
//When multiple user wants to access same singleton then use synchronoized
//Here at a time only one thread can access
class SingletonSyn {
    // Step 1: Make the default constructor private
    private SingletonSyn() {}

    // Step 2: Create a static field to hold the single instance
    private static SingletonSyn instance;

    // Step 3: Create a static method to return the single instance
    public static  SingletonSyn getInstance() {
        if (instance == null) {
            synchronized(SingletonSyn.class);
            if (instance == null) {
                instance = new SingletonSynchronizatiedMethod();
            }
        }
        return instance;
    }

    /*public void doSomething() {
        // Perform some action here
    }*/
}




public class SingletonExample{
    public static void main(String[] args) {
        // Get the singleton instance
       /*  Singleton singleton = Singleton.getInstance();

        // Use the singleton instance to call the doSomething method
        singleton.doSomething();
        */

        //For Eager
        /*SingletonEager Instance1 = SingletonEager.getInstance();  //  Singleton   instance 
        System.out.println(Instance1);

        SingletonEager Instance2 = SingletonEager.getInstance();  //  Singleton   instance 
        System.out.println(Instance2);*/

        //For Lazy
        Singleton instance = Singleton.getInstance();  //  Singleton   instance 
        System.out.println(instance);

        Singleton instance2 = Singleton.getInstance();  //  Singleton   instance 
        System.out.println(instance2);   
    }
}
