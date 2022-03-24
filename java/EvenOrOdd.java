import java.util.Scanner;
class EvenOrOdd
{
    public static void main(String args[])
    {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        number = sc.nextInt();
        
        if(number%2==0){
            System.out.println("Even number");
        }else if(number%2==1){
        System.out.println("Odd number");
        }
    }
}