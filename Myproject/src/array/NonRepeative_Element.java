package array;

public class NonRepeative_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonRepeative_Element na = new NonRepeative_Element();
		na.nonRepeated_Elements();

	}
	public void nonRepeated_Elements() {
		int array[] = { 2, 4, 2, 3, 4,3, 2 };
		for (int i = 0; i < array.length; i++) {
		
                int count=0;
			for (int j =0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
                 
				}
			}
			if (count == 1) {
				System.out.println("Non Repeated Array Element is:\n" + array[i]);
				break;
			}
			if (i == array[array.length-1]) {
				System.out.println("Not non present Repeated array element");
			
		}
			
		}
	}

}
