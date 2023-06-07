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
		
		System.out.println("t1: "+t1+", t2: "+t2); // t1: chap06.Tv@50d0686, t2: chap06.Tv@7a3d45bd, 주소가 아니라 객체의 ID 값이 나오게 된다, 서로 다른 객체임을 알 수 있다.
		System.out.println("============================================");
		t2 = t1;
		
		t1.power();
		t2.color = "은색";
		t1.channelUp();
		t2.channelUp();
		t1.channelUp();
		
		System.out.println("[Tv1] color: "+t1.color);
		System.out.println("[Tv1] color: "+t1.isPower);
		System.out.println("[Tv1] color: "+t1.channel);
		
		System.out.println("[Tv2] color: "+t2.color);
		System.out.println("[Tv2] color: "+t2.isPower);
		System.out.println("[Tv2] color: "+t2.channel);
		
		System.out.println("t1: "+t1+", t2: "+t2); // t1: chap06.Tv@50d0686, t2: chap06.Tv@7a3d45bd, 주소가 아니라 객체의 ID 값이 나오게 된다, 서로 다른 객체임을 알 수 있다.
		
	}

}
