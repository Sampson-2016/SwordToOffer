public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(SingletonA.getInstance().hashCode());
        System.out.println(SingletonA.getInstance().hashCode());

        System.out.println(SingletonB.getInstance().hashCode());
        System.out.println(SingletonB.getInstance().hashCode());

        System.out.println(EasySingleton.instance.hashCode());
        System.out.println(EasySingleton.instance.hashCode());
    }
}


class  SingletonA{
    /*单例会在加载类后一开始就被初始化，没有调用 getInstance()方法。饿汉式的创建方式在一些场景中将无法使用：譬如 Singleton 实例的创建是依赖参数或者配置文件的，在 getInstance() 之前必须调用某个方法设置参数给它，那样这种单例写法就无法使用了*/
    private SingletonA(){
        System.out.println("SingletonA类加载时初始化，饿汉式单例！");
    }

    private static  final  SingletonA singletonA = new SingletonA();

    public  static SingletonA getInstance(){
        return  singletonA;
    }
}

class SingletonB{
/*这种写法仍然使用JVM本身机制保证了线程安全问题；由于 SingletonHolder 是私有的，除了 getInstance() 之外没有办法访问它，因此它是懒汉式的；同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK 版本*/
    private SingletonB(){
        System.out.println("SingletonB类，懒汉式单例");
    }
    public static final SingletonB getInstance(){
        return SingletonHolder.instance;
    }
    private static class SingletonHolder{
        private static final SingletonB instance = new SingletonB();
    }
}

/*通过EasySingleton.INSTANCE来访问实例，这比调用getInstance()方法简单多了。创建枚举默认就是线程安全的，所以不需要担心double checked locking，而且还能防止反序列化导致重新创建新的对象。*/
 enum EasySingleton{
    instance;
}