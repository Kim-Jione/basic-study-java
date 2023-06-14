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

	//20개 가 더 늘어나면 유지보수하기가 힘들다
	//늘어날수록 답이 없기에 오버로딩에 제한을 둬야함

	public class test01 {

	   static void print(star attacker, star damaged) {
	      int hp = damaged.getHp() - attacker.getPower();
	      damaged.setHp(hp);
	      System.out.println("맞은 대상: " + damaged.getHp());
	      System.out.println("맞은 대상의 이름: " + damaged.getName());
	   
	      System.out.println(attacker.getName()+"은 "+damaged.getName()+ " 공격후 "+"Drgoon의 피는 "+damaged.getHp());
	   }

	   public static void main(String[] args) {
	      star z1 = new Zealot();
	      star d1 = new Dragoon();
	      star r1 = new River();

	      print(z1, d1);

	   }

	}

