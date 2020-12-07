import java.time.LocalDate;

public class dateMonthYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "2020-07-18";
		
		String[] mystr = str.split("-");
		
		System.out.println("Year - >" + mystr[0]);
		System.out.println("Month - >" + mystr[1]);
		System.out.println("Day - >" + mystr[2]);
		
		LocalDate currentDate = LocalDate.parse(str);
		
		System.out.println("Current Date -> " + currentDate);
		System.out.println("Month ->" + currentDate.getMonth());

	}

}
