package string;

import java.util.Arrays;

public class CarObject implements Comparable<CarObject> {
	
	private String name;
	private int price;
	private String model;
	private String fuelType;
	private int engine_cc;
	private double mileage;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarObject car1 = new CarObject("BMW",9800000,"BM2","petrol",2993,10.13);
		CarObject car2 = new CarObject("lexus",9500000,"RX","hybride",2487,9.13);
		CarObject car3 = new CarObject("Benz",9200000,"A45s","petrol",1991,12.00);
		CarObject car4 = new CarObject("lamborghini",40000000,"urus","petrol",3993,14.00);
		CarObject car5 = new CarObject("kia",3000000,"carnivel","diesel",2993,14.09);
		CarObject car6 = new CarObject("hyundai",2800000,"tucson","petrol",1999,10.13);
		CarObject car7 = new CarObject("mini",4100000,"cooper","petrol",1998,14.13);
		CarObject car8 = new CarObject("toyoto",9800000,"Fortruner","petrol",2693,10.13);
		CarObject car9 = new CarObject("Audi",4800000,"A4","petrol",1993,17.13);
		
		CarObject[] ar = {car1,car2,car3,car4,car5,car6,car7,car8,car9}; 
		Arrays.sort(ar);
		for( CarObject b: ar) {
			System.out.println(b);
			//Arrays.sort(ar);
			
		}
	}
	public CarObject(String name, int price, String model, String fuelType, int engine_cc, double mileage) {
		super();
		this.name = name;
		this.price = price;
		this.model = model;
		this.fuelType = fuelType;
		this.engine_cc = engine_cc;
		this.mileage = mileage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getEngine_cc() {
		return engine_cc;
	}
	public void setEngine_cc(int engine_cc) {
		this.engine_cc = engine_cc;
	}
	@Override
	public String toString() {
		return "\nCarObject name = " + name + ", price = " + price + ", model = " + model + ", fuelType = " + fuelType
				+ ", engine_cc = " + engine_cc + ", mileage = " + mileage+"\n" ;
	}
	
	
	//Override
	public int compareTo( CarObject o) {
		
		 return this.getName().compareTo(o.getName()); 
		 }
		 
	/*public int compareTo(CarObject o) {
		 
		 if( this.getPrice()> o.getPrice()) {
			 return 1;
		 }
		 else if( this.getPrice()< o.getPrice()) {
			 return -1;
		 }
		 else 
			 return 0;
	 }*/
	
	
}
