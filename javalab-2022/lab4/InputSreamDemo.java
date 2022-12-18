import java.io.*
public class InputStreamDemo{
	public static void main (String[] args){
		String rawData=null;
		int intVal=0;
		System.out.print("Please input the integer: ");

		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			rawData=br.readLine();
			intVal=Integer.parseInt(rawData);
		}
		catch(NumberFormatException ex){
			System.out.println("Not a valid number: "+rawData);
		}
		catch(IOException e){
			System.out.println("Unwxpected IO ERROR: "+e);
		}
		System.out.println("Evaluated Integer value: "+intVal);
	}
}