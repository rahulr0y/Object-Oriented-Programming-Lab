import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        int rowA, colA, rowB, colB;
        Scanner input = new Scanner(System.in);

        System.out.println("\nMatrix A: ");
        System.out.print("No. of Rows: ");
        rowA = input.nextInt();
        System.out.print("No. of Columns: ");
        colA = input.nextInt();

        System.out.println("\nMatrix B: ");
        System.out.print("No. of Rows: ");
        rowB = input.nextInt();
        System.out.print("No. of Columns: ");
        colB = input.nextInt();

        if (rowA == rowB && colA == colB) {
            Matrix m1 = new Matrix(rowA, colA);
            Matrix m2 = new Matrix(rowB, colB);
            Matrix m3 = new Matrix(rowA, colA);

            System.out.print("\nEnter Matrix A: ");
            m1.read();
            System.out.print("\nEnter Matrix B: ");
            m2.read();

            m3 = m1.add(m2);
            System.out.print("\nMatrix A + Matrix B : ");
            m3.display();

            input.close();
        } else {
            System.out.println("\nSorry, Cannot add the Matrices!");
        }
    }
}

class Matrix {
    int[][] m;
    int row, col;
    Scanner input = new Scanner(System.in);

    public Matrix(int row, int col) {
        m = new int[row][col];
        this.row = row;
        this.col = col;
    }

    void read() {
        System.out.println();
        for (int i = 0; i < this.row; i++) {
            System.out.print("Enter Row " + (i + 1) + ": ");
            for (int j = 0; j < this.col; j++)
                this.m[i][j] = input.nextInt();
        }
    }

    void display() {

        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++)
                System.out.print(this.m[i][j] + "  ");
        }
    }

    Matrix add(Matrix m1) {
        Matrix mat = new Matrix(row, col);
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                mat.m[i][j] = this.m[i][j] + m1.m[i][j];
        return mat;
    }

}
