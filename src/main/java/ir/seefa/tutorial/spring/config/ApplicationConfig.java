package ir.seefa.tutorial.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 07 Sep 2020 T 17:24:19
 */
// 1. understanding Spring Core is mandatory. If it needs start from Seefa spring-core-tutorial project
@Configuration
// 2. Enabling Java-based Spring AOP
@EnableAspectJAutoProxy
// 3. Enabling XML-based Spring AOP
//@ImportResource(locations = {"classpath:/application-context.xml"})
@ComponentScan(basePackages = "ir.seefa.tutorial.spring")
@PropertySource(value = "application.properties", ignoreResourceNotFound = true)
public class ApplicationConfig {

}
