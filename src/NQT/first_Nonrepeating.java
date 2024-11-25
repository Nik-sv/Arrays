public class first_Nonrepeating {
    public static int firstNonRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeating = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return arr[i];
            }
        }
        return 0; // No non-repeating element found
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 2};
        System.out.println(firstNonRepeating(arr));  // Output: 3
    }
}
