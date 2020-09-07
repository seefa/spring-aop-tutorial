package ir.seefa.tutorial.spring;

import ir.seefa.tutorial.spring.config.ApplicationConfig;
import ir.seefa.tutorial.spring.service.EmailServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 07 Sep 2020 T 17:23:45
 */
// 1. understanding Spring Core is mandatory. If it needs start from Seefa spring-core-tutorial project

public class Application {

    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(Application.class);

//        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        EmailServiceImpl emailService = (EmailServiceImpl) context.getBean("EmailService");
        String[] emails = {"sami_delf@yahoo.com", "info@seefa.ir"};
        emailService.setTo(emails);
        emailService.setFrom("info@seefa.ir");
        emailService.setSubject("Hello Seefa Spring AOP tutorial");
        emailService.setBody("This is Spring AOP tutorial");
        emailService.send("Hello Seefa Spring AOP sample");

        logger.info("Email service model is: " + emailService.getFrom() + " - " + Arrays.toString(emailService.getTo()) + " - " + emailService.getSubject() + " - " + emailService.getBody());
    }
}
