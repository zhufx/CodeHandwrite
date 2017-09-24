package DesignPattern;

/**
 * Created by zhufx on 2017/9/23.
 * Emai: it_zfx@126.com
 * Happy Life,Happy Coding
 */
public class Singleton {

    /*饿汉式和懒汉式区别
    从名字上来说，饿汉和懒汉，
    饿汉就是类一旦加载，就把单例初始化完成，保证getInstance的时候，单例是已经存在的了，
    而懒汉比较懒，只有当调用getInstance的时候，才回去初始化这个单例。
    另外从以下两点再区分以下这两种方式：*/


    /*2、资源加载和性能：
    饿汉式在类创建的同时就实例化一个静态对象出来，不管之后会不会使用这个单例，都会占据一定的内存，但是相应的，
    在第一次调用时速度也会更快，因为其资源已经初始化完成，
    而懒汉式顾名思义，会延迟加载，在第一次使用该单例的时候才会实例化对象出来，第一次调用时要做初始化，如果要
    做的工作比较多，性能上会有些延迟，之后就和饿汉式一样了。
    至于1、2、3这三种实现又有些区别，
    第1种，在方法调用上加了同步，虽然线程安全了，但是每次都要同步，会影响性能，毕竟99%的情况下是不需要同步的，
    第2种，在getInstance中做了两次null检查，确保了只有第一次调用单例的时候才会做同步，这样也是线程安全的，
    同时避免了每次都同步的性能损耗
    第3种，利用了classloader的机制来保证初始化instance时只有一个线程，所以也是线程安全的，同时没有性能损耗，
    所以一般我倾向于使用这一种。*/



    private static Singleton instance = null;
    public static Singleton getInstance1(){
        if( instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //懒汉式单例加锁
    public synchronized static Singleton getInstance2(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //懒汉式双重检查。
    public static Singleton getInstance3(){
        //使用volatile关键字声明对象
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //静态内部类
    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static final Singleton getInstance4() {
        return LazyHolder.INSTANCE;
    }

    //饿汉式单例
    private static final Singleton instace2 = new Singleton();
    public static final Singleton getInstance5(){
        return instace2;
    }



}
