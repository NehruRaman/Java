package string;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CarRuns {

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
		System.out.println("before sorting");
		for( CarObject b: ar) {
			System.out.println(b);
		}
		Scanner na = new Scanner(System.in);
		System.out.println("pls enter you option ");
	    String n = na.nextLine();
		//1= Namesort
			//	2= PriceSort;
		//3 = ModelSort;
		Comparator<Object> c= null;
		switch(n) {
		
		//car c = new maruthi()
		
		
		case "1": {
			c = new NameSort();
			
				break;
			}
		case "2": {
			c = new PriceSort();
			break;
		     }
		case "3": {
			c = new ModelSort();
			break;
			}
		case "4": {
			c = new FuelTypeSort();
			break;
			}
		case "5": {
			c = new Engine_ccSort();
			break;
			}
		case "6": {
			c = new ModelSort();
			break;
			}
		default : {
			System.out.println("pls enter valid option");
		}
		
		}
		
	Arrays.sort(ar, c);
	System.out.println("after sorting");
	for(CarObject ob : ar)
	{
		System.out.println(ob);	
	}
	na.close();
	}
	

}
