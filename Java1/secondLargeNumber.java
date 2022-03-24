import java.util.Scanner;
class secondLargeNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp;
        System.out.println("Enter array size");
        n=sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter array elements:");
        int size=ar.length;
        for(int i=0;i<n;i++)
        {
         ar[i]=sc.nextInt();   
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]>ar[j])
                {
                  temp=ar[i];
                  ar[i]=ar[j];
                  ar[j]=temp;
                }
            }
        }
            System.out.println("Second Largest Number in Array is :"+ar[size-2]);
    }
}
    