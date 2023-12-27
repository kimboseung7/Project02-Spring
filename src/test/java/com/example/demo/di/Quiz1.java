package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Quiz1 {
	@Autowired
	Dog dog;
	
	@Autowired
	Animal animal;
	@Test
	void test() {
		dog.sound();
	}
	@Test
	void 강아지가있는지확인() {
		System.out.println(dog);
	}
	@Test
	void 동물의기능테스트() {
		animal.sound();
	}
}
