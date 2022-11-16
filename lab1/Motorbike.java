public class Motorbike {
    int speed;
    String model;
    public Motorbike(String model) {
       this.model = model;
    }
    public void accelerate() {
    // add 1 km/hr
    speed = speed + 1;
    } 
    public void stop() {
    // set current speed to zero
    speed = 0;
	}
	public void printSpeed() {
	// display the current speed of this car
	System.out.println("Current speed of " + model + " is " + speed + " mpH");
	}
	public static void main(String[] args) {
	// create new Honda car
	Motorbike honda = new Motorbike("Honda");
	// create new Pulsar car
	Motorbike pulsar = new Motorbike("Pulsar");
	// print current speed of Honda
	honda.printSpeed();
	// call the accelerate method twice on Honda
	honda.accelerate();
	honda.accelerate();
	// call the accelerate method once on Pulsar
	pulsar.accelerate();
	// print current speed of Honda
	honda.printSpeed();
	// print current speed of Pulsar
	pulsar.printSpeed();
	// now park the Honda car
	honda.stop();
	// print current speed of Honda
	honda.printSpeed();
}
}