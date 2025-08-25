package Core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Hyderabad")
private String City;

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

@Override
public String toString() {
	return "Address [City=" + City + "]";
}


}
