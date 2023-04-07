import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the First Number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the Second Number: ");
            double num2 = input.nextDouble();

            System.out.println("Select an operation:-");
            System.out.println("0. Addition (a+b)");
            System.out.println("1. Subtraction (a-b)");
            System.out.println("2. Multiplication (a*b)");
            System.out.println("3. Division (a/b)");
            System.out.println("4. Power (a**b)");
            System.out.println("5. Remainder (a%b)");
            System.out.println("6. Logarithm (logb(a))");
            System.out.println("7. Bitwise XOR (a^b)");
            System.out.println("8. Bitwise OR (a|b)");
            System.out.println("9. Bitwise AND (a&b)");
            System.out.println("10. Bitwise NOT (a~b)");

            int operation = input.nextInt();

            double result = 0.0;

            switch (operation) {
                case 0:
                    result = num1+num2;
                    System.out.println("\nResult: " + result);
                    System.out.println("\n");
                    break;

                case 1:
                    result = num1-num2;
                    System.out.println("\nResult: " + result);
                    System.out.println("\n");
                    break;

                case 2:
                    result = num1*num2;
                    System.out.println("\nResult: " + result);
                    System.out.println("\n");
                    break;

                case 3:
                    if (num2!=0){
                        result = num1/num2;
                        System.out.println("\nResult: " + result);
                    }
                    else{
                        System.out.println("\nNot Defined!");
                    }
                    System.out.println("\n");
                    break;

                case 4:
                    if (num2!=0){
                        result = Math.pow(num1,num2);
                        System.out.println("\nResult: " + result);
                    }
                    else{
                        System.out.println("\nResult: 0.0");
                    }
                    System.out.println("\n");
                    break;
                
                case 5:
                    if (num2!=0){
                        result = num1%num2;
                        System.out.println("\nResult: " + result);
                    }
                    else{
                        System.out.println("\nResult: "+ num1);
                    }
                    System.out.println("\n");
                    break;
                
                case 6:
                    if (num2!=0 && num2!=1){
                        result = Math.log(num1)/Math.log(num2);
                        System.out.println("\nResult: " + result);
                    }
                    else{
                        System.out.println("\nNot Defined!");
                    }
                    System.out.println("\n");
                    break;
                    
                case 7:
                    result = (int)num1^(int)num2;
                    System.out.println("\nResult: " + result);
                    System.out.println("\n");
                    break;
                
                case 8:
                    result = (int)num1|(int)num2;
                    System.out.println("\nResult: " + result);
                    System.out.println("\n");
                    break;
                
                case 9:
                    result = (int)num1&(int)num2;
                    System.out.println("\nResult: " + result);
                    System.out.println("\n");
                    break;
                
                case 10:
                    result = (int)num1~(int)num2;
                    System.out.println("\nResult: " + result);
                    System.out.println("\n");
                    break;
                 
                default:
                    System.out.println("\nInvalid Input!");
                    System.out.println("\n");
                    break;
                
                
            }
        }
    }
}
