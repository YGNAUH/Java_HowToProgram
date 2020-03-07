import java.util.Scanner;
public class Statement {
   public static void main(String[] args) {
      System.out.printf("while, for and while do");
      int counter = 1;
      int counterno2 = 1;
      int t = 0;
      int total2 = 0;
      int i = 1;
      int a = 1;

/************************************************************************
while
***********************************************************************/
      System.out.printf("while");
      while (counter <= 10) {
         System.out.printf("%d  ", counter);
         ++counter;
         t += counter;
      }
      System.out.printf("%d " , t);
      System.out.println();

/************************************************************************
for
***********************************************************************/
      System.out.printf("for");
      for (i = 1; i <= 10 ; i++ )
      {
        System.out.printf("%d ",counterno2);
        ++counterno2;
        total2 += counterno2;
      }
      System.out.printf("%d " , total2);
      System.out.println();

/********************************************************************
      break statement
*********************************************************************/
      System.out.printf("this break function uses with a for like above example");
      System.out.printf("\nbut with a break statement");
      for (i = 1; i <= 10 ; i++ )
      {
        System.out.printf("%d ",counterno2);
        ++counterno2;
        if(counterno2 == 15){
          break;
        }
      }
      System.out.println();


/**************************************************************************
      continue
**************************************************************************/
    System.out.printf("this code of continue statement is similar to break, but a different output");
    System.out.printf("\nbut with a break statement");
    for (i = 1; i <= 10 ; i++ )
    {
      System.out.printf("%d ",counterno2);
      if(i == 5){
        continue;
      }
      counterno2++;
    }
    System.out.println();

/****************************************************************************
for, another exple, intereste rate
****************************************************************************/
      System.out.println("for, another example, intereste rate");
      double principal = 1000.0; // initial amount before interest
      double rate = 0.05; // interest rate

      // display headers
      System.out.printf("%n%s%20s%n", "Year", "Amount on deposit");

      // calculate amount on deposit for each of ten years
      for (int year = 1; year <= 10; ++year) {
         // calculate new amount on deposit for specified year
         double amount = principal * Math.pow(1.0 + rate, year);

         // display the year and the amount
         System.out.printf("%4d%,20.2f%n", year, amount);
      }


/****************************************************************************
    while do
****************************************************************************/
      System.out.println("while do example");
      do{
        System.out.printf("%4d",a);
        ++a;
      }while(a<=10);
      System.out.println();

/****************************************************************************
      switch
****************************************************************************/

      System.out.println("switch");
      int total = 0; // sum of grades
      int gradeCounter = 0; // number of grades entered
      int aCount = 0; // count of A grades
      int bCount = 0; // count of B grades
      int cCount = 0; // count of C grades
      int dCount = 0; // count of D grades
      int fCount = 0; // count of F grades

      Scanner input = new Scanner(System.in);

      System.out.printf("%s%n%s%n   %s%n   %s%n",
         "Enter the integer grades in the range 0-100.",
         "Type the end-of-file indicator to terminate input:",
         "On UNIX/Linux/macOS type <Ctrl> d then press Enter",
         "On Windows type <Ctrl> z then press Enter");

      // loop until user enters the end-of-file indicator
      while (input.hasNext()) {
         int grade = input.nextInt(); // read grade
         total += grade; // add grade to total
         ++gradeCounter; // increment number of grades

         //  increment appropriate letter-grade counter
         switch (grade / 10) {
            case 9:  // grade was between 90
            case 10: // and 100, inclusive
               ++aCount;
               break; // exits switch
            case 8: // grade was between 80 and 89
               ++bCount;
               break; // exits switch
            case 7: // grade was between 70 and 79
               ++cCount;
               break; // exits switch
            case 6: // grade was between 60 and 69
               ++dCount;
               break; // exits switch
            default: // grade was less than 60
               ++fCount;
               break; // optional; exits switch anyway
         }
      }

      // display grade report
      System.out.printf("%nGrade Report:%n");

      // if user entered at least one grade...
      if (gradeCounter != 0) {
         // calculate average of all grades entered
         double average = (double) total / gradeCounter;

         // output summary of results
         System.out.printf("Total of the %d grades entered is %d%n",
            gradeCounter, total);
         System.out.printf("Class average is %.2f%n", average);
         System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
            "Number of students who received each grade:",
            "A: ", aCount,
            "B: ", bCount,
            "C: ", cCount,
            "D: ", dCount,
            "F: ", fCount);
      }
 }
}
