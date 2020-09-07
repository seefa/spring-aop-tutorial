package ir.seefa.tutorial.spring.service;

import org.springframework.stereotype.Service;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 16:32:27
 */
@Service("SMSService")
public class SMSServiceImpl implements MessageService {

    private String receiver;

    // 1. detect when constructor will call in Spring lifecycle about eager and lazy initialization
    public SMSServiceImpl() {
        System.out.println("1.2. SMSServiceImpl constructor called.");
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void send(String msg) {
        System.out.println("2.1. SMS Service called and message is: " + msg);
    }
}
