abstract class Maps{
	abstract void show();
}
class WebMaps extends Maps{
	void show(){
		System.out.println("Web Maps: Bing Map, Google Map");
	}
}

public class AbstractClassDemo{
	public static void main(String[] args){
		WebMaps w= new WebMaps();
		w.show();
	}
}