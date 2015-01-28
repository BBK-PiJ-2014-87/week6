
package Arrays;

public class Array {
    public static void main(String[] args) {
        int [][] matrix = {{1,1,1},{2,2,2},{3,3,3}};

        int i = 0;
        int j = 0;
        while (i<3){
            while(j<3){

                System.out.print(matrix[i][j]);
                j++;
            }
            System.out.println();
            j=0;
            i++;
        }

    }
}

