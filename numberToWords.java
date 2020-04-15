package thirdPackage;

public class numberToWordsClass {

	public static void main(String[] args) {
	numberToWords(1000);
	}

	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
		}
		int rev = reverse(number);
		int count = getDigitCount(number);
		if (count > 0) {
			while (rev != 0) {
				int digit = rev % 10;
				count--;
				rev = rev / 10;
				switch (digit) {
				case 0:
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9:
					System.out.println("Nine");
					break;
				}
			}
			while (count != 0) {
				System.out.println("Zero");
				count--;
			}
		}

	}

	public static int reverse(int num) {
		int digit = 0;
		int temp = 0;

		while (num != 0) {
			digit = num % 10;
			temp = temp * 10 + digit;
			num = num / 10;

		}

		return temp;
	}

	public static int getDigitCount(int num) {
		int count = 0;
		if (num == 0) {
			return 1;
		}
		if (num < 0) {
			return -1;
		}
		while (num != 0) {
			num = num / 10;
			count++;

		}
		return count;
	}

}
