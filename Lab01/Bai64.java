import java.util.Scanner;

public class Bai64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;
        System.out.println("Input size of Matrix: ");
        row = input.nextInt();
        col = input.nextInt();
        int ma1[][] = new int[row][col];
        int ma2[][] = new int[row][col];
        int sumMatrix[][] = new int[row][col];
        System.out.println("Input Matrix1: ");
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < col; ++j){
                ma1[i][j] = input.nextInt();
                sumMatrix[i][j] += ma1[i][j];
            }
        }
        System.out.println("Input Matrix2: ");
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < col; ++j){
                ma2[i][j] = input.nextInt();
                sumMatrix[i][j] += ma2[i][j];
            }
        }
        System.out.println("Sum of two matrix: ");
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < col; ++j){
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println("");
        }
        input.close();
    }
}
