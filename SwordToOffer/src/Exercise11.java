/**
 * Created by Sampson on 2018/2/2
 */
public class Exercise11 {
    /*数值的整数次方*/
    public static void main(String[] args) {
        System.out.println(Power(10,-1));
        System.out.println(Power(10,2));
        System.out.println(Power(0,0));
        System.out.println(Power(0,10));
        System.out.println(Power(100,0));
    }
    public static double Power(double base,int exponent){
        if(base==0){
            return 0;
        }
        else if(exponent==0){
           return 1;
        }
        if(exponent<0){
            return 1/Power(base,-exponent);
        }
        double result=Power(base, exponent>>1);
        result *=result;
        if((exponent&0x1)==1){
            result*=base;
        }
        return  result;
    }
}
