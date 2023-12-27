package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

/*
 * 의존성 주입 테스트
 * */
@Component
@SpringBootTest
public class RestaurantTest {

	@Autowired//컨테이너에서 빈을 찾아서 필드에 주입
	Restaurant restaurant;
	
	@Autowired
	Chef chef;

	@Test
	void 테스트() {
		System.out.println("restaurant: " + restaurant); 
		
		System.out.println("chef: " + chef); //쉐프 인스턴스의 주소
		
	}


}
