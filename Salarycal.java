package salarycalc;

public class SalaryCal {
	
	public static double WEEKS_IN_A_YEAR = 52;
	public static double HOURS_IN_A_WEEK = 40;
	public static double WEEKS_IN_A_MONTH = 4.3;
	public static double HOURS_IN_A_DAY = 8;
	private double mYearlySalary;
	private double mMonthlySalary;
	private double mWeeklySalary;
	private double mDaylySalary;
	private double mRate;
	
	
	public void setYearlySalary(double yearlysalary){
		mYearlySalary = yearlysalary;
	}
	
	public void setMonthlySalary(double monthlysalary){
		mMonthlySalary = monthlysalary;
	}
	
	public void setWeeklySalary(double weeklysalary){
		mWeeklySalary = weeklysalary;
	}
	
	public void setDaylySalary(double daylysalary){
		mDaylySalary = daylysalary;
	}
	
	public void setRate(double rate){
		mRate = rate;
	}
	
	public double getYearlySalary(){
		return mYearlySalary;
	}
	
	public double getMonthlySalary(){
		return mMonthlySalary;
	}
	
	public double getWeeklySalary(){
		return mWeeklySalary;
	}
	
	public double getDaylySalary(){
		return mDaylySalary;
	}
	
	public double getRate(){
		return mRate;
	}
	
	//Overloaded Constructor
	public SalaryCal(double rate){
		mRate = rate;
	}
	
	public double CalculateYearly( double rate){
		return rate * WEEKS_IN_A_YEAR * HOURS_IN_A_WEEK;
	}
	
	public double CalculateRately( double yearlyRate){
		return yearlyRate / WEEKS_IN_A_YEAR / HOURS_IN_A_WEEK;
	}
	
	public double CalculateMonthly( double rate){
		return rate * WEEKS_IN_A_MONTH * HOURS_IN_A_WEEK;
	}
	
	public double CalculateWeekly( double rate){
		return rate *  HOURS_IN_A_WEEK;
	}
	
	public double CalculatDayly( double rate){
		return rate *  HOURS_IN_A_DAY;
	}
}
