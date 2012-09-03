package com.phinisi.whentag.data;

import java.util.Calendar;

/**
 * 
 * @author Muhammad Anis
 * Class Utama untuk data appoinment
 */
public class Appoinment {

	/**
	 * Di tag oleh :
	 */
	public String taggedBy;
	
	/**
	 * Judul appoinment
	 */
	public String title;
	
	/**
	 * Subjek
	 */
	public String subject;
	
	/**
	 * Tempat
	 */
	public String place;
	
	/**
	 * Date and Time
	 */
	public Calendar dateAndTime;
	
	public Appoinment(String taggedBy,String title,String subject, String place,Calendar dateAndTime)
	{
		this.taggedBy = taggedBy;
		this.title = title;
		this.subject = subject;
		this.place = place;
		this.dateAndTime = dateAndTime;
	}
	
}
