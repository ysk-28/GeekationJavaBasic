package objectExercise;

public class Apartment extends Property{
	private String floor;
	
	public String getFloor() {
		return this.floor;
	}
	
	public void setFloor(String floor) {
		this.floor = floor;
	}
	
	
	Apartment(String name,String owner,String kinds,String price,String floor){
		super(name,owner,kinds,price,floor);
		this.floor = floor;
	}
	
	public void infomation() {
		super.infomation();
		System.out.println("間取り："+this.floor);
	}
}
