package jse.training.inheritance.heirarichal;

public class State1 extends CentralGovenment{
int members=200;
	public void stateMinistry()
	{
		System.out.println("State Ministry Details printing...");
	}
	
	public static void main(String[] args) {
		State1 obj=new State1();
		obj.ministry();
		obj.stateMinistry();
		System.out.println(obj.members);
		obj.proposeMeeting();
	}
}
