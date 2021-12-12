package cn.zengchen233.config;

import cn.zengchen233.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.zengchen233.pojo")
public class config {
    @Bean
    public User getUser() {
        return new User();
    }
}
