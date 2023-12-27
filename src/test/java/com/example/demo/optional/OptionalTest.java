package com.example.demo.optional;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class OptionalTest {
	@Test
	void Optional사용하기() {
		//optional은 객체를 감싸는 wrapper 클래스이다
		//객체에 값이 있는지 없는지 확인하기 위한 용도이다
		Optional<String> opt = Optional.of("apple");
		
		System.out.println(opt.get());//값 꺼내기 --> apple 튀어나옴
		System.out.println(opt.isEmpty());//값이 없는지 확인
		System.out.println(opt.isPresent());//값이 있는지 확인
		System.out.println(opt.orElse("banana"));//값이 없으면 banana로 대체
	}
	@Test
	void of와ofNullable의차이() {
		String str = null;
		
		Optional<String> opt1 = Optional.of(str);
		Optional<String> opt2 = Optional.ofNullable(str);
	}
	@Test
	void 빈객체를사용하는경우() {
		String str = null;
		Optional<String> opt = Optional.ofNullable(str);
		System.out.println(opt.get());
	}
	
	@Test
	void optional을사용하여null값체크하기() {
		String str = "banana";
		Optional<String> opt = Optional.ofNullable(null); 
		opt.ifPresent(name -> System.out.println(name + "값이 존재합니다")); 
		//컨슈머타입의 객체를 인자에 넣어야됨 //optional안에 값이 없으면 출력x
		
	}
	@Test
	void if를사용하여null값체크하기() {
		String str = "banana";
		
		if(str != null) {
			System.out.println(str + "값이 존재합니다");
		}
	}
}
