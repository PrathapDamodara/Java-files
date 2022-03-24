import java.util.Scanner;
class factorial{
    public static void main(String args[]){
        int i,fact=1;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        num=sc.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
            }
            System.out.println(num+"*"+(num-1)+"*"+(num-2)+"*"+(num-3)+"*"+(num-4)+" = "+fact);
            
    }  
}  


