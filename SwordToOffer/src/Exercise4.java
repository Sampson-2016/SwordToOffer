/*把字符串每个空格替换成%20  test git*/
public class Exercise4 {
    public static void main(String[] args) {
        StringBuffer a =new StringBuffer("we are happy.") ;
        System.out.println(replace(a));
    }

    public static String replace(StringBuffer original){
        int n= 0,length=original.length();
        for (int i = 0; i < length; i++) {
            if(original.charAt(i)==' '){
                n++;
            }
        }
        char [] end = new char[2*n+length];
        for(int i = original.length()-1;i>=0&&n>0;i--){
            if(original.charAt(i)!=' '){
                end[i+2*n]=original.charAt(i);
            }else {
                end[i+2*n]='0';
                end[i+2*n-1]='2';
                end[i+2*n-2]='%';
                n--;
            }
        }
        String s = new String();
        for (int i = 0; i < end.length; i++) {
            s+=end[i];
        }
        return s;
    }


}
