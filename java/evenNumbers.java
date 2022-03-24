import java.util.Scanner;  
public class evenNumbers  
{  
public static void main(String[] args)   
{  
int n,i=2;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the limit: ");  
n = sc.nextInt();    
System.out.print("Lit of even numbers: ");  
while(i<=n)  
{  
System.out.print(i +" ");   
i=i+2;  
}     
}  
}  