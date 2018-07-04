package inheritance;

public class Main {// 여기가 실행 클래스

	public static void main(String[] args) {

		Employee employee = new Employee(0);

		// 객체의 내용을 확인하고자 하면 System.out.println 메소드에
		// 객체의 이름만 대입

		System.out.println(employee);

		Employee employee2 = new Employee(0);

		System.out.println(employee2);
		System.out.println(new Employee(0));
		System.out.println("-------------------------");
		for (int i = 0; i < 4; i++) {
			System.out.println(new Employee(i));
		}
		System.out.println("-------------------------");
		Manager mgr = new Manager();
		System.out.println(mgr);

	}

}
