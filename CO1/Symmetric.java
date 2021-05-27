import java.util.Arrays;
import java.util.Scanner;

public class Symmetric {
    public static void main(String[] args) {
        int row, col;
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter no. of Rows: ");
        row = input.nextInt();
        System.out.print("Enter no. of Columns: ");
        col = input.nextInt();

        if (row == col) {
            SymMatrix matrix = new SymMatrix(row, col);
            SymMatrix trans = new SymMatrix(row, col);

            System.out.println("Enter Elements: ");
            matrix.read();
            trans.mat = matrix.transpose();
            System.out.print("Transpose: ");
            trans.display();

            if (Arrays.deepEquals(matrix.mat, trans.mat))
                System.out.print("\nThe Matrix is Symmetric!");
            else
                System.out.print("\nThe Matrix is not Symmetric");
        } else {
            System.out.println("Only Square matrix can be Sysmmetric!");
        }

        input.close();
    }
}

class SymMatrix {

    int[][] mat;
    int row, col;
    Scanner input = new Scanner(System.in);

    SymMatrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.mat = new int[row][col];
    }

    void read() {
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                this.mat[i][j] = input.nextInt();
    }

    void display() {
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++)
                System.out.print(this.mat[i][j] + " ");
        }
    }

    int[][] transpose() {
        int[][] trans = new int[row][col];
        for (int i = 0; i < this.row; i++)
            for (int j = 0; j < this.col; j++)
                trans[i][j] = this.mat[j][i];
        return trans;
    }

}
