package tech.lewiszlw.singletonpattern;

/**
 * Desc: 枚举实现单例（effective java作者推荐写法）
 *
 * @author zhanglinwei02
 * @date 2018/11/19
 */
public enum Singleton6 {
    INSTANCE;

    public void method() {
        System.out.println("对象方法");
    }
}
