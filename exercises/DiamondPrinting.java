import java.util.Scanner;
public class DiamondPrinting{
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("please enter how many rows to print");
     int rows = input.nextInt();
     for(int i = 1; i <= rows; i+=2){
       for(int space = 0; space <(rows-i)/2; space++){
         System.out.printf(" ");
       }
       for(int star = 0; star < i; star++){
         System.out.printf("*");
       }
       for(int space2 = 0; space2 <=(rows-i)/2; space2++){
        System.out.printf(" ");
        if(space2 == (rows-i)/2){
          System.out.printf("\n");
        }
      }
    }
      for(int i2 = rows-2; i2>=0; i2-=2){
        for(int space3 = 0; space3 <(rows-i2)/2; space3++){
          System.out.printf(" ");
        }
        for(int star2 = 0; star2 < i2; star2++){
          System.out.printf("*");
        }
        for(int space4 = 0; space4 <=(rows-i2)/2; space4++){
         System.out.printf(" ");
         if(space4 == (rows-i2)/2){
           System.out.printf("\n");
         }
      }
    }
   }
 }
