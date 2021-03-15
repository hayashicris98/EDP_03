import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		// DEPARTMENT
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "IT";

		// POSITION
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = PositionName.TEST;

		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = PositionName.DEV;

		Position position3 = new Position();
		position3.positionID = 3;
		position3.positionName = PositionName.PM;

		Position position4 = new Position();
		position4.positionID = 4;
		position4.positionName = PositionName.SCRUM_MASTER;

		// ACCOUNT
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "lam98@gmail.com";
		account1.userName = "lam98";
		account1.fullName = "Nguyen Phuc Lam";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.now();

		Account account2 = new Account();
		account1.accountID = 2;
		account1.email = "minhly2k@gmail.com";
		account1.userName = "minhly";
		account1.fullName = "Le Thi Minh Ly";
		account1.department = department2;
		account1.position = position2;
		account1.createDate = LocalDate.now();

		Account account3 = new Account();
		account1.accountID = 3;
		account1.email = "huy96@gmail.com";
		account1.userName = "huy96";
		account1.fullName = "Tran Quang Huy";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.now();

		// GROUP
		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "Sale";
		group1.creator = account1;
		group1.createDate = LocalDate.now();

		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "Development";
		group2.creator = account2;
		group2.createDate = LocalDate.now();

		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "Share";
		group3.creator = account1;
		group3.createDate = LocalDate.now();

		Group[] groupsOfAccount1 = { group1, group2 };
		account1.groups = groupsOfAccount1;

		Group[] groupsOfAccount2 = { group2, group3 };
		account1.groups = groupsOfAccount2;

		Group[] groupsOfAccount3 = { group1, group3 };
		account1.groups = groupsOfAccount3;

		Account[] accountsOfGroup1 = { account1, account2 };
		group1.accounts = accountsOfGroup1;

		Account[] accountsOfGroup2 = { account2, account3 };
		group1.accounts = accountsOfGroup2;

		Account[] accountsOfGroup3 = { account1, account3 };
		group1.accounts = accountsOfGroup3;

		// TYPE QUESTION
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeID = 1;
		typeQuestion1.typeName = TypeName.ESSAY;

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeID = 2;
		typeQuestion2.typeName = TypeName.MULTIPLE_CHOICE;

		// CATEGORY QUESTION
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryID = 1;
		categoryQuestion1.categoryName = "Java";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryID = 2;
		categoryQuestion2.categoryName = "PHP";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryID = 3;
		categoryQuestion3.categoryName = "Python";

		// QUESTION
		Question question1 = new Question();
		question1.questionID = 1;
		question1.content = "cau hoi Java";
		question1.category = categoryQuestion1;
		question1.type = typeQuestion1;
		question1.creator = account1;
		question1.createDate = LocalDate.now();

		Question question2 = new Question();
		question2.questionID = 1;
		question2.content = "cau hoi PHP";
		question2.category = categoryQuestion1;
		question2.type = typeQuestion2;
		question2.creator = account2;
		question2.createDate = LocalDate.now();

		Question question3 = new Question();
		question3.questionID = 1;
		question3.content = "cau hoi Python";
		question3.category = categoryQuestion1;
		question3.type = typeQuestion1;
		question3.creator = account3;
		question3.createDate = LocalDate.now();

		// ANSWER
		Answer answer1 = new Answer();
		answer1.answerID = 1;
		answer1.content = "tra loi 01";
		answer1.question = question1;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.answerID = 2;
		answer2.content = "tra loi 02";
		answer2.question = question2;
		answer2.isCorrect = true;

		Answer answer3 = new Answer();
		answer3.answerID = 3;
		answer3.content = "tra loi 03";
		answer3.question = question3;
		answer3.isCorrect = true;

		// EXAM
		Exam exam1 = new Exam();
		exam1.examID = 1;
		exam1.code = "A01";
		exam1.title = "de thi Java";
		exam1.category = categoryQuestion1;
		exam1.duration = 60;
		exam1.creator = account1;
		exam1.creatDate = LocalDate.now();

		Exam exam2 = new Exam();
		exam2.examID = 2;
		exam2.code = "A02";
		exam2.title = "de thi PHP";
		exam2.category = categoryQuestion2;
		exam2.duration = 45;
		exam2.creator = account2;
		exam2.creatDate = LocalDate.now();

		Exam exam3 = new Exam();
		exam3.examID = 3;
		exam3.code = "A03";
		exam3.title = "de thi Python";
		exam3.category = categoryQuestion3;
		exam3.duration = 90;
		exam3.creator = account3;
		exam3.creatDate = LocalDate.now();

		Question[] questionsOfExam1 = { question1, question2 };
		exam1.questions = questionsOfExam1;

		Question[] questionsOfExam2 = { question2, question3 };
		exam2.questions = questionsOfExam2;

		Question[] questionsOfExam3 = { question1, question3 };
		exam3.questions = questionsOfExam3;

		// PRINT
		// DEPARTMENT
		System.out.println("Dept ID:" + department1.departmentID);
		System.out.println("Dept Name" + department1.departmentName);
		System.out.println();

		// ACCOUNT
		System.out.println("ID" + account1.accountID);
		System.out.println("Email" + account1.email);
		System.out.println("User Name" + account1.userName);
		System.out.println("Full Name" + account1.fullName);
		System.out.println("Department ID" + account1.department);
		System.out.println("Position ID" + account1.position);
		System.out.println("Create Date" + account1.createDate);
		System.out.println("List group of account1:");
		for (int i = 0; i < account1.groups.length; i++) {
			System.out.println(account1.groups[i].groupName);
		}
		
		

	}

}
