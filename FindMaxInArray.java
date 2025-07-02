public class FindMaxInArray {

    public static int max(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contains at least two elements");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 4, 7, 3};
        System.out.println("The maximum number is : " + max(arr));

    }
}
