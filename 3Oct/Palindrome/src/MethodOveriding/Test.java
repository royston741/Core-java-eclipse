package MethodOveriding;

public class Test {
	public static void main(String... args) {
		Degree d1 = new Degree();
		d1.getDegree();

		UnderGraduate d2 = new UnderGraduate();
		d2.getDegree();

		PostGraduate d3 = new PostGraduate();
		d3.getDegree();
	}
}
