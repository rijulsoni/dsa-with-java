public class secondlargesmall {
    static int secondLargest(int arr[], int n) {
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < n; i++) {
            if (largest > arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 6, 7};
        int n = arr.length;
        int secondLargestElement = secondLargest(arr, n);
        System.out.println("The second largest element is: " + secondLargestElement);
    }
}
