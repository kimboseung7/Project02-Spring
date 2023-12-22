package com.example.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor //인자를 하나도 쓰지 않는데 default 생성자
@AllArgsConstructor
public class Person {
	
	String name;
	
	int age;

}
