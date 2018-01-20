public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(SingletonA.getInstance().hashCode());
        System.out.println(SingletonA.getInstance().hashCode());
    }
}

class  SingletonA{
    private SingletonA(){
        System.out.println("SingletonA");
    }

    private static  final  SingletonA singletonA = new SingletonA();

    public  static SingletonA getInstance(){
        return  singletonA;
    }
}
