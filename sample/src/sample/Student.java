package sample;

public class Student {
private int regno;
private String studentname;
private int sub1,sub2,sub3;	

public Student(int regno, String studentname, int sub1, int sub2, int sub3) {
	super();
	this.regno = regno;
	this.studentname = studentname;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3;
}

public int getRegno() {
	return regno;
}

public void setRegno(int regno) {
	this.regno = regno;
}

public String getStudentname() {
	return studentname;
}

public void setStudentname(String studentname) {
	this.studentname = studentname;
}

public int getSub1() {
	return sub1;
}

public void setSub1(int sub1) {
	this.sub1 = sub1;
}

public int getSub2() {
	return sub2;
}

public void setSub2(int sub2) {
	this.sub2 = sub2;
}

public int getSub3() {
	return sub3;
}

public void setSub3(int sub3) {
	this.sub3 = sub3;
}
}


