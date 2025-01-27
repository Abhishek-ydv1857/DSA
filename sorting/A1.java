public class A1{
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int i=0;i<arr.length-1-turn;i++){
                if(arr[i]>arr[i+1]){
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }

public static void printsort(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}    
    public static void main(String[] args) {
        int arr[] = {5,2,6,1,9,3,4};
        bubblesort(arr);
        printsort(arr);
    }
}