package com.demo.Application.othergirl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("OtherGirl")
public class OtherGirl {

	 @Override
	    public String toString() {
	        return "OtherGirl.java";
	    }
}
