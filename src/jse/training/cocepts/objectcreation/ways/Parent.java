package jse.training.cocepts.objectcreation.ways;

import java.io.Serializable;

public class Parent implements Serializable {
int parentId;
String parentName;
static String serielId;
public Parent(int parentId, String parentName) {
	super();
	this.parentId = parentId;
	this.parentName = parentName;
}


}
