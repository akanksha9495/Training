package sample;

public class SwitchExample2 {
	public static void main(String[] args) {
		String week="mon";
		String msg;
		msg= switch(week) {
		case "mon"-> {yield "Working day";}
		case "sat"-> {yield "weekend";}
		default->throw new RuntimeException("not a valid week");
		};
		System.out.println(msg);
	}
}
