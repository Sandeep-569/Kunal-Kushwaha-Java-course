package binarysearch2d;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;

        boolean result = search(matrix, target);
        System.out.println("Output: " + result);
    }

    static boolean search(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        if (row == 0 || col == 0) {
            return false;
        }
        int start = 0;
        int end = row * col - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int r = mid / col;
            int c = mid % col;

            if (matrix[r][c] == target) return true;
            if (matrix[r][c] < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}