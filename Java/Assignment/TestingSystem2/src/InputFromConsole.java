import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputFromConsole {
	public static void main(String[] args) throws ParseException {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		// Question1
		System.out.println("Moi ban nhap vao 3 so nguyen duong ");
		for (int i = 0; i < 3; i++) {
			int x = scanner.nextInt();
			System.out.println("Ban da nhap: " + x + "\n");
		}

		// Question2
		System.out.println("Moi ban nhap vao 2 so thuc");
		for (int i = 0; i < 2; i++) {
			double d = scanner.nextDouble();
			System.out.println("Ban da nhap: " + d + "\n");
		}

		// Question3
		System.out.println("Moi ban nhap vao ho");
		String s1 = scanner.next();
		System.out.println("Moi ban nhap vao ten");
		String s2 = scanner.next();
		System.out.println("Ten ban da nhap: " + s1 + " " + s2 + "\n");

		// Question4
		System.out.println("Moi nhap vao ngay sinh");
		String dob = scanner.next();
		String pattern = "yyyy/MM/dd";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date date = dateFormat.parse(dob);
		System.out.println("Input: " + date);

		// Question5
		inputAccount();

		// Question6
		System.out.println("Moi ban nhap vao 1 so chan");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println("Input: " + number);
		} else {
			System.out.println("Nhap sai");
		}

		// Question8
		while (true) {
			System.out
					.println("Mời bạn nhập vào chức năng muốn sử dụng (1: tao account or 2: tao department");
			int methodNumber = scanner.nextInt();

			switch (methodNumber) {
			case 1:
				inputAccount();
				break;
			case 2:
				inputDepartment();
				break;
			default:
				System.out.println("Mời bạn nhập lại");
			}
		}

	}

	// Question5
	public static void inputAccount() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap vao Account ID:");
		@SuppressWarnings("unused")
		int id = scanner.nextInt();

		scanner.nextLine();
		System.out.print("Nhap vao username:");
		@SuppressWarnings("unused")
		String userName = scanner.nextLine();

		System.out.print("Nhap vao Department:");
		@SuppressWarnings("unused")
		String department = scanner.nextLine();

		System.out.print("Nhap vao Position ID (tu 1 -> 5):");
		int position = scanner.nextInt(6);
		switch (position) {
		case 1:
			System.out.print("Dev");
			break;
		case 2:
			System.out.print("Test");
			break;
		case 3:
			System.out.print("ScrumMaster");
			break;
		case 4:
			System.out.print("PM");
			break;
		default:
			System.out.print("SA");
		}

		System.out.print("\nNhap vao group:");
		scanner.nextLine();
		@SuppressWarnings("unused")
		String groups = scanner.nextLine();

		System.out.print("\nNhap vao ngay:");
		@SuppressWarnings("unused")
		String date = scanner.nextLine();
	}

	// Question6
	public static void inputDepartment() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap ten department muon tao");
		@SuppressWarnings("unused")
		String department = scanner.nextLine();
	}
}
