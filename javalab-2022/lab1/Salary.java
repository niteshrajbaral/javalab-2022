//Program#7
//Write a program that reads two numbers from the command line, the number of hours worked by an employee and their base pay rate. Add warning messages if the
// pay rate is less than the minimum wage (12.5 an hour ) or if the employee worked more than the number of hours in a week.
//Compile: <javac CalcWages.java>
//Run: <java CalcWages 30 50>
class Salary {
	public static void main (String[] args) {
		double hours = Double.valueOf(args[0]).doubleValue();
		double rate = Double.valueOf(args[1]).doubleValue();
		double pay;
		pay = rate * hours;
		System.out.println("The paycheck is " + pay + " dollars.");
		if ( rate < 12.5) {
			System.err.println("This employee is not getting the legally required minimum wage.");
		}
		if ( hours > 7*24) {
			System.err.println("Did this employee really work " + hours + " hours?");
	    }
	}
}