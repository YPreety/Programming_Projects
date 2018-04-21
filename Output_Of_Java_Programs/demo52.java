package Output_Of_Java_Programs;

import java.util.EnumSet;
import java.util.Set;

public class demo52 {

	private enum Days {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
		public static Set<Days> allDays = EnumSet.allOf(Days.class);
		public static Set<Days> weekDays = EnumSet.range(Monday, Friday);
		public boolean isWeekDay() {
			return weekDays.contains(this);
		}
	}

	public static void main(String[] args) {
		System.out.println(Days.weekDays.size());  //5
		Days day = Days.Monday;
		System.out.println((day.isWeekDay() ? "is WeekDay" : "is weekEnd")); //is WeekDay
		day = Days.Sunday;
		System.out.println((day.isWeekDay() ? "is WeekDay" : "is weekEnd")); //is weekEnd
		day = Days.Monday;
		System.out.println(Days.allDays.contains(day)); //true
		System.out.println(day.ordinal()); //0
	}
}
