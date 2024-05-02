package jse.training.cocepts.io.fileio.objectstreams;

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
