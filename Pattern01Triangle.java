
package pattern01triangle;


public class Pattern01Triangle {

    
    public static void main(String[] args) {
         int n=5;

  //outer loop
 for (int i = 1; i <= n; i++) {
// inner loop -> space print korar jonno
for (int j = 1; j <=i; j++) {
    int sum=i+j;
    if(sum%2==0){
    System.out.print("1 " );
    }
    else{
        System.out.print("0 " );
    }
}
    System.out.println();  
        
    }
    
}
}