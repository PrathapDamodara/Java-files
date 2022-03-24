
import java.util.Scanner;
class AlphabetOrDigitOrSplChar{
    public static void main(String args[]){
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        c=sc.next().charAt(0);
        
        if((c>='a' && c<='z')||(c>='A' && c<='Z')){
            System.out.println("It is a Alphabet");
        }
        else if(c>='0' && c<='9'){
            System.out.println("It is a Digit");
        }else{
            System.out.println("It is a Special Character");
        }
    }
}