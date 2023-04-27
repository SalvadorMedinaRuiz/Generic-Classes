import java.util.Scanner;

public class extraCredit11232021 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int arrayNum = 0;
		System.out.println("Please enter 6 integers and press enter for each one: ");
		Integer[] numbers = new Integer[6];
		arrayNum=kb.nextInt();
		numbers[0] = arrayNum;
		arrayNum=kb.nextInt();
		numbers[1] = arrayNum;
		
		arrayNum=kb.nextInt();
		numbers[2] = arrayNum;
		arrayNum=kb.nextInt();
		numbers[3] = arrayNum;
		
		arrayNum=kb.nextInt();
		numbers[4] = arrayNum;
		arrayNum=kb.nextInt();
		numbers[5] = arrayNum;
		
		System.out.println("The biggest number is: " + max(numbers));
	}

	public static <E extends Comparable<E>> E max(E[] list) {
		E currentMax = list[0];
		for (int i = 0; i <= list.length - 1; i++) {
			E currentNum = list[i];
			if (currentNum.compareTo(currentMax) == 1) {
				currentMax = currentNum;
			}
		}
		return currentMax;
	}

}
