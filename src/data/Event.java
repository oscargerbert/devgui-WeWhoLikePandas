package data;

import java.util.Calendar;
import java.util.Date;

public class Event {
	private Date eventStartDate;
	private Date eventEndDate;

	private String eventPlace;
	private String eventNote;	
	
	public Event() {
		Calendar cal = Calendar.getInstance();
		
		Date startDate = cal.getTime();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		Date endDate = cal.getTime();
		
		String place = "Unknown location";
		String note = "No note";
		setEventStartDate(startDate);
		setEventEndDate(endDate);
		setEventPlace(place);
		setEventNote(note);
	}

	public Event(Date startDate, Date endDate,
			String place, String note) {
		setEventStartDate(startDate);
		setEventEndDate(endDate);
		setEventPlace(place);
		setEventNote(note);
	}

	public Date getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(Date eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public Date getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(Date eventEndDate) {
		this.eventEndDate = eventEndDate;
	}



	public String getEventPlace() {
		return eventPlace;
	}

	public void setEventPlace(String eventPlace) {
		this.eventPlace = eventPlace;
	}

	public String getEventNote() {
		return eventNote;
	}

	public void setEventNote(String eventNote) {
		this.eventNote = eventNote;
	}

	public String toString() {
		String returnString = "";
		returnString += getEventNote() + "\t " 
		+ getEventStartDate().toString() + " - " + getEventEndDate().toString() + "\t " 
		+ getEventPlace();
		return returnString;
	}

}