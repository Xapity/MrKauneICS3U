/*
October 2, 2018 
Callum MacLeod 
U1 A2
 */

package waterandcomputermanufacturing;
import java.util.Scanner;


public class WaterAndComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);//setting up scanner
        int num;//declaring variables
        final double GALLONS = 1.5;
        double ans;
        
        
        System.out.println("How many computer monitor combos do you have?");//intro line
        num=keyedInput.nextInt();//reads the inputted line
        ans=num*GALLONS;//answer equation
        System.out.println("You will need " + ans + " gallons of water.");//printed answer
        
     
    }
    
}
