public class A3 {
    public static int linearSearch(int numbers[],int key){
        for(int i=1;i<=numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,3,5,6,8,10,13,15,18,19,22};
        int key=10;
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("index not found");
        }
        else {
            System.out.println("key index is " +index);
        }

        
    }
}
