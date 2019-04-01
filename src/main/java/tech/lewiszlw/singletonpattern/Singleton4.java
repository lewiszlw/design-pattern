package tech.lewiszlw.singletonpattern;

/**
 * Desc: 双重检验锁
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/23
 * Time:17:27
 */
public class Singleton4 {

    // 声明成 volatile
    private volatile static Singleton4 instance;

    private Singleton4 (){}

    public static Singleton4 getSingleton4() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    /**
     * 假设线程A、B同时调用getSingleton4()方法，乍一看上去，线程发现instance == null 后，会对Singleto.class加锁，
     * JVM保证只有一个线程可以获得该锁，则另一个线程会处于等待状态。最后只有一个线程创建实例成功，另一个线程在锁释放后获得锁，
     * 然后检查instance == null时，发现Singleto实例已经创建成功，所以不会再创建一个Singleto实例。
     *
     * 实际上，getInstance()方法是存在问题的，问题就在new操作上，我们默认任务new操作会以以下顺序执行：
     *
     * 1.在堆上分配一块内存M；
     * 2.在内存M上初始化Singleto4对象的实例；
     * 3.把M的地址赋值给instance变量。
     *
     * 但经过优化后的执行顺序可能是这样的：
     *
     * 1.分配一块内存M；
     * 2.将M的地址赋值给instance变量；
     * 3.最后在内存M上初始化Singleto4对象。
     *
     * 假如线程A执行完指令2之后恰好发生了线程切换，切换到了线程B，B也执行getInstance()方法，则B会判断instance != null，
     * 所以直接返回instance，而此时instance还没有经过初始化，访问该变量会触发空指针异常。
     *
     * 作者：Eric597247482
     * 链接：https://juejin.im/post/5ca024c551882567d41ebc4b
     * 来源：掘金
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
}
