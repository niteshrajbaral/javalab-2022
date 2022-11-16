interface HumanInterface{
	String type="Human";
	public void study(String qualification);
}
interface AnimalInterface{
	public void eat();
	public void travel();
}
class PersonClass implements AnimalInterface, HumanInterface{
	public void eat(){
		System.out.println("Person eats");
	}
	public void travel(){
		System.out.println("Person travel");
	}
	public void study(String qualification){
		System.out.println(type+"studying"+qualification);
	}
	public int noOfLegs(){
		return 0;
	}
}
public class InterfaceDemo{
	public static void main(String args[]){
		PersonClass m= new PersonClass();
		m.eat();
		m.travel();
		m.study("BESE");
	}
}