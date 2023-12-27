package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarTest {
	
	@Test
	void test() {

		Car car1 = new Car();
		car1.setModel("소나타");
		car1.setCompany("현대");
		car1.setColor("검정색");

		System.out.println(car1.getModel());
		System.out.println(car1.getCompany());
		System.out.println(car1.getColor());

		Car car2 = new Car("아벤타도르", "람보르기니", "주황색");
		System.out.println(car2.toString());

		Car car3 = Car.builder()
				.model("라페라리").company("페라리").color("빨간색")
				.build();
		System.out.println(car3.toString());
	}
}
