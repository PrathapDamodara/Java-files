import java.util.Scanner;
class NumDiviBy{
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        num=sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("Number is Divisible");
        }else{
            System.out.println("Number is Not Divisible");
        }
    }
}