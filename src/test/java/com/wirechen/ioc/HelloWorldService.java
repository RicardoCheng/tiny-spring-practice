package com.wirechen.ioc;

/**
 * @Author: WireChen
 * @Date: Created in 下午2:12 2018/6/7
 * @Description:
 */
public class HelloWorldService {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void helloWorld() {
        System.out.println(text);
    }
}
