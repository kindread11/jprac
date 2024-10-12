// 패키지 : 주소
package com.kindread11.Jprac.Structure;

// 클래스 : 공장 (공구상자를 만드는 곳)
public class SampleClass {
	
	// 속성
	public String 이름;
	private int 나이;
	
	// 초기화 메서드 (공구상자 만들기)
	public SampleClass() {
		
	}
	
	// 초기화 메서드 (공구상자 == 인스턴스 만들기)
	public SampleClass(String 이름, int 나이) {
		this.이름 = 이름;
		this.나이 = 나이;
	}
	
	// 메서드 (공구)
	public void set나이(int 받은나이) {
		나이 = 받은나이;
	}
	
	// 메서드 (공구)
	public int get나이() {
		return 나이;
	}
	
	// 정적 메서드 (공구 대여 서비스)
	public static void 설명서() {
		System.out.println("자바의 기초 구조를 설명하는 클래스");
	}

}
