package kr.co.ezenac.beans;

public class TestBean1 {

	public TestBean1() {
		System.out.println("TestBean1의 생성자");
	}
	
	public void bean1_init() {
		System.out.println("TestBean1의 init 메소드");
	}
	
	public void bean1_destroy() { // 객체가 소멸될 때
		System.out.println("TestBean1의 destroy 메소드");
	}
}
