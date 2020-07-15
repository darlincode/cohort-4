import java.util.Random;
public class DiceRoll {

public static void main(String[] args) {
		int sum, dice1, dice2, actual = 0;
		int[] Total = new int[13];
		int[] ways = { 0, 0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };

		for (int i = 0; i < 36000; i++) {
			sum = 0;
			dice1 = new Random().nextInt(6) + 1;
			dice2 = new Random().nextInt(6) + 1;
			sum = dice1 + dice2;
			Total[sum]++;
			
		}

		for (int i = 0; i < 13; i++) actual += Total[i];

		System.out.printf("%-4s %s %-11s %s%n", "Sum", "Total", "Expected",
				"Actual");
		for (int i = 2; i < 13; i++)
			System.out.printf("%-4d %-5d %-10.5f %2.5f%n", i, Total[i],
					100.0 * ways[i] / 36, 100 * (double) Total[i] / actual);
				
	}
}