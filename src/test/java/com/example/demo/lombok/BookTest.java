package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.lombok.Book.BookBuilder;

@SpringBootTest
public class BookTest {
	@Test // 단위테스트
	void test() {

		Book book1 = new Book("1984", 15000, "조지오웰", 450);
		System.out.println(book1.toString());
		Book book2 = new Book("동물농장", 10000, "조지오웰", 200);
		System.out.println(book2.toString());

		Book book3 = Book.builder().title("책1").price(100).publisher("둘리").page(20).build();
		System.out.println(book3.toString());

	}

}
