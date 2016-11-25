package session3;

import java.util.Arrays;

class SampleArray {

	void Reverse(int[] input) {
		System.out.println("Input Array is: " + Arrays.toString(input));

	/*	if (Input == null || Input.length <= 1) {
			System.out.println("The input array is null or empty");
			return;
		} else {
			System.out.println("Size of Array is: " + Input.length);
		}   */

		for (int i = 0; i < input.length / 2; i++) {

			int temp = input[i];
			// swap numbers
			input[i] = input[input.length - 1 - i];
			input[input.length - 1 - i] = temp;

		}

		System.out.println("Reversed array is: " + Arrays.toString(input));
	}

}

public class ReverseArray {

	public static void main(String[] args) {
		SampleArray samplearray = new SampleArray();

		int[] numbers = { 10, 20, 30, 40, 50, 60 };
		samplearray.Reverse(numbers);

	}

}
