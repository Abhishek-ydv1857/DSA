import java.util.*;

public class A3 {
    public static int Product(int a,int b){
       
        int multi=a*b;
        return multi;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a and b : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int print = Product(a, b);
        System.out.println(print);
    }
}
