package test;

class star {
	
	   String getName() {
	      return "";
	   }

	   int getPower() {
	      return 0;
	   }

	   int getHp() {
	      return 0;
	   }

	   void setHp(int hp) {

	   }
	}

	class Zealot extends star {

	   String name = "Zealot";
	   int power = 5;
	   int hp = 100;

	   public int getPower() {
	      return power;
	   }

	   public void setPower(int power) {
	      this.power = power;
	   }

	   public int getHp() {
	      return hp;
	   }

	   public void setHp(int hp) {
	      this.hp = hp;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	}

	class Dragoon extends star {
	   String name = "Dragoon";
	   int power = 10;
	   int hp = 100;

	   public int getPower() {
	      return power;
	   }

	   public void setPower(int power) {
	      this.power = power;
	   }

	   public int getHp() {
	      return hp;
	   }

	   public void setHp(int hp) {
	      this.hp = hp;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	}

	class River extends star {
	   String name = "River";
	   int power = 50;
	   int hp = 100;

	   public int getPower() {
	      return power;
	   }

	   public void setPower(int power) {
	      this.power = power;
	   }

	   public int getHp() {
	      return hp;
	   }

	   public void setHp(int hp) {
	      this.hp = hp;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	}

	//20�� �� �� �þ�� ���������ϱⰡ �����
	//�þ���� ���� ���⿡ �����ε��� ������ �־���

	public class test01 {

	   static void print(star attacker, star damaged) {
	      int hp = damaged.getHp() - attacker.getPower();
	      damaged.setHp(hp);
	      System.out.println("���� ���: " + damaged.getHp());
	      System.out.println("���� ����� �̸�: " + damaged.getName());
	   
	      System.out.println(attacker.getName()+"�� "+damaged.getName()+ " ������ "+"Drgoon�� �Ǵ� "+damaged.getHp());
	   }

	   public static void main(String[] args) {
	      star z1 = new Zealot();
	      star d1 = new Dragoon();
	      star r1 = new River();

	      print(z1, d1);

	   }

	}

