package day3;

public class StudenDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setSid(100);
		s1.setSname("Sathish");
		s1.setScity("Puducherry");
		System.out.println(s1);
		
		Student s2 = new Student();
		
		s2.setSid(200);
		s2.setSname("Itto");
		s2.setScity("Inazuma");
		System.out.println(s2);
		
		Student s3 = new Student();
		
		s3.setSid(300);
		s3.setSname("Furina");
		s3.setScity("Fontaine");
		System.out.println(s3);

	}

}
