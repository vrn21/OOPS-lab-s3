import java.util.Scanner;

class MatAdd{

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of matrix 1");
		System.out.println("Enter rows of matrices");
		int rows1 = sc.nextInt();
		System.out.println("Enter columns of matrices"); 
                int cols1 = sc.nextInt();
		int matA[][] = MatIN(rows1,cols1);
		System.out.println("Enter elements of matrix 2");
                int matB[][] = MatIN(rows1,cols1);
		int matC[][] = matAdd(matA,matB,rows1,cols1);
		System.out.println("Added mat is ");
		printMat(matC, rows1,cols1);


	}
	static int[][] MatIN(int m, int n){
		int mat[][] = new int[m][n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of matrix");
		for(int i = 0; i<m; i++){
			for(int j = 0; j<n; j++){
				System.out.println("Element " + i + " " + j);
				mat[i][j] = sc.nextInt();
			}
		}
		return mat;
	}

	static int[][] matAdd(int[][] m1, int[][] m2, int m, int n){
		int m3[][] = new int[m][n];
		for(int i = 0; i<m;i++){
			for(int j = 0; j<n;j++){
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
	return m3;
	}


	static void printMat(int[][] mat, int m,int n){
		for(int i = 0; i<m;i++){
			for (int j = 0; j<n; j++){
				System.out.print(" " + mat[i][j]);
			}
		System.out.println("\n ");
	}


}
}
