class NonGCESException extends Exception{

	NonGCESException(String s){
		super(s);
	}
}
class OwnExceptionDemo{

	static void checkStudent (String collage) throws NonGCESException{ 
		if( collage != "GCES")
			throw new NonGCESException(" not a GCES buddy");
		else
			System.out.println("welcome to GCES");
	}
	public static void main(String args[]){
		try{
			checkStudent("PNC");
		}

		catch(Exception e){
			System.out.println("Exception occured: "+ e);
		}
		finally{
			System.out.println("END");
		}
	}
}
