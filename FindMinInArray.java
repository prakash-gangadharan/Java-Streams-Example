public class FindMinInArray {
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 4, 7, 3};
        System.out.println("The minimum number is: " + min(arr));
    }
}
