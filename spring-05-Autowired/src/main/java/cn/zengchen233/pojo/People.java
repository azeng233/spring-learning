package cn.zengchen233.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class People {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    @Value("曾晨")
    private String name;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName()  {
        return name;
    }
}
