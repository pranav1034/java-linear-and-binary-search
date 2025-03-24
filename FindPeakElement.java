public class FindPeakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return arr[mid]; // Peak element found
            } else if (arr[mid] > arr[mid + 1]) {
                right = mid - 1; // Move to the left half
            } else {
                left = mid + 1; // Move to the right half
            }
        }
        return arr[left]; // Peak element found
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 9, 11, 13, 10};
        int peak = findPeakElement(arr);
        System.out.println("Peak element: " + peak);
    }
}
