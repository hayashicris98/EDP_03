import java.time.LocalDate;

public class Exam {

	short examID;
	String code;
	String title;
	CategoryQuestion category;
	short duration;
	Account creator;
	LocalDate creatDate;
	Question[] questions;

}
