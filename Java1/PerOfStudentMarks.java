import java.util.Scanner;
class PerOfStudentMarks{
    public static void main(String args[]){
        
        float percentage,result,maxmarks,total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mathematics Marks:");
        int mathematics= sc.nextInt();
        
        System.out.println("Enter Physics Marks:");
        int physics= sc.nextInt();
        
        System.out.println("Enter Chemistry Marks:");
        int chemistry= sc.nextInt();
        
        System.out.println("Enter Biology Marks:");
        int biology= sc.nextInt();
        
        System.out.println("Enter Computer Marks:");
        int computer= sc.nextInt();
        
        total=mathematics+physics+chemistry+biology+computer;
        System.out.println("Your total marks:"+total);
        
        System.out.println("Enter Maximum Marks:");
        maxmarks= sc.nextInt();
        
        result=total/maxmarks;
        
        percentage = result*100;
        System.out.println("Your percentage is:"+percentage);
        
        if(percentage>=90){
            System.out.println("GRADE A");
        }else if(percentage>=80){
            System.out.println("GRADE B");
        }else if(percentage>=70){
            System.out.println("GRADE C");
        }else if(percentage>=60){
            System.out.println("GRADE D");
        }else if(percentage>=40){
            System.out.println("GRADE E");
        }else if(percentage<40){
            System.out.println("GRADE F");
        }
    }
}