
public class Demo {
	// String �ٷ�� �޼ҵ��
	// 1. ��ҹ��� �������� String �� --> ������, �ٸ��� 
	public boolean compareString(String first, String second) {
		return second.equalsIgnoreCase(first);	
	}
	
	// 2. �� String�� ��ģ String�� ����
	public String concatenateString(String first, String second) {
		return first.concat(second);		
	}
	
	// 3. int array �� ���� �� ���� + 1 �� �ִ� �޼ҵ�
	public int[] addOne2Array(int[] numbers) {
		int[] numOut = new int[numbers.length];
		for (int i=0; i<numbers.length; i++)
			numOut[i] = numbers[i] + 1;
		
		return numOut;
	}
}
