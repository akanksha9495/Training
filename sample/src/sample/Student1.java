package sample;

public record Student1 (int regno ,String stdname){

	public int regno() {
		return regno;
	}
	
	public String stdname() {
		return stdname;
	}
	
	
}
