import java.util.Scanner;
public class ArrayWork {
    public static void main(String[] args){
        int checkLengthOfInput = 0;
        int inputs = 0;
        int counter = 0;

        Scanner userInput = new Scanner(System.in);

        int[] limitForInputs = new int[5];

        while (checkLengthOfInput < limitForInputs.length){
            System.out.println("Enter Number:");
            inputs = userInput.nextInt();
            if((inputs < 10) || (inputs > 100)) {
                System.out.println("Enter Number:");
            	break;
            }

            if((inputs >= 10)  && (inputs <= 100) ){

                boolean inputDigits = false;

                checkLengthOfInput ++;

                for(int index = 0; index < limitForInputs.length; index++) {
                    if (limitForInputs[index] == inputs)
                        inputDigits = true;
                }

             if(!inputDigits) {
                 limitForInputs[counter] = inputs;

                 counter ++;
             } else {
                 System.out.printf("Number Existed. \n");
             }//innerif


            } else {
                System.out.println("Number Must be between 10 to 100.");
            }

            for(int indexTwo = 0; indexTwo < checkLengthOfInput; indexTwo ++){
                System.out.println("Added:" + limitForInputs[indexTwo] + "");
                System.out.println();
            }

          System.out.println();
        }




    }
}

