package inheritance;



//Employee 클래스를 상속받은 Manager 클래스
public class Manager extends Employee {
	//이렇게 생성자를 직접 만들어서 상위 클래스의 생성자를 부르는 경우는
	//안드로이드에서 많이 발생한다.
	public Manager() {
		super(10);
		//super()는 맨 처음에 와야 한다.
		
	}

	private String task;

public void x() {
	num=10;
}

public String getTask() {
	return task;
}
//메소드 원형 setTask(String)
public void setTask(String task) {
	this.task = task;
}

@Override
public String toString() {
	return super.toString() + "Manager [task=" + task+"]";
}


}
