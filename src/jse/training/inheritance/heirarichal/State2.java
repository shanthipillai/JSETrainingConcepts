package jse.training.inheritance.heirarichal;

public class State2 extends CentralGovenment {
	int members=210;
	public void stateMinistry()
	{
		System.out.println("State Ministry Details printing...");
	}
	
	@Override
	public void proposeMeeting()
	{
		System.out.println("Proposal for 25 May");
	}
	
	public static void main(String[] args) {
		State2 obj=new State2();
		obj.ministry();
		obj.stateMinistry();
		System.out.println(obj.members);
		obj.proposeMeeting();
	}
	
	
	
}
