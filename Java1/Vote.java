import java.util.Scanner;
class Vote
{
    public static void main(String args[])
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
        
        if(age >= 18){
            System.out.println("you are eligible for vote");
        }else{
        System.out.println("Not Eligible for vote");
        }
    }
}