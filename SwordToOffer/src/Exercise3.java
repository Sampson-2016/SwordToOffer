/*二维数组中，每一行按从左到右递增，每一列按从上到下递增，查询一个数是否在数组中*/
public class Exercise3 {
    public static void main(String[] args) {
        int [][] data = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(search(data,7));
        System.out.println(search(data,1));
        System.out.println(search(data,13));
        System.out.println(search(data,3));
    }
    public static boolean search(int [][] data,int s) {
        int rows = data.length - 1;
        int cloumns = data[0].length - 1;
        int row = 0;
        while (row <= rows && cloumns >= 0) {
            if (data[row][cloumns] == s) {
                return true;
            } else if (data[row][cloumns] > s) {
                cloumns--;
            } else {
                row++;
            }

        }
        return false;
    }
}
