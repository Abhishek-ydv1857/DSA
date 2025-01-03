public class A1 {
    public static void main(String[] args) {
        // Outer loop to control rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // After printing stars for each row, move to the next line
            System.out.println();
        }
    }
}
