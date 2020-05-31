package fractionalBinary;

import java.util.Scanner;


public class q6
{
	static int add(int a, int b) {
        int partialSum, carry;
        do {
            partialSum = a ^ b;
            carry = (a & b) << 1;
            a = partialSum;
            b = carry;
        } while (carry != 0);
        return partialSum;
}
	static int subtract(int a, int b) 
	{
        return add(a, add(~b, 1));
}

	static int division(int dividend, int divisor) {
        boolean negative = false;
        if ((dividend & (1 << 31)) == (1 << 31)) { // Check for signed bit
            negative = !negative;
            dividend = add(~dividend, 1);  // Negation
        }
        if ((divisor & (1 << 31)) == (1 << 31)) {
            negative = !negative;
            divisor = add(~divisor, 1);  // Negation
        }
        int quotient = 0;
        long r;
        for (int i = 30; i >= 0; i = subtract(i, 1)) {
            r = (divisor << i);
           // Left shift divisor until it's smaller than dividend
            if (r < Integer.MAX_VALUE && r >= 0) { // Avoid cases where comparison between long and int doesn't make sense
                if (r <= dividend) { 
                    quotient |= (1 << i);    
                    dividend = subtract(dividend, (int) r);
                }
            }
        }
        if (negative) {
            quotient = add(~quotient, 1);
        }
        return quotient;
}

public static void main(String[] args)
{
	
	Scanner input = new Scanner(System.in);
    System.out.println("Enter any first binary number: ");
    int a = input.nextInt();
    System.out.println("Enter any second binary number: ");
    int b = input.nextInt();

    System.out.println(division(a,b));

}
}