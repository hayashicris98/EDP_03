package com.vti.backend;

import com.vti.entity.encapsulation.ex2.Student;

public class Encapsulation {

	// Question 1
	public void question1() {
		Student student1 = new Student("Lâm", "Thanh Hóa");
		student1.setScore(8);

		Student student2 = new Student("Quang Huy", "Thanh Hóa");
		student2.setScore(10);

		Student student3 = new Student("Tú Uyên", "Thanh Hóa");
		student3.setScore(4);

		student3.plusScore(3);

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}
}
