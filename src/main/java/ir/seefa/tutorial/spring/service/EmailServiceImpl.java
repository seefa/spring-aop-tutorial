package ir.seefa.tutorial.spring.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 16:43:41
 */
@Service("EmailService")
public class EmailServiceImpl {

    private String from;
    private String[] to;
    private String subject;
    private String body;

    public EmailServiceImpl() {
        System.out.println("1.1. EmailServiceImpl constructor called.");
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String[] getTo() {
        return to;
    }

    public void setTo(String[] to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void send(String msg) {
        System.out.println("2.1. Email Service called and message is: " + msg);
    }

    @Override
    public String toString() {
        return "EmailServiceImpl{" +
                "from='" + this.getFrom() + '\'' +
                ", to=" + Arrays.toString(to) +
                ", subject='" + this.getSubject() + '\'' +
                ", body='" + this.getBody() + '\'' +
                '}';
    }
}
