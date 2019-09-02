package cn.jk.demo;

import cn.jk.demo.domain.CustomerDO;
import cn.jk.demo.repository.CustomerRepository;
import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
//@EntityScan("cn.jk.demo.domain.*.*")
@EnableJpaRepositories(basePackages = "cn.jk.demo.repository")

public class DemoApplication {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return args -> {

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            CustomerDO customerDO = new CustomerDO("buxianggang");

            Date dt = new Date();
            customerDO.setRawAddTime(dt);

            repository.save(customerDO);
            log.info("bu xiang gang!");
        };
    }


}
