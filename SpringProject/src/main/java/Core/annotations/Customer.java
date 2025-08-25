package Core.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import Core.Address;

@Component(value="cust")
public class Customer {
@Value("3456")
private int code;
@Value("sutherland")
private String CustName;

@Autowired
private Address address;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getCustName() {
	return CustName;
}
public void setCustName(String custName) {
	CustName = custName;
}

}
