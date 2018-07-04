package polymorphism;

//Super 클래스를 상속받는 Sub 클래스
public class Sub extends Super {

	public Sub() {
	}

	// display method overriding
	// 아래 어노테이션이 에러가 발생하지 않으면 제대로 오버라이딩 한 것
	//상위 클래스에서 만든 메소드를 하위 클래스에서 다시 만드는 것을 오버라이딩
	public void display() {
		System.out.println("HEIIO!!!!!!! Sub()");
	}

	public void test() {
		System.out.println("Sub()");
	}
}
