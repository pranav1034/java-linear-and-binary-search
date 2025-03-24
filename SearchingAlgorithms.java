import java.util.HashSet;

public class SearchingAlgorithms {

    // Function to find the first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] nums) {
        HashSet<Integer> visited = new HashSet<>();

        // Mark all positive numbers as visited
        for (int num : nums) {
            if (num > 0) {
                visited.add(num);
            }
        }

        // Find the first missing positive integer
        int missing = 1;
        while (visited.contains(missing)) {
            missing++;
        }

        return missing;
    }

    // Function to perform Binary Search on a sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int firstMissing = findFirstMissingPositive(nums);
        System.out.println("First Missing Positive Integer: " + firstMissing);

        int[] sortedArr = {1, 2, 4, 6, 8, 9, 11};
        int target = 8;
        int index = binarySearch(sortedArr, target);
        System.out.println("Index of Target (" + target + "): " + index);
    }
}