package Test;

public class Demo02 {
	private static class Demo02Hodle {
		private static final Demo02 d = new Demo02();
	}

	private Demo02() {
	}

	public static final Demo02 getDemo() {
		return Demo02Hodle.d;
	}

}
