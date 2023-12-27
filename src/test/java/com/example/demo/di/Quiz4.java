package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz4 {

		@Autowired
		Class class1;
		
		@Autowired
		Teacher teacher;
		
		@Test
		void test() {
			System.out.println(class1);
		}
		@Test
		void test1() {
			System.out.println("선생님:" + teacher);
			System.out.println("클래스의 선생님:"+ class1.teacher);
		}
		
}
