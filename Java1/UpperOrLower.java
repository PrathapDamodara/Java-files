
import java.util.Scanner;
class UpperOrLower{
    public static void main(String args[]){
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        c=sc.next().charAt(0);
        
        if((c>='a' && c<='z')){
            System.out.println("lowercase");
        }
        else if(c>='A' && c<='Z'){
            System.out.println("Uppercase");
        }else{
            System.out.println("Digit");
        }
    }
}