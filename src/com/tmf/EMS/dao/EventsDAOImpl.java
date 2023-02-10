package com.tmf.EMS.dao;

import java.util.ArrayList;
import java.util.List;
import com.tmf.EMS.models.Events;

public class EventsDAOImpl implements EventsDAO{
	
	@Override
	public void addNewEvent(Events ev) {
		events.add(ev);
		System.out.println("New Event has been added successfully.");
		
	}

	@Override
	public List<Events> displayAllEvents() {
		// what the event available in the list to be entered r displayed. 
		return events;
	}

	@Override
	public Events eventNum(int N) {
		Events event = new Events();
		event.setEventNum(0);
		//int temp = 0;
		//outer object "event" is saved into inner/current object as "Eo".
		for(Events Eo : events) {
			if(Eo.getEventNum() == N) {
				//temp++;
				event = Eo;
				break;
			}
		}
		return event;
	}
		
	@Override
	public void displayEvents(Events details) {
		// displaying event details.
		System.out.println(details.getEventNum() + "\t");
		System.out.println(details.getDateOfEvent() + "\t");
		System.out.println(details.getEventName() + "\t");
		System.out.println(details.getDecoration() + "\t");
		System.out.println(details.getMusicType() + "\t");
		System.out.println(details.getPackages());
		
		
	}
	
	@Override
	public List<Events>  displaydecoration(String typeOfDec) {

		List<Events> evens = new ArrayList<Events>();

		for(Events D : events) {
			if(D.getDecoration().equals(typeOfDec)) {
				evens.add(D);
				break;
			}
		}
		return events;
		
	}

	@Override
	public List<Events> display_dateOfEvent(String eventdate) {
		List<Events> evens = new ArrayList<Events>();

		for(Events D : events) {
			if(D.getDecoration().equals(eventdate)) {
				evens.add(D);
				break;
			}
		}
		return events;
		
	}


	@Override
	public List<Events> packages(int p) {
		List<Events> evens = new ArrayList<Events>();

		for(Events D : events) {
			if(D.getPackages() == p) {
				evens.add(D);
				break;
			}
		}
		return events;
	}
}
