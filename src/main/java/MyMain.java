import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in

    // scan.nextDouble() might be useful here
    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        // REPLACE THIS WITH YOUR CODE

        return scan.nextDouble();
    }

    // Takes a double money as input and returns the number of quarters that we
    // can return in change
    // You should use a while loop!
    public static int numQuarters(double money) {
        // REPLACE THIS WITH YOUR CODE
        int quartercount = 0;
        while(money>=0.25){
            money -= 0.25;
            quartercount ++;
        }
        return quartercount;
    }

    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double money) {
        // REPLACE THIS WITH YOUR CO    DE
        int dimecount = 0;
        while(money>=0.1){
            money -= 0.1;
            dimecount ++;
        }
        return dimecount;

    }

    // Takes a double money as input and returns the number of nickels that we
    // can return in change
    // You should use a while loop!
    public static int numNickels(double money) {
        // REPLACE THIS WITH YOUR CODE
        int nickelcount = 0;
        while(money>=0.05||Math.abs(money-0.05) < 3.1918912e-16){
            money -= 0.05;
            nickelcount ++;
            System.out.println(money);
        }
        return nickelcount;
    }

    // Takes a double money as input and returns the number of pennies that we
    // can return in change
    // You should use a while loop!

    public static int numPennies(double money) {
        // REPLACE THIS WITH YOUR CODE
        int pennycount = 0;
        while(Math.abs(money-0.01) > 0.0001){
            money -= 0.01;
            pennycount++;
        }
        return pennycount;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // You should test inputDouble yourself!
        double d = inputDouble();
        System.out.println(d + " in quarters would be: " + numQuarters(d) + " quarters."); //
        System.out.println(d +" in dimes would be: " + numDimes(d) + " dimes."); //
        System.out.println(d +" in nickels would be: " + numNickels(d) + " nickels."); //
        System.out.println(d +" in pennies would be: " + numPennies(d) + " pennies."); //

        // Some code to test numQuarters
        System.out.println("\nnumQuarters tests:");
        System.out.println("1.25 in quarters would be: " + numQuarters(1.25) + " quarters."); // 5
        System.out.println("10.55 in quarters would be: " + numQuarters(10.55) + " quarters."); // 42
        System.out.println("1000000.20 in quarters would be: " + numQuarters(1000000.20) + " quarters."); //4000000

        // Some code to test numDimes
        System.out.println("\nnumDimes tests:");
        System.out.println("1.20 in dimes would be: " + numDimes(1.20) + " dimes."); // 12
        System.out.println("120.13 in dimes would be: " + numDimes(120.13) + " dimes."); //1201
        System.out.println("150.25 in dimes would be: " + numDimes(150.25) + " dimes."); //1502

        scan.close();
    }
}