package com.demo.Application;

import org.springframework.stereotype.Repository;

@Repository
public class BoyRepositoryImpl implements BoyRepository{

	@Override
	public Boy getBoyByNameAndAge(String name, int age) {
		// TODO Auto-generated method stub
		return new Boy(name,age);
	}

	
}
