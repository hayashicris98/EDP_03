package com.vti.backend;

import com.vti.entity.abstraction.quesion2_3.Employee;
import com.vti.entity.abstraction.quesion2_3.Manager;
import com.vti.entity.abstraction.quesion2_3.Waiter;
import com.vti.entity.abstraction.question1.Phone;
import com.vti.entity.abstraction.question1.VietnamesePhone;

public class Abstraction {

	public void question1() {
		Phone phone = new VietnamesePhone();
		phone.insertContact("Lâm Nguyễn", "0342033550");
		phone.removeContact("Lâm Nguyễn");
		phone.updateContact("Lâm Nguyễn", "0978084629");
		phone.searchContact("Lâm Nguyễn");
	}

	public void question2_3() {
		Employee employee = new Employee("Lâm Nguyễn", 6.9);
		employee.displayInfo();

		Manager manager = new Manager("Quang Huy", 9.6);
		manager.displayInfo();

		Waiter waiter = new Waiter("Tú Uyên", 2.6);
		waiter.displayInfo();
	}

}
