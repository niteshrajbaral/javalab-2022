class Maps{
	void show(){
		System.out.println("Maps");
	}
}
class WebMaps extends Maps{
	void show(){
		System.out.println("Web Maps: Bing Map,Google Map");
	}
}
class PaperMaps extends Maps{
	void show(){
		System.out.println("Paper Maps: All Maps printed on paper");
	}
}
public class RunTimePolyDemo{
	public static void main(Strings[] args){
		Maps m = new Maps();
		WebMaps w= new WebMaps();
		PaperMaps p= new PaperMaps();

		m=w;
		m.show();
		
		m=p;
		m.show();

	}
}