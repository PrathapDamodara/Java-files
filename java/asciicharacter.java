import java.util.Scanner;
class asciicharacter   
{  
public static void main(String[] args)   
{  
char ch1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character");
ch1= sc.next().charAt(0);
int ascii1 = (int) ch1;  
System.out.println("The ASCII value of " + ch1 + " is: " + ascii1);  
}  
}  