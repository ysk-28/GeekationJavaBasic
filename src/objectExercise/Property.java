package objectExercise;

public class Property {
	protected String name;
	protected String owner;
	protected String kinds;
	protected String price;
	
	Property(String name,String owner,String kinds,String price,String space){
		this.name = name;
		this.owner = owner;
		this.kinds = kinds;
		this.price = price;
		}
	
	public String getName() {
		return this.name;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public String getKinds() {
		return this.kinds;
	}
	
	public String getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public void infomation(){
		System.out.println("物件名："+this.name);
		System.out.println("物件所有者名："+this.owner);
		System.out.println("物件種別："+this.kinds);
		System.out.println("物件価格："+this.price);
		}
	}