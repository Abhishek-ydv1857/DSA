public class A2 {
    public static void Update(int marks[]){
        for(int i=0;i<=marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={87,96,83};
       
        for(int i=0;i<=marks.length;i++){
            System.out.println(marks[i] +" ");
        }
    }
}
