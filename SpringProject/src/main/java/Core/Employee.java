package Core;

public class Employee {
private int code;
private String empname;
private double Salary;
private Address addr;
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}

}
