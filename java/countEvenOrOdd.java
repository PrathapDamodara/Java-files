import java.util.Scanner;
class countEvenOrOdd{
public static void main(String args[]){
int counteven=0,countodd=0;
int ar[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter array values:");
for(int i=0;i<5;i++)
{
    ar[i]=sc.nextInt();
     if(ar[i]%2==0){
        counteven++;
    }else{
        countodd++;
    }
}
System.out.println("Even numbers are:"+counteven);
System.out.println("Odd numbers are:"+countodd);
}
}