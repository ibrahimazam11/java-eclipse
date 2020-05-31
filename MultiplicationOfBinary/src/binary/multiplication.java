package binary;

import java.util.Scanner;


class hello
{
 
public static void main(String[] args)
{
 
    int binary1, binary2, multiply = 0;
    int digit;
	int factor = 1;
 
    System.out.printf("Enter the first binary number: ");
    Scanner input=new Scanner(System.in);
    binary1=input.nextInt();
    System.out.println("Enter the second binary number: ");
    binary2=input.nextInt();
    while (binary2 != 0)
    {
        digit =  binary2 % 10;
        if (digit == 1)
        {
            binary1 = binary1 * factor;
            multiply = binaryproduct(binary1, multiply);
        }
        else
            binary1 = binary1 * factor;
        binary2 = binary2 / 10;
        factor = 10;
    }
    
 
    System.out.printf("Product of two binary numbers: %ld", multiply);
   
}
 
static int binaryproduct(int binary1, int binary2)
{
    int i = 0, remainder = 0;
    int[] sum = new int[10];
    int binaryprod = 0;
 
    while (binary1 != 0 || binary2 != 0)
    {
        sum[i++] =(binary1 % 10 + binary2 % 10 + remainder) % 2;
        remainder =(binary1 % 10 + binary2 % 10 + remainder) / 2;
        binary1 = binary1 / 10;
        binary2 = binary2 / 10;
    }
    if (remainder != 0)
        sum[i++] = remainder;
    --i;
    while (i >= 0)
        binaryprod = binaryprod * 10 + sum[i--];
    return binaryprod;
}}