import java.util.Scanner;

 public class IT24101167Lab6Q3
 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double sumOfSquares=0;
        int count=0;

        System.out.println("Enter positive integers (terminate input with -99):");
        while (true) 
        {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            
            if (num == -99)
            {
            break; 
            }

            if (num < 0)
            {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sumOfSquares += Math.pow(num,2); 
            count=count+1;
         }
            if (count > 0)
            {
            double rms = Math.sqrt(sumOfSquares / count); 
            System.out.println("The Root Mean Square (RMS) is: " + rms);
            
            }
            else
            {
            System.out.println("No positive integers were entered.");
            }
         
      }
   }