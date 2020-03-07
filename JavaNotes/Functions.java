import java.util.Scanner;
import java.security.SecureRandom;

public class Functions {
  public static void main(String[] args) {
    //math: power function
    System.out.printf("This note is for searching functions you might need");
    System.out.println("\n power function: Math.pow");
    System.out.println("Math.pow(x,y)gives value of x raised to the yth power");
    double i = 1;
    for (i = 1; i<= 10 ; i++){
      double a = 2;
      a = Math.pow(a,i);
      System.out.println(a);
    }

    //input functin
    System.out.println("package needed: java.util.Scanner");
    System.out.println("scanner.nextInt(),read number from user");
    System.out.println("Scanner input = new Scanner(System.in)");
    System.out.println("int number = input.nextInt");
    System.out.println("int double = input.nextDouble");
    System.out.println("for example, enter a number");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.printf("num equals to %d",num);

    System.out.println("input.hasNext(), to make sure there is a input");
    Scanner scanner2 = new Scanner(System.in);
    System.out.printf("enter a number");
    while(scanner2.hasNext()){
      System.out.printf("there is an input");
      break;
    }

    //math function
    System.out.println("Math function uses double");
    System.out.println("Math.sqrt(x)");
    double a = Math.sqrt(900);
    System.out.println(a);
    double absolute_value = Math.abs(-50);
    System.out.println("Math.abs(x)");
    double ceil = Math.ceil(9.2);
    System.out.println("ceil rounds x to the least integer which not less than x");
    double floor = Math.floor(9.2);
    System.out.println("floor rounds x to the least integer which not greater than x");
    double exp = Math.exp(7);
    System.out.println("Math.exp(x)");
    double min = Math.min(0,500);
    System.out.println(min);
    double max = Math.max(0,500);
    System.out.println(max);
    double pow = Math.pow(2,2);
    System.out.println(pow);
    double pi = Math.PI;
    double sin = Math.sin(pi);
    System.out.println(sin);
    double cos = Math.cos(0.5*pi);
    System.out.println(cos);

    //random Number
    System.out.println("java.security.SecureRandom");
    SecureRandom randomnum = new SecureRandom();
    int rannum = randomnum.nextInt(6);
    System.out.println(rannum);
    //the difference between secure random and random (java.util) is the algotirhms behind them. secure random produces real random number





  }
}
