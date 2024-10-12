package com.kindread11.Jprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kindread11.Jprac.Structure.SampleClass;

@SpringBootApplication
public class JpracApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpracApplication.class, args);
		
		workspace();
		demo();
	}
	
	public static void workspace() {
		
		// 인스턴스 (공구상자)
		// 메서드는 인스턴스를 만들어야 사용할 수 있다.
		SampleClass sample = new SampleClass();
		
		// public 속성/메서드는 밖에서 사용할 수 있다.
		String 이름 = sample.이름;
		System.out.println(이름);
		
		int 나이 = sample.get나이();
		System.out.println(나이);
		
		// private 속성/메서드는 밖에서 사용할 수 없다.
		// int 나이 = sample.나이;
		
		// 정적 메서드는 클래스(공장) 에서 직접 호출할 수 있다.
		SampleClass.설명서();
		
	}
	
	public static void demo() {
		
	}

}
