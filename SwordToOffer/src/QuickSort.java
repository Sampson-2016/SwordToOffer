public class QuickSort {
    /*快排*/
    public  static  void sort(int [] a,int start ,int end){
        if(start==end){
            return ;
        }
        int i=start,j=end;
        while (i<j) {
            while (a[i] <= a[j] && i < j) {
                j--;
            }
            if (a[i] > a[j]) {
                exchange(a, i, j);
                i++;
            }
            while (a[i] <= a[j] && i < j) {
                i++;
            }
            if (a[i] > a[j]) {
                exchange(a, i, j);
                j--;
            }
        }
        if(i!=start) {
            sort(a, start, i - 1);
        }
        if(i!=end) {
            sort(a, i + 1, end);
        }
    }
    public static void exchange(int []a,int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

    public static void main(String[] args) {
        int []a={1,3,7,4,2,9,5,10};
        sort(a,0,a.length-1);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
