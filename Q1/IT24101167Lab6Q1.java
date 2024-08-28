import java.util.Scanner;
  public class IT24101167Lab6Q1
  {
     public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        int number;
        double square,square_root;
        System.out.print("Enter a number: ");
        number = input.nextInt(); 
        square = Math.pow(number,2);
        square_root = Math.sqrt(number);
        System.out.println("The square of "+number+" is: "+square);
        System.out.println("The square root of "+number+" is: "+square_root);
      }
   }
        
        