package com.calc.Api;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Api {

	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "home";
	}
	
	@PostMapping("/calc")

	@ResponseBody
	public double homeInit(@RequestBody Calc Calc ) {
		double result = 1;
		System.out.println(Calc.numberOne + " " + Calc.numberTwo + " " + Calc.calculation);

		if (Calc.calculation == 1) {
			result = Calc.numberOne + Calc.numberTwo;

		} else if (Calc.calculation == 2) {
			result = Calc.numberOne - Calc.numberTwo;
		} else if (Calc.calculation == 3) {
			result = Calc.numberOne * Calc.numberTwo;
		} else if (Calc.calculation == 4) {
			
			result = Calc.numberOne / Calc.numberTwo;
		}

		return result;
	}
}
