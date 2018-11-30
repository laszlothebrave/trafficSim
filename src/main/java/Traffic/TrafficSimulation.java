package Traffic;

import javax.json.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;

public class TrafficSimulation {
    private static ArrayList<Car> carsInMotion = new ArrayList<>();
    private static ArrayList<Road> roads = new ArrayList<>();

    public static void main(String[] args) {
        final Date startDate = new Date(1000000000000L);                               //[ms] since January 1, 1970, 00:00:00 GMT
        System.out.println("Simulation starts:   " + startDate.toString());
        final Date finishDate = new Date(1000000010000L);                              //[ms] since January 1, 1970, 00:00:00 GMT
        System.out.println("Simulation ends:     " + finishDate.toString());
        final long timeStep = 100;                                                    //[ms]
        Date currentDate = (Date) startDate.clone();
        createCars();
        while (currentDate.before(finishDate)) {
            System.out.println("Steps until finish:     " + (finishDate.getTime() - currentDate.getTime()) / 1000);
            currentDate.setTime(currentDate.getTime() + timeStep);
            continueToDrive();
        }
        parseJason();
    }

    private static void createCars() {
        carsInMotion.add(new Car(25,4,10,500));
        carsInMotion.add(new Car(20,3,8,500));
        carsInMotion.add(new Car(15,2,6,500));
    }

    private static void continueToDrive() {
        for (Car car: carsInMotion) {

        }
    }

    private static void creatRoads() {
        roads.add(new Road());
        roads.add(new Road());
        roads.get(0).firstDirection.add(new Line());
        roads.get(1).firstDirection.add(new Line());
        roads.get(0).secondDirection.add(new Line());
        roads.get(1).secondDirection.add(new Line());

    }

    private static void parseJason(){
        File jsonInputFile = new File("C:\\Users\\laszlothebrave\\IdeaProjects\\trafficSim\\src\\main\\resources\\export.geojson");
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            JsonReader reader = Json.createReader(is);
            JsonObject empObj = reader.readObject();
            reader.close();
            JsonArray arrObj = empObj.getJsonArray("features");
            ArrayList<LinePoint> Points =  new ArrayList<>();
            for (JsonValue road : arrObj){
                JsonArray cor = road.asJsonObject().getJsonObject("geometry").getJsonArray("coordinates");
                for(JsonValue c : cor){
                    System.out.println(cor.getJsonArray(0).get(0));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
