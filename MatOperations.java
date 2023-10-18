import java.util.Scanner;

class MatAdd{

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements of matrix 1");
		System.out.println("Enter rows of matrix A");
		int rows1 = sc.nextInt();
		System.out.println("Enter columns of matrix A"); 
        int cols1 = sc.nextInt();
		int matA[][] = MatIN(rows1,cols1);


		System.out.println("Enter elements of matrix 2");
		System.out.println("Enter rows of matrix B");
		int rows2 = sc.nextInt();
		System.out.println("Enter columns of matrix B"); 
        int cols2 = sc.nextInt();
        int matB[][] = MatIN(rows1,cols1);
		System.out.println(" \n 1.Add MAtrices \n 2. Multiply them \n What do you want to do?:");
		int choice = sc.nextInt();
		switch (choice) {
			case 1:
				if(rows1 == rows2 && cols1 == cols2 ){
				int matC[][] = matAdd(matA,matB,rows1,cols1);
				System.out.println("Added mat is ");
				printMat(matC, rows1,cols1);
				}else{
					System.out.println("THese matrices cant be added");
				}
				
				break;
			case 2:
					if (cols1 == rows2){
						int matc[][] = matMultiply(matA,matB,rows1,cols1,cols2);	
					}
			default:
				break;
		}
		

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
	static int[][] matMultiply(int[][] mat1, int[][] mat2,int rows1, int cols1,int cols2){
		int[][] matC = new int[rows1][cols2];
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				matC[i][j] = 0;
				for (int k = 0; k < cols1; k++) {
					matC[i][j] += mat1[i][k] + mat2[j][k];
				}
			}
		}return matC;
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
