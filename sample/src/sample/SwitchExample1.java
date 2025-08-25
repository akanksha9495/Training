package sample;

public class SwitchExample1 {
public static void main(String[] args) {
	int category=1;
	switch(category) {
	case 1-> System.out.println("%40");
	case 2-> System.out.println("%30");
	case 3-> System.out.println("%25");
	case 4-> System.out.println("%20");
	default->System.out.println("15%");
	}
}
}
