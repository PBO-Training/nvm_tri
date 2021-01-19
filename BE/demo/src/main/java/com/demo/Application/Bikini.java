package com.demo.Application;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bikini")
@Scope("prototype")
@Primary
public class Bikini implements Outfit {
    @Override
    public void wear() {
        System.out.println("Mặc bikini");
    }
}