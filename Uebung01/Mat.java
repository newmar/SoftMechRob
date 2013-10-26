package uebungsblatt01;

public class Mat {
	public static void main(String[] args){
		double[][] mat1 = new double[3][2];			//a 3x2 Matrix
		double[][] mat2 = new double[2][3];			//a 2x3 Matrix
		double[][] columnVec1 = new double[3][1];	//a Vector with one column and 3 rows
		double[][] rowVec1 = new double[1][3];		//a Vector with 3 columns and 1 row
		
		//test sources
		mat1[0][0] = 4;
		mat1[0][1] = 3;
		mat1[1][0] = 2;
		mat1[1][1] = 8;
		mat1[2][0] = 4;
		mat1[2][1] = 2;
		
		mat2[0][0] = 5;
		mat2[0][1] = 6;
		mat2[0][2] = 7;
		mat2[1][0] = 1;
		mat2[1][1] = 3;
		mat2[1][2] = 20;
		
		columnVec1[0][0] = 5;
		columnVec1[1][0] = 6;
		columnVec1[2][0] = 3;
		
		rowVec1[0][0] = 6;
		rowVec1[0][1] = 2;
		rowVec1[0][2] = 9;
		
		//double[][] erg = matMatMult(mat1, mat2);
		double[][] erg = matMatMult(mat1, mat2);
		printMat(erg);
		erg = matMatMult(mat2, columnVec1);
		printMat(erg);
		erg = matMatMult(rowVec1, columnVec1);
		printMat(erg);
	}
	
	static double[][] matMatMult(double[][] m1, double[][] m2){
		double[][] result = null;
		double temp = 0;
		int resultRows = m1.length;
		int resultColumns = m2[0].length;
		if(m1[0].length == m2.length)
		{
			result = new double[resultRows][resultColumns];
			for(int i=0; i<m1.length; i++){
				for(int j=0; j<m2[0].length; j++){
					temp = 0;
					for(int k=0; k<m2.length; k++){
						temp += m1[i][k] * m2[k][j];
					}
					result[i][j] = temp;
				}
			}
		}
		return result;
	}
	
	static void printMat(double[][] mat){
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat[0].length; j++){
				System.out.print(mat[i][j] + ", ");
			}
			System.out.print("\n");
		}
		System.out.print("----------------------------\n");
	}
	
	static double[] rotationAlpha(double[] vec, double angle){
		double[] result = null;
		return result;
	}
}


