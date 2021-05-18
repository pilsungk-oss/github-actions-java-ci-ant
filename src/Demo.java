
public class Demo {
	// String 다루는 메소드들
	// 1. 대소문자 구별없이 String 비교 --> 같은지, 다른지 
	public boolean compareString(String first, String second) {
		return second.equalsIgnoreCase(first);	
	}
	
	// 2. 두 String을 합친 String을 리턴
	public String concatenateString(String first, String second) {
		return first.concat(second);		
	}
	
	// 3. int array 에 대해 각 원소 + 1 해 주는 메소드
	public int[] addOne2Array(int[] numbers) {
		int[] numOut = new int[numbers.length];
		for (int i=0; i<numbers.length; i++)
			numOut[i] = numbers[i] + 1;
		
		return numOut;
	}
}
