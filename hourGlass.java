package thirdPackage;

public class hourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(9);
	}

	public static void printSquareStar(int num) {
		if (num < 5) {
			System.out.println("Invalid Value");
		} else {
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= num; j++) {
					if (i == 1 || j == 1 || i == num || j == num || j == 1 || i == j || j == (num - i + 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}

}
