import java.io.*;
public class ReadData {
	public int getInteger(){
	System.out.println("Write an Integer number:");
	String line = null;
	int value = 0;
	try {
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		line = is.readLine();
		value = Integer.parseInt(line);
	} catch (Exception e) {
		System.err.println("Unexpected IO ERROR: " + e);
	}
	return value;
	}
	public static void main(String[] args) {
		ReadData rd = new ReadData();
		int n1 = rd.getInteger();
		int n2 = rd.getInteger();
		int sum = n1+n2;
		System.out.println(" Integer: " + sum);
	}
}