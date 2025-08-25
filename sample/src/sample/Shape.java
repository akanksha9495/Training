package sample;
//import java.sql.SQLException;

//public abstract class Shape {
//double length;
//double breadth;
//double radius;
//public Shape(double length, double breadth, double radius) {
//	super();
//	this.length = length;
//	this.breadth = breadth;
//	this.radius = radius;
//}
//public static void main(String[] args) throws SQLException{
//	
//}
//}

public sealed class Shape permits Rectangle {
 protected double length;
protected double breadth;
protected double radius;
public Shape(double length, double breadth, double radius) {
	super();
	this.length = length;
	this.breadth = breadth;
	this.radius = radius;
}

void display()

}