package Traffic;

final class Car implements Node{
    private int maxSpeed;          //   [m/s]
    private int maxAcceleration;   //   [m/s^2]
    private int maxDeceleration;   //   [m/s^2]
    private int reflex;            //   [ms]
    private double currentSpeed;   //   [m/s]


    Car(int maxSpeed, int maxAcceleration, int maxDeceleration, int reflex) {
        this.maxSpeed = maxSpeed;
        this.maxAcceleration = maxAcceleration;
        this.maxDeceleration = maxDeceleration;
        this.reflex = reflex;
        this.currentSpeed = 0;
    }
}
