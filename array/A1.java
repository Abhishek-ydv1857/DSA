import java.util.Scanner;

public class A1{
    public static void main(String[] args) {
        int marks[]=new int[50];
        int numbers[]={1,2,3,4,5};
        String fruits[]={"apple","mango"};
        System.out.println(fruits[1]);

        //input in array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three subject marks ");
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();


        System.out.println("eco " +marks[0]);
        System.out.println("acc " +marks[1]);
        System.out.println("bst " +marks[2]);

        //upadate marks 
        marks[1]= marks[1] + 3; //marks[1] = 97;
        System.out.println("upadate marks " +marks[1]);

        //to  find length of array
        System.out.println("length of array " +marks.length);
        
    }
}