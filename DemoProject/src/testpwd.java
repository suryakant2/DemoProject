


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

//testpwd

public class testpwd {

	public static void main(String[] args) {
		
		//test comment for git test
		// TODO Auto-generated method stub
		//CipherUtils ax = new CipherUtils
		System.out.println("hello moto");
		System.out.println("test4");
		System.out.println("Git test");
		System.out.println("Git...9876");
		
		System.out.println("Git test1234");
		// 3 years, 2 months, 1 day
	//	Period period = Period.of(3, 2, 1);
	//	LocalDate oldDate= new LocalDate();
		// Calendar object
		Calendar cal = Calendar.getInstance();
      
       
		// "move" cal to monday this week (i understand it this way)
       cal.set(Calendar.DAY_OF_WEEK, new Date().getDay());

		// calculate monday week ago (moves cal 7 days back)
        cal.add(Calendar.DATE, -6);
       
		Date firstDateOfPreviousWeek = cal.getTime();

		// calculate sunday last week (moves cal 6 days fwd)
		cal.add(Calendar.DATE, 6);
		Date lastDateOfPreviousWeek = cal.getTime();
		
		System.out.println(firstDateOfPreviousWeek);
		System.out.println(lastDateOfPreviousWeek);
		
			}

}
