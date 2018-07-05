package attack;

public abstract class Attack {
	//상속관계를 만들어 주기 위해 만들었다.
	//abstract(추상)-인스턴스 생성 못함.
public abstract void attack() ;
//abstract를 붙여서 내용이 없는 메소드가 됨
//{}를 없앰-내용이없는 메소드
//abstract는 추상클래스나 인터페이스에만 존재
//하위 클래스에서 반드시 다시 재정의
//추상클래스 = 메뉴판

}
