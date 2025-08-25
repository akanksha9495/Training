package sample;

import java.util.Arrays;
import java.util.List;

public class TakeWhileDoWhile {
public static void main(String[] args) {
	List<Integer> nums =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
			List<Integer> take =nums.stream()takeWhile(i->i<5).collect;}
}
