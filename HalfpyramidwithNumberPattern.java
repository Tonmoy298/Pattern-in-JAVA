
package halfpyramidwithnumberpattern;
import java.util.*;

public class HalfpyramidwithNumberPattern {

    
    public static void main(String[] args) {
     Scanner obj=new Scanner(System.in) ;
      System.out.print(" Enter number of N:");
    int n= obj.nextInt();  
    //outer loop
 for (int i = 1; i <= n; i++) {
// inner loop -> space print korar jonno
for (int j = 1; j <=i; j++) {
    System.out.print(j+" "); // Ekhane ekti space thakbe
}
  System.out.println();    

 }

    }
    
}
