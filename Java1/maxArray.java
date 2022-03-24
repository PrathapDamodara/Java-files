import java.util.Scanner;
class maxArray{
    public static void main(String args[]){
int ar[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter array values:");
int max=ar[0];
for(int i=0;i<5;i++)
{
    ar[i]=sc.nextInt();
    if(max<ar[i])
    {
        max=ar[i];
    }
}
System.out.println("The max value of array is:"+max);
}
}