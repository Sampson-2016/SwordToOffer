package njust.edu.cn;

/**
 * Created by Sampson on 2018/2/9
 */
public class Exercise20 {
    /*顺时针打印矩阵，输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如输入*/
/*   1  2  3  4
     5  6  7  8
     9  10 11 12
     13 14 15 16    输出1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 */
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printMatrix(a);
    }

    public static void printMatrix(int matrix[][]){
        int row = matrix.length;
        if(row ==0){
            return;
        }
        int column = matrix[0].length;
        if(column==0){
            return;
        }
        int n = 0;
        while ((2*n<row)&&(2*n<column)){
            for(int i=n;i<=(column-1-n);i++){
                System.out.print(matrix[n][i]+" ");
            }
            if(2*n==row-1){
                break;
            }
            for (int i = n+1; i <=row-1-n ; i++) {
                System.out.print(matrix[i][column-1-n]+" ");
            }
            if((column-2)>=2*n){
                for (int i = column-2-n; i >=n ; i--) {
                    System.out.print(matrix[row-1-n][i]+" ");
                }
            }
            if((row-3)>=2*n){
                for(int i = row-2-n;i>n;i--){
                    System.out.print(matrix[i][n]+" ");
                }
            }
            n++;

        }


    }
}
