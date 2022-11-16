import myPackage.*;
public class PackageDemo{
	public static void main(String[] args){
		System.out.println("\n using <Animal> class in myPackage");
		Animal cat = new Animal();
		System.out.println(cat.eat("milk"));
		cat.makeSound("mew");

		System.out.println("\n\n Using <Food> class in myPackage\n");
		Foods obj= new Foods();
		obj.show();
	}
}