package basics.annotations;

public class Tyre {
	
	private String brand;
	
	public Tyre(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "brand = "+ brand;
				//super.toString();
	}

}
