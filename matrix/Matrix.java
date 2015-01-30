package matrix;

public class Matrix {
	int col;
	int row;
	public int[][] matrix;

	public Matrix(int row, int col) {
		matrix = new int[row][col];
		this.col = col;
		this.row = row;
		int r = 0;
		int c = 0;
		while (r < row) {
			while (c < col) {
				matrix[r][c] = 1;
				c++;
			}
			c = 0;
			r++;
		}

	}

	public void setElement(int row, int col, int value) {
		matrix[row][col] = value;

	}

	public void setRow(int row, String value) {
		String[] strArray = value.split(",");
		if (strArray.length == col && row < this.row) {
			int[] input = new int[strArray.length];
			for (int i = 0; i < strArray.length; i++) {
				input[i] = Integer.parseInt(strArray[i]);
			}
			matrix[row] = input;
		} else {
			System.out.println("wrong input");
		}

	}

	public void setColumn(int col, String value) {
		String[] strArray = value.split(",");
		if (strArray.length == row && col < this.col) {
			int[] input = new int[strArray.length];
			for (int i = 0; i < strArray.length; i++) {
				input[i] = Integer.parseInt(strArray[i]);
			}
			for (int i = 0; i < input.length; i++) {
				matrix[i][col] = input[i];
			}
		} else {
			System.out.println("wrong input");
		}

	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder(""); 
		for(int i =0;i< this.row ; i++){
			for(int j = 0; j < this.col; j++){
				sb.append(""+matrix[i][j]);
				while(j<this.col-1){
					sb.append(",");
				}								
			}
			while(i<this.row-1){
				sb.append(";");
			}
			
			i++;
		}
		return sb.toString();
	}

	public void prettyPrint() {
		int r = 0;
		int c = 0;
		while (r < row) {
			while (c < col) {
				System.out.print(matrix[r][c] + "\t");
				c++;
			}
			System.out.println();
			c = 0;
			r++;
		}
	}

}