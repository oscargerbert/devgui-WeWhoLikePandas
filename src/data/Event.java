package data;

import java.sql.Time;
import java.util.Date;

public class Event {
	private Date eventStartDate;
	private Date eventEndDate;
	private Time eventStartTime;
	private Time eventEndTime;
	private String eventPlace;
	private String eventNote;
	
	public Event() {
		// TODO Auto-generated constructor stub
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

	public Time getEventStartTime() {
		return eventStartTime;
	}

	public void setEventStartTime(Time eventStartTime) {
		this.eventStartTime = eventStartTime;
	}

	public Time getEventEndTime() {
		return eventEndTime;
	}

	public void setEventEndTime(Time eventEndTime) {
		this.eventEndTime = eventEndTime;
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

}
