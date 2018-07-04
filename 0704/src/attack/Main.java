package attack;

public class Main {

	public static void main(String[] args) {

		// 3개의 클래스의 공격하는 메소드를 호출해보기

		Attack attack = new Attack();
		attack.attack();
		attack = new Terran();
		attack.attack();
		attack = new Zerg();
		attack.attack();
		attack = new Protoss();
		attack.attack();

		// 유사한 역할을 하는 메소드들의 이름이 서로 다르면 기억해야 할
		// 메소드의 개수가 늘어난다.
		// 유사한 역할을 수행하는 메소드들의 이름을 동일하게 한다.
		
		//Terran과 Zerg와 Protoss 클래스들 간에 아무런 관계도 없어서 세개의 변수를 만들어서 메소드를 호출했다
		//상위 클래스 타입의 변수에 하위 클래스 타입의 인스턴스 주소를 대입할 수 있는 
		//문법을 이용하면
		//하나의 변수에 3개 클래스의 인스턴스 주소를 대입할 수 있음.
		
		//하나의 변수를 가지고 3개의 인스턴스를 전부 대입받을 수는 있지만 메소드 호출은 안됨
		//변수는 오버라이딩된 메소드만 하우 클래스의 것을 호출할 수 있기 때문임
		//오버라이딩을 만들어주기 위해서 Attack클래스에 attack()을 추가
		
		//이렇게 만들면 Main을 제외한 클래스들은 복잡해지지만 Main클래스는 간결해진다.
		//Main 클래스는 유저가 사용하는 클래스 나머지 클래스는 보조적인 역할을 수행하는 클래스
		//Main이 간결해지면 유저는 편리해짐 개발자는 피곤해짐
	}

}
