import java.util.Scanner;
class BloodDonate
{
    public static void main(String args[])
    {
        int age,weight;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age");
        age = sc.nextInt();
        System.out.println("Enter Your weight");
        weight = sc.nextInt();
        if((age>=18)&&(weight>=50)){
            System.out.println("You can Donate the blood");
        }else{
    System.out.println("sry...you cannot donate the blood");
            
        }
        
    }
}