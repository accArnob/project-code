import java.text.SimpleDateFormat;
import java.until.Date;
import java.until.Scanner;

public class DateOfBirth
{
	public static String getDateOfBirth()throws ParseException
	{
		Scanner in = new Scanner(System.in);
		
		int d,m,y;
		String newDate;
		System.out.println("Enter Day: ");
		d = in.nextInt();
		System.out.println("Enter Month: ");
		m = in.nextInt();
		System.out.println("Enter Year: ");
		y = in.nextInt();
		
		newDate = d+"-"+m+"-"+y;
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yy");
		Date d1 = sdf1.parse(newDate);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
		Date d2 = sdf.format(d1);
		
		return d2;
	}
}