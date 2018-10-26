package Traffic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Stack;

public class TrafficSimulation {
    private static Stack<Car> carsOnParking = new Stack<>();
    private static ArrayList<Car> carsInMotion = new ArrayList<>();

    public static void main(String[] args) {
        final Date startDate = new Date(1000000000000L);                               //[ms] since January 1, 1970, 00:00:00 GMT
        System.out.println("Simulation starts:   " + startDate.toString());
        final Date finishDate = new Date(1000000010000L);                              //[ms] since January 1, 1970, 00:00:00 GMT
        System.out.println("Simulation ends:     " + finishDate.toString());
        final long timeStep = 1000;                                                    //[ms]
        Date currentDate = (Date) startDate.clone();
        createCars();
        while (currentDate.before(finishDate)) {
            setCarsInMotion();
            System.out.println("Steps until finish:     " + (finishDate.getTime() - currentDate.getTime()) / 1000);
            currentDate.setTime(currentDate.getTime() + timeStep);
            continueToDrive();
        }
        Path path = new Path();
    }

    private static void createCars() {
        carsOnParking.add(new Car(25,4,10,500));
        carsOnParking.add(new Car(20,3,8,500));
        carsOnParking.add(new Car(15,2,6,500));
    }

    private static void setCarsInMotion() {
        if (!carsOnParking.isEmpty()) {
            Car tmpCar = carsOnParking.pop();

            carsInMotion.add(tmpCar);
        }
    }

    private static void continueToDrive() {

        for (Car car: carsInMotion
             ) {
            car.drive();
        }
    }
}
