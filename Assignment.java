import java.util.Scanner;
public class Assignment {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		boolean [] flight = new boolean [10];
		int economy = 5;
		int firstClass =0;

		
		for(int counter = 0; counter <= 10; counter++) {
			
		
			System.out.println("Enter 1 for first class: , 2 for Economy: ");
			int reply = input.nextInt();
		
			if(reply == 1 || reply == 2)
				
				if(reply==1) {
				
				flight[firstClass] = true;
				System.out.printf("Welcome to first class! Your seat number is: %d%n", (1+firstClass));
				firstClass++;
				
				}
				else if(firstClass == 4) {
					System.out.println("First Class is full, enter 2 to move to Economy: ");
				}
				else if(reply == 2) {
					flight[economy] = true;
					System.out.printf("Welcome to Economy Class! Your seat number is: %d%n", (1+economy));
					economy++;
				}
			

				}	
				
			}
}
