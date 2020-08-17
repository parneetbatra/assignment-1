package library.entities;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// Author: Parneet Singh
// Reviewer: Tawan Chotikanchinda, Aatish Rajkarnikar, Chandrika Katikam

public class Calendar {
	
	// private static Calendar sElF;
	private static Calendar SELF_CALENDER; // sElF change to SELF_CALENDER
	// private static java.util.Calendar cAlEnDaR;
	private static java.util.Calendar CALENDER; // cAlEnDaR change to CALENDER
	
	private Calendar() {
		// cAlEnDaR = java.util.Calendar.getInstance();
		CALENDER = java.util.Calendar.getInstance(); // cAlEnDaR change to CALENDER
	}
	
	// public static Calendar gEtInStAnCe() {
	public static Calendar getInstance() { // gEtInStAnCe change to getInstance
		// if (sElF == null) {
		if (SELF_CALENDER == null) { // sElF change to SELF_CALENDER
			// sElF = new Calendar();
			SELF_CALENDER = new Calendar(); // sElF change to SELF_CALENDER
		}
		// return sElF;
		return SELF_CALENDER; // sElF change to SELF_CALENDER
	}
	
	public void incrementDate(int days) {
		// cAlEnDaR.add(java.util.Calendar.DATE, days);
		CALENDER.add(java.util.Calendar.DATE, days); // cAlEnDaR change to CALENDER
	}
	
	// public synchronized void SeT_DaTe(Date DaTe) {
	public synchronized void setDate(Date date) { // SeT_DaTe change to setDate, DaTe change to date
		try {
			// cAlEnDaR.setTime(DaTe);
			CALENDER.setTime(date); // cAlEnDaR change to CALENDER, DaTe change to date
			// cAlEnDaR.set(java.util.Calendar.HOUR_OF_DAY, 0);  
			CALENDER.set(java.util.Calendar.HOUR_OF_DAY, 0);   // cAlEnDaR change to CALENDER
			// cAlEnDaR.set(java.util.Calendar.MINUTE, 0);  
			CALENDER.set(java.util.Calendar.MINUTE, 0);   // cAlEnDaR change to CALENDER
			// cAlEnDaR.set(java.util.Calendar.SECOND, 0);  
			CALENDER.set(java.util.Calendar.SECOND, 0);   // cAlEnDaR change to CALENDER
			// cAlEnDaR.set(java.util.Calendar.MILLISECOND, 0);
			CALENDER.set(java.util.Calendar.MILLISECOND, 0); // cAlEnDaR change to CALENDER
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}	
	}
	
	// public synchronized Date gEt_DaTe() {
	public synchronized Date getDate() { // gEt_DaTe change to getDate
		try {
			// cAlEnDaR.set(java.util.Calendar.HOUR_OF_DAY, 0);  
			CALENDER.set(java.util.Calendar.HOUR_OF_DAY, 0);   // cAlEnDaR change to CALENDER
			// cAlEnDaR.set(java.util.Calendar.MINUTE, 0); 
			CALENDER.set(java.util.Calendar.MINUTE, 0); // cAlEnDaR change to CALENDER
			// cAlEnDaR.set(java.util.Calendar.SECOND, 0);  
			CALENDER.set(java.util.Calendar.SECOND, 0);   // cAlEnDaR change to CALENDER
			// cAlEnDaR.set(java.util.Calendar.MILLISECOND, 0);
			CALENDER.set(java.util.Calendar.MILLISECOND, 0); // cAlEnDaR change to CALENDER
			// return cAlEnDaR.getTime();
			return CALENDER.getTime(); // cAlEnDaR change to CALENDER
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}	
	}

	// public synchronized Date gEt_DuE_DaTe(int loanPeriod) {
	public synchronized Date getDueDate(int loanPeriod) { // gEt_DuE_DaTe change to getDueDate
		// Date nOw = gEt_DaTe();
		Date nOw = getDate(); // nOw change to now, gEt_DaTe change to getDate
		// cAlEnDaR.add(java.util.Calendar.DATE, loanPeriod);
		CALENDER.add(java.util.Calendar.DATE, loanPeriod); // cAlEnDaR change to CALENDER
		// Date dUeDaTe = cAlEnDaR.getTime();
		Date dueDate = CALENDER.getTime(); // dUeDaTe change to dueDate, cAlEnDaR change to CALENDER
		// cAlEnDaR.setTime(nOw);
		CALENDER.setTime(nOw); // cAlEnDaR change to CALENDER, nOw change to now
		// return dUeDaTe;
		return dUeDaTe; // dUeDaTe change to dueDate
	}
	
	// public synchronized long GeT_DaYs_DiFfErEnCe(Date targetDate) {
	public synchronized long getDaysDifference(Date targetDate) { // GeT_DaYs_DiFfErEnCe change to getDaysDifference
		// long Diff_Millis = gEt_DaTe().getTime() - targetDate.getTime();
		long diffMillis = getDate().getTime() - targetDate.getTime(); // Diff_Millis change to diffMillis, gEt_DaTe change to getDate
		// long Diff_Days = TimeUnit.DAYS.convert(Diff_Millis, TimeUnit.MILLISECONDS);
		long diffDays = TimeUnit.DAYS.convert(diffMillis, TimeUnit.MILLISECONDS); // Diff_Days change to diffDays, Diff_Millis change to diffMillis
		// return Diff_Days;
		return diffDays; // Diff_Days change to diffDays
	}

}
