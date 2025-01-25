public class A4 {
    public static int Menuu(String menu[],String key){
        for(int i=0;i< menu.length;i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[]={"samso","pavbaji","burger","pizza"};
        String key = "burger";
        int result = Menuu(menu,key);
        if(result == -1){
            System.out.println("index not found");
        }
        else {
            System.out.println("Key present at index "+ result);
        }
    }
}
