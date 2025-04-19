public class Sensor {
    public int id;
    public String location;
    public double temprature;
    public static int counter;
    public Sensor nexSensor;

    public Sensor(String location, double temprature){
        this.id = ++ counter;
        this.location = location;
        this.temprature = temprature;
        nexSensor = null;
        System.out.println("Sensor - " + id + " created");
    }
}
