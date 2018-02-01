/**
 * Created by Sampson on 2018/1/24
 */
public class Exercise9 {
/*斐波那契数列*/
    public static void main(String[] args) {
        System.out.println(Fn(1));
        System.out.println(Fn(2));
        System.out.println(Fn(3));
        System.out.println(Fn(4));
    }
    public static int Fn(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int f1=0;
        int f2=1;
        int f3=0;
        int i=2;
        while (i<=n){
             f3=f1+f2;
             f1=f2;
             f2=f3;
             i++;
        }
        return f3;
    }
}
