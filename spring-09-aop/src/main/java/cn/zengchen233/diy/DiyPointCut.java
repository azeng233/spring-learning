package cn.zengchen233.diy;

public class DiyPointCut {
    public void before() {
        System.out.println("=====方法执行之前=====");
    }

    public void after() {
        System.out.println("=====方法执行之后=====");
    }
}
