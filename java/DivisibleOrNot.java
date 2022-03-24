import java.util.Scanner;
class DivisibleOrNot
{
    public static void main(String args[])
    {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        number = sc.nextInt();
        
        if(number%2==0){
            System.out.println("Divisible");
        }else{
        System.out.println("Not Divisible");
        }
    }
}