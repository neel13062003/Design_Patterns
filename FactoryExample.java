//Vehicle is super class.
abstract class Vehicle{
    //abstract method
    public abstract int getWheel();

    public String toString(){
        return "wheel : " + this.getWheel();
    }
}

//Two subclass Can and Bike
class Car extends Vehicle{
    int wheel;
    Car(int wheel) { 
        this.wheel = wheel;
    }
    @Override
    public int getWheel() {
        return this.wheel;
    }
}


class Bike extends Vehicle{
    int wheel;
    Bike(int wheel) { 
        this.wheel = wheel;
    }
    @Override
    public int getWheel() {
        return this.wheel;
    }
}

//Factory Class => Which is return instance of subclass.      
class VehicleFactory{
    public static Vehicle getInstance(String type,int wheel){
        if(type=="car"){
            return new Car(wheel);
        }else if(type=="bike"){
            return new Bike(wheel);
        }
        return null;
    }
}

//Client Class =? FactoryPatternExmaple
public class FactoryExample {
    public static void main(String[] args) throws Exception {
        Vehicle car = VehicleFactory.getInstance("car",4);
        System.out.println(car);
        
        Vehicle bike = VehicleFactory.getInstance("bike",2);
        System.out.println(bike);

    }
}


//Super class have many subclasses and their many change in future.So i need to create factory which would handle all things.
