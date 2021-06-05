package demo.test;

public class TryArray {

	public static void main(String[] args) {
	
	/* Declare Array
	 * int arrNumbers[];
	 * int[] arrNumbers;
	 * int[] arrNum = new int[2];
	 * 
	 * Declare & assign data
	 * int[] arrNumbers = {1, 5, 6};
	 * int[] arr = new int[] {12, 45};
	 */
		
		int[] arrOneDim = new int[5];
		
		arrOneDim[0] = 1;
		arrOneDim[1] = 2;
		arrOneDim[2] = 3;
		arrOneDim[3] = 4;
		arrOneDim[4] = 5;
		//arrOneDim[5] = 6;
		
		int arrSize = arrOneDim.length;
			System.out.println("Array Size : " + arrSize);
		
		for (int i =0; i< arrSize; i++)
			System.out.println(arrOneDim[i]);
		
		for(int arrNumber : arrOneDim)
			System.out.println(arrNumber);
		
		int[][] arrTwoDim = new int[2][3]; 
		//2*3 = 6 data can be stored
		// rows * columns
		int[][] arrTowDim = {{00, 01, 02}, 
							 {10, 11, 12}};
		arrTwoDim[0][0] = 00;
		arrTwoDim[0][1] = 01;
		arrTwoDim[0][2] = 02;
		arrTwoDim[1][0] = 10;
		arrTwoDim[1][1] = 11;
		arrTwoDim[1][2] = 12;
		
		int row = arrTwoDim.length;
		int col = arrTwoDim[0].length;
		System.out.println("Row size : " + row);
		System.out.println("Column size : " + col);
		
		for(int i = 0; i < row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.println("Row num is : "+ i + " Column no is : " + j + " Data is : " + arrTwoDim[i][j]);
			}
		}
						
	}

}
