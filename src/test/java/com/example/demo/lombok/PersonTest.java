package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.NoArgsConstructor;

@SpringBootTest // comment Annotaion
public class PersonTest { // 스프링 컨테이너 환경을 빌려옴
	
	@Test // 단위테스트
	void test() {
		
		Person person1 = new Person(); //디폴트 생성자//@NoArgsConstructor 없으면 애러
		
		person1.setName("둘리"); //setter // main에서 @setter 없애면 에러남
		person1.setAge(12);
		
		System.out.println(person1.getName()); // main에서 @getter 없애면 에러남
		System.out.println(person1.getAge());
		
		Person person2 = new Person("또치",15); //@NoArgsConstructor 없으면 애러
		System.out.println(person2.toString());
		
		//junit으로 test함수 단독실행
	}

}
