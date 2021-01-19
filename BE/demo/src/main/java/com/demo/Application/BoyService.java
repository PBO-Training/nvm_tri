package com.demo.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoyService {
	@Autowired
	private BoyRepository BoyRepo;

	public Boy getNameBoy() {
		return BoyRepo.getBoyByNameAndAge("Loan", 26);
	}

}
