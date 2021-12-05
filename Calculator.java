import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Calculator{
    int firstOper;
    int secondOper;
    public Calculator(int firstOper, int secondOper){
        this.firstOper=firstOper;
        this.secondOper=secondOper;
    }
    public int getProduct(){
        return firstOper*secondOper;
    }
    public int getQuotient(){
        return firstOper/secondOper;
    }
    public int getSum(){
        return firstOper+secondOper;
    }
    public int getDifference(){
        return firstOper-secondOper;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nWelcome to this Basic Calculator CLI Application!");
        System.out.print("Please enter the first operand: ");
        int theFirst=Integer.parseInt(input.readLine());
        System.out.print("Please enter the second operand: ");
        int theSecond=Integer.parseInt(input.readLine());
        Calculator calcu=new Calculator(theFirst, theSecond);
        System.out.println("\nPlease enter the arithmetic operation.");
        System.out.println("NOTE: '+' -> addition | '-' -> subtraction | '/' -> division | '*' -> multiplication");
        System.out.print(": ");
        String operand=input.readLine();
        if(operand.equals("*")){
            System.out.printf("The product is %d\n", calcu.getProduct());
        }
        else if(operand.equals("/")){
            System.out.printf("The quotient is %d\n", calcu.getQuotient());
        }
        else if(operand.equals("+")){
            System.out.printf("The sum is %d\n", calcu.getSum());
        }
        else if(operand.equals("-")){
            System.out.printf("The difference is %d\n", calcu.getDifference());
        }
        else{
            System.out.println("Invalid operand. Exiting program...");
        }
        System.out.println("Thank you for using our service!\n");
    }
}
