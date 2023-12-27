package com.example.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	// 직접 필요한 객체를 생성하는 방식
	Chef chef1 = new Chef();

	// 필요한 객체를 컨테이너에서 꺼내서 사용하는 방식
	@Autowired
	Chef chef2;



}