import java.util.Scanner;

public class SalesCommission {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int weeklyPay = 200;
		int[] array1 = new int[9];
		int total = 0;
		System.out.print("enter sales or -1 to quit: ");
		int sales = sc.nextInt();
		
		while(sales !=-1) {
			total = total+sales;
			
			System.out.print("enter sales or -1 to quit: ");
			sales = sc.nextInt();
		
		
		
			int grandSalesPlusWeeklyPay  =(weeklyPay + (total*9/100)); 
					
					System.out.println(grandSalesPlusWeeklyPay);
		
			if(grandSalesPlusWeeklyPay >= 200 && grandSalesPlusWeeklyPay<=299) {
				array1[0]++;
			}
			else if(grandSalesPlusWeeklyPay>=300 && grandSalesPlusWeeklyPay<=399){
				array1[1]++;
				
			}
			else if(grandSalesPlusWeeklyPay>=400 && grandSalesPlusWeeklyPay<=499) {
				array1[2]++;
				
			}
			else if(grandSalesPlusWeeklyPay>=500 && grandSalesPlusWeeklyPay<=599){
				array1[3]++;
			}
			
			else if(grandSalesPlusWeeklyPay>=600 && grandSalesPlusWeeklyPay<=699){
				array1[4]++;
			}
			
			else if(grandSalesPlusWeeklyPay>=700 && grandSalesPlusWeeklyPay<=799){
				array1[5]++;
			}
			else if(grandSalesPlusWeeklyPay>=800 && grandSalesPlusWeeklyPay<=899){
				array1[6]++;
			}
			else if(grandSalesPlusWeeklyPay>=900 && grandSalesPlusWeeklyPay<=999){
				array1[7]++;
			}
			else if(grandSalesPlusWeeklyPay>=1000 && grandSalesPlusWeeklyPay<=5000){
				array1[8]++;  
			}
			
		}	
		
		System.out.printf("%s%15s%n","Range","Frequency");
		System.out.printf("%s%11d%n","200-299",array1[0]);
		System.out.printf("%s%11d%n","300-399",array1[1]);
		System.out.printf("%s%11d%n","400-499",array1[2]);
		System.out.printf("%s%11d%n","500-599",array1[3]);
		System.out.printf("%s%11d%n","600-699",array1[4]);
		System.out.printf("%s%11d%n","700-799",array1[5]);
		System.out.printf("%s%11d%n","800-899",array1[6]);
		System.out.printf("%s%11d%n","900-999",array1[7]);
		System.out.printf("%s%11d%n","1000-5000",array1[8]);
		System.out.printf( "grandSalessWeekly");
		sc.close();
	}

}


