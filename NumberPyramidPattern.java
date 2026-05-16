
package numberpyramidpattern;
import java.util.*;

public class NumberPyramidPattern {

    public static void main(String[] args) {
      Scanner obj=new Scanner (System.in);
      
       int n=obj.nextInt();

 for(int i=1;i<=n;i++){
 //space
 for(int j=1;j<=n-i;j++){
  System.out.print(" ");
     }
   for  (int j=1;j<=i;j++){

  System.out.print( i+" ");
        
   } 
   System.out.println();
   }    
        
    }
    
}
