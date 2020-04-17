import java.util.*;
public class salary_calc {
     public static void main(final String[] args) {
        int months, count;
        double rate, pay, salary;
        double totalPay = 0; 
      
        final double MIN_WAGE = 7.25;
        final double INCREMENT_R = 1.00;
        final double MONTH_DAYS = 21.6;
        final double WORK_HRS = 8;

        // create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter the number of months worked: ");
     months = keyboard.nextInt(); //store the value for months
    
     
     
     while (months < 1){
         System.out.println("Enter a 'positive' number for months worked: ");
         months = keyboard.nextInt();
     }
     
        System.out.print("Enter your starting per-hour payrate: $");
        rate = keyboard.nextDouble();
    
     while(rate < MIN_WAGE){
         System.out.print("Enter wage greater or equal to $"+ MIN_WAGE + "\n$" );
         rate = keyboard.nextDouble();
     }
     
        System.out.println("Your salary for each month is:\n");
     
     for ( count = 1, pay = rate; count <= months; count++, pay += INCREMENT_R){
            
            salary = pay * WORK_HRS * MONTH_DAYS;  
            System.out.printf("Month %d:\t\t$%.2f\n", count, salary);
            
            totalPay += salary;
	}  
    
     System.out.printf("Your total pay for the %d months worked is: $%.2f\n", months, totalPay );
	
    
        }
     
    }  
   
    

