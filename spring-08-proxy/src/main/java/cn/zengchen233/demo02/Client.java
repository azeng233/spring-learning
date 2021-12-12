package cn.zengchen233.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
        Proxy proxy = new Proxy();
        proxy.setUserService(service);
        proxy.add();
    }
}
