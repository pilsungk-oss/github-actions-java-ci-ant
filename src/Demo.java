
public class Demo {

	public boolean compareString(String first, String second) {
		return second.equalsIgnoreCase(first);	
	}
	
	
	public String concatenateString(String first, String second) {
		return first.concat(second);		
	}
	
	
	public int[] addOne2Array(int[] numbers) {
		int[] numOut = new int[numbers.length];
		for (int i=0; i<numbers.length; i++)
			numOut[i] = numbers[i] + 1;
		
		return numOut;
	}

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.concatenateString("Hello", "World"));
    }
}
