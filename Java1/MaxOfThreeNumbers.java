import java.util.Scanner;
class MaxOfThreeNumbers{
    public static void main(String args[]){
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1");
        num1=sc.nextInt();
        System.out.println("Enter Number2");
        num2=sc.nextInt();
        System.out.println("Enter Number3");
        num3=sc.nextInt();
        
        if(num1>num2 && num1>num3)
        {
            System.out.println("Number1 is Maximum");
        }else if(num2>num1 && num2>num3){
            System.out.println("Number2 is Maximum");
        }else{
            System.out.println("Number3 is Maximum");
        }
    }
}