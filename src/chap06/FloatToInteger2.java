package chap06;

public class FloatToInteger2 {
	FloatToInteger2() {
	}

	FloatToInteger2(double value) {
		double num = value;
	}

	double num;

	void setNum(double value) {
		num = value;
	}

	int floor() {
		return (int) num;
	}

	int round() {
		return (int) (num + 0.5);
	}

	int ceil() {
		int result = 0;
		if ((int) num == num) {
			result = (int) num;
		} else {
			result = (int) (num + 1);
		}
		return result;
	}

}