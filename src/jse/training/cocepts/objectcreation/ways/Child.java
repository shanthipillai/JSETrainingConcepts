package jse.training.cocepts.objectcreation.ways;

public class Child extends Parent{
	int childId;
	String childName;
	static String serialId;
		

public Child(int parentId, String parentName, int childId, String childName) {
	super(parentId, parentName);
	this.childId = childId;
	this.childName = childName;
}


}
