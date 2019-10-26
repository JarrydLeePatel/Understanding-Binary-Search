//This is a simple java program to understand Binary Search
//IG Jarrydleepatel

import java.util.Scanner;

public class myBinarySearch {

	public static int size() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = input.nextInt();
		return size;
	}

	public static void main(String[] args) {
		
		int[] array = new int[size()];
		Scanner input = new Scanner(System.in);
		myBinarySearch a = new myBinarySearch();
		a.size();

		for (int i = 0; i < size(); i++) {

			array[i] = input.nextInt();

		}

		System.out.println("Which value are you looking for?");
		int num = input.nextInt();

		int low = 0;
		int high = size() - 1;
		int mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;

			if (array[mid] == num) {
				System.out.println("Value found at " + mid);//VALUE FOUND
				break;
			} else if (array[mid] > num) {
				high = mid - 1;
			} else if (num > array[mid]) {
				low = mid + 1;
			}
		}
		if (low > high) { // VALUE NOT FOUND
			System.out.println(" The value you are looking for is not found");
		}
	}

}
