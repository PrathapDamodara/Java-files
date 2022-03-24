import java.util.Scanner;
class VowelOrConsonant{
    public static void main(String args[]){
        char i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        i=sc.next().charAt(0);
        
        if((i=='a')||(i=='e')||(i=='i')||(i=='o')||(i=='u')){
            System.out.println("It is Vowel");
        }
        else{
            System.out.println("It is Consonant");
        }
    }
}