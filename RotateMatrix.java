// 48. Rotate Image
// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

// Example 1:

// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]
// Example 2:

// Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
// Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

class RotateMatrix {
    public void rotate(int[][] matrix) {
        int[][] matrixRodada = new int[matrix.length][matrix[1].length];

        // matrixRodada[0][0] = matrix[matrix.length - 1][0];
        // matrixRodada[0][1] = matrix[matrix.length - 2][0];
        // matrixRodada[0][2] = matrix[matrix.length - 3][0];

        // matrixRodada[1][0] = matrix[matrix.length - 1][1];
        // matrixRodada[1][1] = matrix[matrix.length - 2][1];
        // matrixRodada[1][2] = matrix[matrix.length - 3][1];

        // matrixRodada[2][0] = matrix[matrix.length - 1][2];
        // matrixRodada[2][1] = matrix[matrix.length - 2][2];
        // matrixRodada[2][2] = matrix[matrix.length - 3][2];

        for(int i = matrix.length - 1; i > 0; i--){
            for(int j = 0; j < matrix[i].length ; j++){
                matrixRodada[i][j] = matrix[j][i];
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = matrixRodada[i][j];
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(rotate);
    }
}