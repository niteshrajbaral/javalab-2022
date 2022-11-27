public class ExpectionTraceDemo{
	public static void main(String[] args) {

		printAverage(100, 0);
		System.out.println("Exit main().");

	}

	public static void printAverage(int totalSum, int totalNumber) {

		try {

			int average = totalSum/totalNumber;
			System.out.println("Average = "+totalSum +" / " + totalNumber + " = " + average);

		} catch (ArithmeticException ae) {

			//The stack trace displayed by the default error handler shows the
			// sequence of method invocations that led up to the error
			ae.printStackTrace();
			System. out.println("Exception handled in" + "printAverage().");

		} finally {
			System.out.println("Finally done.");
		}
		System.out.println("Exit printAverage().");
	}
}