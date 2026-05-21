
package butterflypattern;
import java.util.*;

public class ButterflyPattern {

  
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter number of N:");
        int n=obj.nextInt();

  //upper halp
   for(int i=1;i<=n;i++){

   for(int j=1;j<=i;j++){

   System.out.print("*");
   }

   //space
   int space=2*(n-i);
   for(int j=1;j<=space;j++){
    System.out.print(" ");
   }
   for(int j=1;j<=i;j++){

   System.out.print("*");
   }

   System.out.println();

   }
    //lower halp

    for(int i=n;i>=1;i--){

   for(int j=1;j<=i;j++){

   System.out.print("*");
   }

   //space
   int space=2*(n-i);
   for(int j=1;j<=space;j++){
    System.out.print(" ");
   }
   for(int j=1;j<=i;j++){

   System.out.print("*");
   }

   System.out.println();

   }
 
        
        
        
        
            }
    
}
