import java.util.Scanner;
class minArray{
public static void main(String args[]){
int ar[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter array values:");
for(int i=0;i<5;i++)
{
    ar[i]=sc.nextInt();
}
int min=ar[0];
for(int i=0;i<5;i++)
{
    if(ar[i]<min)
    {
        min=ar[i];
    }
}
System.out.println("The min value of array is:"+min);
}
}