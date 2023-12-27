package com.example.demo.di;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
	
	@Override
	public void sound() {
		System.out.println("야옹 짖는다");
	}

}
