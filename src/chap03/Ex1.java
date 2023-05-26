package chap03;

public class Ex1 {

	public static void main(String[] args) {
		int number = 10;
		double score = 12.345;
		String text = Integer.toBinaryString(number);
		 
		System.out.printf("%b %n", 3<1);         // boolean
		System.out.printf("%d %n", number);      // 10����
		System.out.printf("%o %n", number);      //  8����
		System.out.printf("%x %n%n", number);    // 16����	
		System.out.printf("%,d %n", 1000000);    // 10���� (3�ڸ������� ',' ǥ��)
		System.out.printf("%+d %n", 10);         // 10���� (��ȣǥ��)
		System.out.printf("%+d %n", -10);        // 10���� (��ȣǥ��)
		
		System.out.printf("%f %n", score);       // �ε��Ҽ���
		System.out.printf("%e %n%n", score);     // ����
		
		System.out.printf("%c %n", 65);          // ���� (Unicode���� 65�� A)
		System.out.printf("%s %n%n", text);      // ���ڿ� 
		
		System.out.printf("[%10d] %n", number);  // ��ü 10�ڸ� (��������) 
		System.out.printf("[%-10d] %n", number); // ��ü 10�ڸ� (��������)
		System.out.printf("[%010d] %n", number); // ��ü 10�ڸ� (����� 0���� ä��)
		System.out.printf("[%10.5f] %n", score); // ��ü 10�ڸ�, �Ҽ����Ʒ� 5�ڸ�
	}
}
