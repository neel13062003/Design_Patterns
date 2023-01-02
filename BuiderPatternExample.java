/*When so mnay anrudments in construct then we give only require arguments not all and maintaing their seuqnce is 
 * difficult so use Builder Design Pattern.
*/
//package builder;
class Vehicle{
    //required parameters
    private String engine;
    private int wheel;

    //optional parameters
    private int airBags;


    public String getEngine(){
        return this.engine;
    }
    public int getWheel(){
        return this.wheel;
    }
    public int getAirbags(){
        return this.airBags;
    }

    //Vehicle Constroctor is private we can't call from outside;
    //& Gettinh instance of builder
    private Vehicle(VehicleBuilder builder){
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.airBags = builder.airBags;
    }


    public static class VehicleBuilder{
        private String engine;
        private int wheel;

        private int airBags;

        //Constructor.
        public VehicleBuilder (String engine, int wheel){
            this.engine = engine;
            this.wheel = wheel;
        }
        //Constructor.
        public VehicleBuilder setairBags(int airBags){
            this.airBags= airBags;
            return this;
        }

        //Returning Vehicle Instances.
        public Vehicle build(){
            return new Vehicle(this); 
        }
    }
} 

public class BuiderPatternExample {
    public static void main(String[] args){
        Vehicle car =   new Vehicle.VehicleBuilder("1500cc",4).setairBags(4).build();
        Vehicle bike =  new Vehicle.VehicleBuilder("250cc",2).build();

        System.out.println("This All For Car");
        System.out.println(car.getEngine());
        System.out.println(car.getWheel());
        System.out.println(car.getAirbags());

        System.out.println();

        System.out.println("This All For Bike");
        System.out.println(bike.getEngine());
        System.out.println(bike.getWheel());
        System.out.println(bike.getAirbags());
    }
}

