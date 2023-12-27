package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentTest {

	@Test
	void test() {
		Student student1 = new Student();
		student1.setStNum(101);
		student1.setName("홀란드");
		student1.setAge(20);
		
		System.out.println(student1.getStNum());
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		
		Student student2 = new Student(102,"메시",23);
		System.out.println(student2);
		
		Student student3 = Student.builder()
				.stNum(103).name("호날두").age(99)
				.build();
		System.out.println(student3.toString());
				
		
	}

}
