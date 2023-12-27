package com.example.demo.lombok;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MovieTest {

	@Test
	void test() {
		
		Movie movie1 = Movie.builder()
					.title("오펜하이머")
					.director("크리스토퍼 놀란")
					.date(LocalDate.of(2023, 7, 21))
					.build();
		System.out.println(movie1);
		
		
		
		
	}
}
