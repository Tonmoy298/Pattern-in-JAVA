
package hollowpattern;
import java.util.*;

public class HollowPattern {

 
    public static void main(String[] args) {
    
     Scanner obj=new Scanner (System.in);
     System.out.println("Enter number of n:");
       int n = obj. nextInt() ;
      System.out.println("Enter number of m:");
       int m = obj .nextInt() ;
      for(int i=1;i<=n;i++) {
      for(int j=1;j<=m;j++){
       if(i==1||j==1||i==n||j==m) {  
       System.out.print("*");  
       }else{
        System.out.print(" ");  
       }
      }
      System.out.println(); 
      
      }
      

    }
    
}
