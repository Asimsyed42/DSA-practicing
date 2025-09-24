
package code;

import java.util.Arrays;

public class FlipAndInvertImage {
    
    /**
     * Flips the image horizontally and then inverts it.
     * @param image The n x n binary matrix
     * @return The resulting flipped and inverted image
     */
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] result = new int[n][n];
        
        // Flip horizontally and invert in one pass
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Flip horizontally: reverse each row
                // Invert: 0 becomes 1, 1 becomes 0
                result[i][j] = 1 - image[i][n - 1 - j];
            }
        }
        
        return result;
    }
    
    /**
     * Alternative implementation using in-place operations for better space efficiency
     * @param image The n x n binary matrix
     * @return The resulting flipped and inverted image (modified in place)
     */
    public static int[][] flipAndInvertImageInPlace(int[][] image) {
        int n = image.length;
        
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            
            // Flip and invert in one pass using two pointers
            while (left <= right) {
                // Swap and invert elements
                int temp = 1 - image[i][left];
                image[i][left] = 1 - image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
        }
        
        return image;
    }
    
    /**
     * Helper method to print a 2D matrix
     * @param matrix The matrix to print
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    /**
     * Test method to demonstrate the functionality
     */
    public static void main(String[] args) {
        // Test case 1: 3x3 matrix
        int[][] image1 = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };
        
        System.out.println("Original Image 1:");
        printMatrix(image1);
        
        int[][] result1 = flipAndInvertImage(image1);
        System.out.println("\nFlipped and Inverted Image 1:");
        printMatrix(result1);
        
        // Test case 2: 2x2 matrix
        int[][] image2 = {
            {1, 0},
            {0, 1}
        };
        
        System.out.println("\nOriginal Image 2:");
        printMatrix(image2);
        
        int[][] result2 = flipAndInvertImage(image2);
        System.out.println("\nFlipped and Inverted Image 2:");
        printMatrix(result2);
        
        // Test case 3: Single element
        int[][] image3 = {
            {1}
        };
        
        System.out.println("\nOriginal Image 3:");
        printMatrix(image3);
        
        int[][] result3 = flipAndInvertImage(image3);
        System.out.println("\nFlipped and Inverted Image 3:");
        printMatrix(result3);
        
        // Test in-place modification
        int[][] image4 = {
            {1, 1, 0, 0},
            {1, 0, 0, 1},
            {0, 1, 1, 1},
            {1, 0, 1, 0}
        };
        
        System.out.println("\nOriginal Image 4 (before in-place):");
        printMatrix(image4);
        
        flipAndInvertImageInPlace(image4);
        System.out.println("\nFlipped and Inverted Image 4 (in-place):");
        printMatrix(image4);
    }
}
