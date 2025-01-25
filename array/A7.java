public class A7 {
    public static void reverseArray(int arr[]){
        int first=0;
        int last=arr.length-1;

        while(first < last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        reverseArray(arr);
    }
}
