
package solidrhombuspattern;
import java.util.*;

public class SolidRhombusPattern {

   
    public static void main(String[] args) {
      Scanner obj=new Scanner (System.in);
      System.out.print("Enter Number of N & M:");
      int n=obj.nextInt();
       int m=obj.nextInt();
    for(int i=1;i<=n;i++){

for(int j=1;j<=n-i;j++){
System.out.print(" ");
}
for(int j=1;j<=m;j++){

System.out.print("*");
}

System.out.println();

}      
        
        
        
        
    }
    
}
