package chap06;

public class TvTest04 {

	public static void main(String[] args) {
		Tv t1, t2;
		t1=new Tv();
		t2=new Tv();
		System.out.println("[Tv1] color: "+t1.color);
		System.out.println("[Tv1] color: "+t1.isPower);
		System.out.println("[Tv1] color: "+t1.channel);
		
		System.out.println("[Tv2] color: "+t2.color);
		System.out.println("[Tv2] color: "+t2.isPower);
		System.out.println("[Tv2] color: "+t2.channel);
		
		System.out.println("t1: "+t1+", t2: "+t2); // t1: chap06.Tv@50d0686, t2: chap06.Tv@7a3d45bd, �ּҰ� �ƴ϶� ��ü�� ID ���� ������ �ȴ�, ���� �ٸ� ��ü���� �� �� �ִ�.
		System.out.println("============================================");
		t2 = t1;
		
		t1.power();
		t2.color = "����";
		t1.channelUp();
		t2.channelUp();
		t1.channelUp();
		
		System.out.println("[Tv1] color: "+t1.color);
		System.out.println("[Tv1] color: "+t1.isPower);
		System.out.println("[Tv1] color: "+t1.channel);
		
		System.out.println("[Tv2] color: "+t2.color);
		System.out.println("[Tv2] color: "+t2.isPower);
		System.out.println("[Tv2] color: "+t2.channel);
		
		System.out.println("t1: "+t1+", t2: "+t2); // t1: chap06.Tv@50d0686, t2: chap06.Tv@7a3d45bd, �ּҰ� �ƴ϶� ��ü�� ID ���� ������ �ȴ�, ���� �ٸ� ��ü���� �� �� �ִ�.
		
	}

}
