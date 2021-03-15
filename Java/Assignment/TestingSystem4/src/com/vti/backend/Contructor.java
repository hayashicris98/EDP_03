package com.vti.backend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

public class Contructor {

	// Question 1
	public void question1() {

		// Construct object
		Department department = new Department();
		Department department1 = new Department("Sale");

		// Print object
		System.out.println(department);
		System.out.println(department1);
	}

	// Question 2
	public void question2() {
		// a
		Account account = new Account();
		System.out.println(account);

		// b
		Account account1 = new Account(1, "lam@gmail.com", "hayashicris", "Nguyễn Văn", "Lâm");
		System.out.println(account1);

		// c
		Position position1 = new Position(1, "Sale");
		Position position2 = new Position(2, "Marketing");
		Account account2 = new Account(2, "lam@gmail.com", "hayashicris", "Nguyễn Văn", "Lâm", position1);
		System.out.println(account2);

		// d
		Account account3 = new Account(3, "lam@gmail.com", "hayashicris", "Nguyễn Văn", "Lâm", position2,
				LocalDate.parse("2021-03-15"));
		System.out.println(account3);
	}

	// Question 3
	public void question3() {
		// a
		Group group = new Group();
		System.out.println(group);

		// b
		Account creator = new Account(1, "lam1@gmail.com", "hayashicris1", "Nguyễn Văn", "Lâm1");
		Account account2 = new Account(2, "lam2@gmail.com", "hayashicris2", "Nguyễn Văn", "Lâm2");
		Account account3 = new Account(3, "lam3@gmail.com", "hayashicris3", "Nguyễn Văn", "Lâm3");
		Account[] accounts = { creator, account2, account3 };
		Group group1 = new Group(1, "Sale", creator, accounts, LocalDate.parse("2021-03-15"));
		System.out.println(group1);

		// c
		String[] usernames = { "hayashicris1", "hayashicris2", "hayashicris3" };
		System.out.println(group1);
		Group group2 = new Group(2, "Boss of Director", creator, usernames, LocalDate.parse("2021-03-15"));
		System.out.println(group2);
	}
}
