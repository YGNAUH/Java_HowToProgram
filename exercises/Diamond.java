import java.util.Scanner;
//adapted from ZhiHan Yan's C code for diamond printing
public class Diamond{
   public static void main(String[] args) {
    int i,j,k;
    System.out.printf("please enter an positive odd number");
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    for(i=1;i<=x;i++)
    {
        for(j=1;j<=x-i;j++)
        {
            System.out.printf(" ");
        }
        for(k=1;k<=i*2-1;k++)
        {
            System.out.printf("*");
        }
    System.out.printf("\n");
    }


    for(i=1;i<x;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.printf(" ");
        }
        for(k=1;k<=2*(x-i)-1;k++)
        {
            System.out.printf("*");
        }
    System.out.printf("\n");
    }
}
}
