package string;

import java.util.Comparator;

public class NameSort implements Comparator<Object> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		CarObject c1 = (CarObject)o1;
		CarObject c2 = (CarObject)o2;
		return c1.getName().compareTo(c2.getName());
	}


}
