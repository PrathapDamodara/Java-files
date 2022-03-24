import java.util.Scanner;
class armstrong{

    public static void main(String[] args) {

        int num, number, temp, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        num=sc.nextInt();
        
        number = num;
        while (number != 0)
        {
            temp = number % 10;
            sum = sum + temp*temp*temp;
            number /= 10;
        }

        if(sum == num){
            System.out.println(num + " is an Armstrong number");
            }
        else{
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
