public class multiCalculate {

    // For calculate the multiply
    public static void calMulti() {
        // Variable
        int multi = 5;
        int x = 1;

        // Processing
        for (int i = 1; i <= multi; i++) { //1 2 ... multi
            x = 1;
            for (int j = 1; j <= i; j++) { // 1 2 ... i
                
                System.out.print(multi + "*" + multi + "=" + (x * multi) + " ");
                x *= multi; // 1 * multi
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        // call the method
        calMulti();
    }
}
