package com.xzt.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement //开启事务管理
@MapperScan("com.xzt.project.mapper") //扫描包@SpringBootApplication //springboot的全局的自动配置注解
public class Application {

    public static void main(String[] args) {
        // 固定的代码 启动springboot程序 初始化spring容器
        System.out.println("start success");
        SpringApplication.run(Application.class, args);
    }

}

