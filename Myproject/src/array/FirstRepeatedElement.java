package array;

public class FirstRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstRepeatedElement na = new FirstRepeatedElement();

		na.first_Repeated_Elements();
	}

	public void first_Repeated_Elements() {
		int array[] = { 2, 4, 5, 2, 7, 2, 9 };
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i+1; j < array.length; j++) {
				if (array[i] == array[j]) {
					flag = true;

				}
			}
			if (flag == true) {
				System.out.println("First Repeated Array Element is:\n" + array[i]);
				break;
			}
			
		}
		if (flag == false) {
			System.out.println(" Not First Repeated Element in Array");
		}

	}
}
