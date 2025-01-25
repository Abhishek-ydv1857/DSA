public class A5{
    public static void main(String[] args) {
        int num[]={1,53,34,543,5322,544,33,3,12444,44,44,44444};
        int largest=num[0];
        int slarge = Integer.MIN_VALUE;
        for(int i=1;i<num.length;i++){
            if(num[i] > largest){
                slarge = largest;
                largest = num[i];
            } else if(num[i] > slarge && slarge != largest){
                slarge = num[i];
            }
        }
        System.out.println(largest);
        System.out.println(slarge);
        // for(int i = 1; i < num.length; i++){
        //     if(num[i] > slarge && num[i] != largest){
        //         slarge = num[i];
        //     }
        // }
        // 
        
    }
}