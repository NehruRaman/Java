package string;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String input = "appleorange";
		findDuplicate(input);
	}

	static void findDuplicate(String s) {

		char ar[] = s.toCharArray();
		char temp[] = new char[ar.length];
		int countArray[] = new int[ar.length];

		int index = 0;
		for (int i = 0; i < ar.length; i++) {
			boolean flag = false;

			for (int j = 0; j < temp.length; j++) {

				if (ar[i] == temp[j]) {
					flag = true;
				}

			}
			// System.out.println(times);

			if (flag == false) {
				temp[index] = ar[i];
				index++;
			}

		}
		int ind = 0;
		for (int i = 0; i < ar.length; i++) {
			int times = 1;
			for (int j = i + 1; j < ar.length; j++) {
				if ((ar[i] == ar[j]) && (ar[j] != ' ')) {
					times++;
					ar[j] = ' ';
				}

			}
			if ( ar[i] != ' ' ) {
				countArray[ind] = times;
				ind++;
			}

		}

		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i] + " present " + countArray[i] + " times");
		}
	}

}


