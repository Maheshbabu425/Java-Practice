package java2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// To get the current date by using Date class in java
		Date d = new Date();
		System.out.println(d.toString());
		
		
		// To get the date in a particular format by using SimpleDateFormate class in java
		Date da = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String date = sdf.format(da);
		System.out.println(date);
		
				
		// To get the date in a particular format with time also
		Date dat = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		String date1 = sd.format(dat);
		System.out.println(date1);
			
			}

}
