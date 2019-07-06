package org.fkit.bookshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author yaachou
 * @Tel 17843122002
 * @Email yaachou@qq.com
 * @QQ 1768887421
 * @Date 2018年11月18日下午8:06:42
 * @From spring tool suite
 * @Version 1.0
 * @SpringBootApplication指定这是一个 spring boot的应用程序.
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	// SpringApplication 用于从main方法启动Spring应用的类。
        SpringApplication.run(App.class, args);
    }
}
