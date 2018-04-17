package singleton;

//枚举式单例
//虽说代码简单，enum的实质也是class（编译时，会先翻译成一个class）。
//优点是反序列化也不会重新生成新的实例。

public enum SingletonEnum {
    INSTANCE;
}
