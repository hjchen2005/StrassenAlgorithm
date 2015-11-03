import java.util.*;

import javax.swing.JOptionPane;

public class MatrixMultiplication{
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Strassen Multiplication Algorithm Test\n");
	    /** Make an object of Strassen class **/
	    Strassen s = new Strassen();

	    System.out.println("Enter order n :");
	    int N = scan.nextInt();
	    /** Accept two 2d matrices **/
	    System.out.println("Enter N order matrix 1\n");
	    int[][] A = new int[N][N];
	    for (int i = 0; i < N; i++)
	        for (int j = 0; j < N; j++)
	            A[i][j] = scan.nextInt();

	    System.out.println("Enter N order matrix 2\n");
	    int[][] B = new int[N][N];
	    for (int i = 0; i < N; i++)
	        for (int j = 0; j < N; j++)
	            B[i][j] = scan.nextInt();

	    int[][] C = s.multiply(A, B);

	    System.out.println("\nProduct of matrices A and  B : ");
	    for (int i = 0; i < N; i++){
	        for (int j = 0; j < N; j++)
	            System.out.print(C[i][j] +" ");
	        System.out.println();
	    }
	    JOptionPane.showMessageDialog(null, "additions" + Strassen.count);
	}
	
}

