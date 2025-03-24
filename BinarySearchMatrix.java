public class BinarySearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols]; // Convert 1D index to 2D row & col

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return false; // Element not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 4},
                {8, 9, 12},
                {15, 17, 20}
        };
        int target = 12;

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target found: " + found);
    }
}
