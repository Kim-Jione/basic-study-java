package chap07.package8;

import chap07.packageA.Parent;

public class Child extends Parent {
	int result;

	public Child(int num1, int num2, int num3, int nu4) {
		super(num1, num2, num3, nu4);
	}

	public int getResult() {
		this.result = this.num3 + this.num4;
		this.result += this.getNum1();
		this.result += this.getNum2();
		return this.result;
	}

}
