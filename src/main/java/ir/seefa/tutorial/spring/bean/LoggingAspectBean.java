package ir.seefa.tutorial.spring.bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 07 Sep 2020 T 17:29:29
 */
@Component
@Aspect
public class LoggingAspectBean {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* ir.seefa.tutorial.spring.*.*.send(..))")
    public void logAroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch watch = new StopWatch();
        watch.start();
        joinPoint.proceed();
        watch.stop();
        logger.info("@Around call took:" + watch.getTotalTimeMillis() + " ms");
    }

    @Around("execution(* ir.seefa.tutorial.spring.*.*.set(..))")
    public void aroundSetMethodAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch watch = new StopWatch();
        watch.start();
        joinPoint.proceed();
        watch.stop();
        logger.info("@Around set method took:" + watch.getTotalTimeMillis() + " ms");
    }

    @Before("execution(* ir.seefa.tutorial.spring.*.*.set*(..))")
    public void logBeforeMethodAdvice(JoinPoint joinPoint) {
        logger.info("****LoggingAspect.logBeforeMethodAdvice() : " + joinPoint.getSignature().getName());

    }

    @After("execution(* ir.seefa.tutorial.spring.*.*.get*(..))")
    public void logAfterMethodAdvice(JoinPoint joinPoint) {
        logger.info("****LoggingAspect.logAfterMethodAdvice() : " + joinPoint.getSignature().getName());
    }
}
