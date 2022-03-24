import java.util.Scanner;
class LeapYrOrNot{
   public static void main(String[] args){
      int year;
      System.out.println("Enter Year:");
      Scanner sc = new Scanner(System.in);
      year=sc.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("It's a leap year");
      else
         System.out.println("It's not a Leap year once check the year you entered");
   }
}
