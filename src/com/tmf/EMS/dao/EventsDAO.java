package com.tmf.EMS.dao;

import java.util.ArrayList;
import java.util.List;
import com.tmf.EMS.models.Events;


public interface EventsDAO {
	//create a list of events using generic;
	List<Events> events =  new ArrayList<Events>();

	void addNewEvent(Events ev);
	List<Events> displayAllEvents();
	Events eventNum(int N);
	void displayEvents(Events details);
	List<Events>  displaydecoration(String typeOfDec);
	List<Events>  display_dateOfEvent(String eventdate);
	List<Events>  packages(int p);    
	
	//void EventsList();// In place of menu ---> EventsList
	//create child class was eventsDAOImpl class

}


