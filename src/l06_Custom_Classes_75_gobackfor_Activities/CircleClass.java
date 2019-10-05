package l06_Custom_Classes_75_gobackfor_Activities;

public class CircleClass {

	public void Circum() {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle(9);
        Circle c2 = new Circle();
        c2.setRadius(4);
        System.out.printf("C1 ==> Radius : %f; Area : %f; Circumference : %f\n"
                ,c1.getRadius(),c1.area(), c1.circ());
        System.out.printf("C2 ==> Radius : %f; Area : %f; Circumference : %f\n"
                ,c2.getRadius(),c2.area(), c2.circ());
		
		
	}

}
