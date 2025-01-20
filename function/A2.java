
import java.util.*;

public class A2 {
    public static void add(int a,int b){
        
        int sum=a+b;
        System.out.println(sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a, b);
    }
}
