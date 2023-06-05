package array;

import java.util.Scanner;

public class RotationArray {
	static int array[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                scanner();
        RotationArray na = new RotationArray();
        na.rotation();
	}

	static int[] scanner() {
		Scanner na = new Scanner(System.in);
		System.out.println("enter Size of Array 2 and above");
		int size = na.nextInt();
		array = new int[size];
		System.out.println("enter the elements");

		for (int i = 0; i < array.length; i++) {

			array[i] = na.nextInt();

		}

		na.close();
		return array;
	}

	public void rotation() {
		int temp = array[0];
		int i = 0;
		System.out.println("First Element Rotation Last Positon in Array");
		for (; i < array.length - 1; i++) {
			array[i] = array[i + 1];
			// System.out.println(array[i]);
		}
		array[i] = temp;
		for (int j = 0; j < array.length; j++) {

			System.out.println(array[j]);
		}
	}
}
