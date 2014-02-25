package data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Keeps track of all events
 * @author Jonas
 *
 */

public class EventMgr {

	public static void main(String[] args)
	{
		EventMgr testManager = new EventMgr();
		Calendar c = Calendar.getInstance();
		
		//Create some test dates 
		Date now = new Date();
		Date later = new Date(); later.setTime(c.getTimeInMillis() + 3600*1000);//add 1h
		Date evenLater = new Date(); evenLater.setTime(c.getTimeInMillis() + 3600*3000);// add 3 h
		Date tomorrow = new Date(); c.add(Calendar.DAY_OF_MONTH, 1); tomorrow.setTime(c.getTimeInMillis());
		Date tomorrowLater = new Date(); tomorrowLater.setTime(c.getTimeInMillis() + 3600*3000);
		Date tomorrowEvenLater = new Date(); tomorrowEvenLater.setTime(c.getTimeInMillis() + 3600*8000);
		
		testManager.addEvent();//now, tomorrow, "unknown location", "no note"		
		testManager.addEvent(later, evenLater, "Ekonomikum", "Fest");
		testManager.addEvent(now, later, "Polacks", "Föreläsning");
		testManager.addEvent(tomorrow, tomorrowLater, "Ångströms", "UTNARM");
		
		
		System.out.println(testManager.toString());
		
		System.out.println("Event 1: " + testManager.getEvent(0).toString());
		System.out.println("Event 2: " + testManager.getEvent(1).toString());
		
		ArrayList<Event> testList = testManager.getEventsOnDay(tomorrowLater); 
		System.out.println("Events tomorrow: " + testList.toString());
	}
	private ArrayList<Event> eventList;
	
	/**
	 * 
	 */
	public EventMgr()
	{
		eventList = new ArrayList<Event>();
	}
	
	/**
	 * Adds a default event to the list of events
	 * @return
	 */
	public Event addEvent()
	{
		Event e = new Event();
		addEventSorted(e);
		return e;
		
	}
	/**
	 * Creates a new event with the following parameters and adds it to the list of events
	 * @param startDate Date object
	 * @param endDate Date object
	 * @param startTime Time object
	 * @param endTime Time object
	 * @param place String
	 * @param note String
	 * @return
	 */
	public Event addEvent(Date startDate, Date endDate, 
			String place, String note)
	{
		Event e = new Event(startDate, endDate, place, note);
		addEventSorted(e);
		return e;
	}
	
	/**
	 * Adds an event to the arrayList of Events, sorted by date.
	 * @param e the new event to add to the list
	 */
	private void addEventSorted(Event e)
	{
		if (eventList.size()==0)
		{
			eventList.add(e);			
		}
		else
		{
			boolean added = false;
			for(int i=0; i<eventList.size(); i++)
			{
				Event iEvent = getEvent(i);
				if(iEvent.getEventStartDate().before(e.getEventStartDate()))
				{
					continue;
					//eventList.add(i+1,e);
					//added = true;
				}
				else
				{
					eventList.add(i,e);
					added = true;
					break;
				}
			}
			if (added == false)
			{
				eventList.add(e);
			}
		}
	}
	
	/**
	 * Returns the Event at position "number" in the list. null if Event does not exist.
	 * @param number
	 * @return
	 */
	public Event getEvent(int number)
	{
		if (number >= 0 && number < eventList.size())
		{
			return eventList.get(number);
		}
		else
		{
			return null;
		}
	}
	
	public ArrayList<Event> getEventsOnDay(Date theDate)
	{
		ArrayList<Event> returnList = new ArrayList<Event>();
		//Add dates that matches start date to the list
		for(int i=0; i<eventList.size(); i++)
		{
			Event iEvent = getEvent(i);
			if (compareOnlyDate(iEvent.getEventStartDate(), theDate))
			{
				returnList.add(iEvent);
			}
		}
		//Add dates that matches end date to the list
		for(int i=0; i<eventList.size(); i++)
		{
			Event iEvent = getEvent(i);
			if (compareOnlyDate(iEvent.getEventEndDate(), theDate))
			{
				returnList.add(iEvent);
			}
		}
		return returnList;
	}
	
	private boolean compareOnlyDate(Date d1, Date d2)
	{
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(d1);
		c2.setTime(d2);

		int yearDiff = c1.get(Calendar.YEAR) - c2.get(Calendar.YEAR);
		int monthDiff = c1.get(Calendar.MONTH) - c2.get(Calendar.MONTH);
		int dayDiff = c1.get(Calendar.DAY_OF_MONTH) - c2.get(Calendar.DAY_OF_MONTH);
		return (yearDiff == 0 && monthDiff == 0 && dayDiff == 0);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String returnString = "";
//		for(int i=0; i<eventList.size(); i++)
//		{
//			returnString += eventList.get(i).getString() + "\n";
//		}
		
		for(Event e : eventList)
		{
			returnString += e.toString() + "\n";
		}
		return returnString;
	}
	
	
	
}