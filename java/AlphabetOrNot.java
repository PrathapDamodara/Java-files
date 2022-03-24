import java.util.Scanner;
class AlphabetOrNot{
    public static void main(String args[]){
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        c=sc.next().charAt(0);
        
        if((c>='a' && c<='z')||(c>='A' && c<='Z')){
            System.out.println("It is Alphabet");
        }
        else{
            System.out.println("not alphabet");
        }
    }
}