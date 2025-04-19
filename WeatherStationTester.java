public class WeatherStationTester {
    public static void main(String[] args) {
    WeatherStation w1 = new WeatherStation(1);
    Sensor s1 = new Sensor( "A", 10);
    Sensor s2 = new Sensor( "B", 10);
    Sensor s3 = new Sensor( "C", 10);
    w1.addSensor(s1);
    w1.addSensor(s2);
    w1.addSensor(s3);
    WeatherStation.calculateAverage();

    }
}
