import java.util.Scanner;
class negativeNumInArray{
public static void main(String args[]){
int ar[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter array values:");
for(int i=0;i<5;i++)
{
    ar[i]=sc.nextInt();
     if(ar[i]<0){
        System.out.println("The Negative values in Array are:"+ar[i]);
    }
}
}
}