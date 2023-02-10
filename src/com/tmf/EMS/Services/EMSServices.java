package com.tmf.EMS.Services;

import java.util.List;
import java.util.Scanner;
import com.tmf.EMS.dao.EventsDAO;
import com.tmf.EMS.dao.EventsDAOImpl;
import com.tmf.EMS.models.Events;

public interface EMSServices {
	EventsDAO dao = new EventsDAOImpl();
	Scanner scan = new Scanner(System.in);
	
	void newEvent();
	void displayAllEvents();
	void displayEventById(int x);
	void displayEventsByNames();
	void displaydecoration();
	void display_dateOfEvents();
	void packages();
	void menu();
}


