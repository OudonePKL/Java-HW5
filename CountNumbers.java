
// Count the number of eatch of the following numbers

// @author: Oudone PKL

public class CountNumbers {
    
    // For count the numbers
    public static void countNums() {
        int num = 113387600;
        String stringNum = Integer.toString(num);
        int[] arr = new int[stringNum.length()];
        int result = 0;
        
        // For get data to array
        for (int i = 0; i < stringNum.length(); i++) {
            arr[i] = stringNum.charAt(i) - '0';
        }

        // For show data to the screen
        for (int i = 0; i <= arr.length; i++) { // 0 1 2 3 4 5 6 7 8 9
            result = 0; // For reset data
            for (int j = 0; j < arr.length; j++) { // 0 1 2 3 4 5 6 7 8
                if (i == arr[j]) {
                    result++;
                }
            }
            System.out.println(i + " : " + result);
        }

    }
    
    public static void main(String[] args) {
        
        // Call the method
        countNums();
    }
}
