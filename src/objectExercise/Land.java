package objectExercise;

public class Land extends Property{
	private String space;
	
	public String getSpace() {
		return this.space;
	}
	
	public void setSpace(String space) {
		this.space = space;
	}
	
	Land(String name,String owner,String kinds,String price,String space){
		super(name,owner,kinds,price,space);
		this.space = space;
	}
	
	public void infomation() {
		super.infomation();
		System.out.println("広さ："+this.space);
	}
}
