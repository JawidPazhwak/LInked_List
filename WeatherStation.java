public class WeatherStation {
    public int id;
    public static double averageTemprature;
    public static Sensor firstSensor;

    public WeatherStation(int id){
        this.id = id;
        System.out.println("Station - " + id + " created");
    }

    public void addSensor(Sensor s){
        if(firstSensor == null){
            firstSensor = s;
            System.out.println(s.id + " added to the station " + id);
        }
        else{
            Sensor current = firstSensor;
            while(current.nexSensor != null){
                current = current.nexSensor;
            }
            current.nexSensor = s;
            System.out.println(s.id + " added to the station " + id);
        }
    }
    public static void calculateAverage(){
        if(firstSensor == null){
            System.out.println("No sensor available");
        }
        else{
            Sensor current = firstSensor;
            while(current != null){
                averageTemprature += current.temprature;
                current = current.nexSensor;
            }
            averageTemprature = averageTemprature / current.counter;
            System.out.println("Average Temprature: " + averageTemprature + " c");
        }
        
    }
}
