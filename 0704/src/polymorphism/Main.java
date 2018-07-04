package polymorphism;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Super Base = new Super();
		//
		// Sub Derivation = new Sub();
		// /*
		// * 상위 클래스 타입의 변수에 하위 클래스 타입의 인스턴스 주소를 대입할 수 있다.
		// */ Super spsb = new Sub();
		//
		// /*
		// * 하위 클래스 타입의 변수에 상위 클래스 타입의 인스턴스 주소를 대입하는 것은 강제 형 변환을 통해서만 가능 문제가 발생 할 수 있다.-
		// * 예외 발생
		// */
		// Sub spsb2 = (Sub) (new Super());

		// 상위 클래스 타입의 변수에 하위 클래스 타입의 주소를 대입할 수 있습니다.
		// obj는 기본적으로 Super 것 만 호출할 수 있다.
		// 오버라이딩이 된 것은 Sub 클래스 에서 오버라이딩이 안된것은 Super 클래스 에서 부름
		// 오버라이딩 된 메소드는 변수를 선언할 때 사용한 자료형이 아니라
		// 인스턴스를 만들어서 대입할 때 사용한 자료형의 것을 호출함.
		Super obj = new Super();
		obj.display();
 
		obj = new Sub();
		obj.display();

	}

}
/*
 * *polymorphism(다형성) =>동일한 메세지에 대하여 다르게 반응하는 성질 =>동일한 코드가 어떤 객체가 대입되었는지에 따라서 다른
 * 메소드를 호출하는 것 . =>참조형 사이의 대입과 overriding을 이용해서 구현합니다. =>참조형 변수는 변수를 선언할 때 사용한
 * 자료형을 가지고 자신의 멤버를 호출하는데 예외적으로 overriding된 메소드는 선언할 때 사용한 자료형을 가지고 호출하는 것이 아니고
 * 대입될 때 사용한 자료형을 가지고 멤버를 호출 함.
 */
