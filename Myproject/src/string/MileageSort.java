package string;

import java.util.Comparator;

public class MileageSort implements Comparator<Object> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		CarObject c1 = (CarObject)o1;
		CarObject c2 = (CarObject)o2;
		 if( c1.getPrice()> c2.getPrice()) {
			 return 1;
		 }
		 else if( c1.getPrice()< c2.getPrice()) {
			 return -1;
		 }
		 else 
			 return 0;
	}

}
