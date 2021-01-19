package com.demo.Application;

import org.springframework.stereotype.Repository;


public interface BoyRepository {

	Boy getBoyByNameAndAge(String name, int age);
}
