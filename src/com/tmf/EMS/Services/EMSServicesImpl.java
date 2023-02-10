package com.tmf.EMS.Services;

import java.util.Calendar;
import java.util.List;
import com.tmf.EMS.dao.EventsDAO;
import com.tmf.EMS.dao.EventsDAOImpl;
import com.tmf.EMS.models.Events;

public class EMSServicesImpl implements EMSServices{

	public static int N = 1;
	@Override
	public void newEvent() { 
		//adding  new events in future if not present.
		System.out.print("Enter Event Date format in DD-MM-YYYY: ");
		String Date = scan.nextLine();
		scan.nextLine();
		System.out.println("Enter Event Name  : ");
		String eventName = scan.nextLine();
		scan.nextLine();
		System.out.println("Type of Decoration : ");
		String doc = scan.nextLine();
		scan.nextLine();
		System.out.println("Type of Music : ");
		String music = scan.nextLine();
		scan.nextLine();
		System.out.println("Package to the total Event :");
		int pac = scan.nextInt();
		scan.nextLine();
		
	
		Events eve = new Events();
		eve.setEventNum(N);
		eve.setDateOfEvent(Date);
		eve.setEventName(eventName);
		eve.setDecoration(doc);
		eve.setMusicType(music);
		eve.setPackages(pac);
		dao.addNewEvent(eve);
		N++;
   }

	@Override
	public void displayAllEvents() {
		List<Events> events = dao.displayAllEvents();
		for(Events evn : events) {
			//display each event
			dao.displayEvents(evn);
		}
		
	}

	

	@Override
	public void displayEventsByNames() {         
		System.out.println("List of Event Names that we celebrate : ");
		System.out.println("1. Birthday Events\t 2. Anniversary Events \n 3. Wedding Events\t 4. Party Events \n 5. Devotional Events\t 6. Corporate Events\n 7.Product launch Events\t 8. Trade show Events");
		System.out.println("choose the Event Type:");
		String eventName = scan.next();
		
}

	@Override
	public void displaydecoration() {
		//display through the decoration same type
		System.out.println("Some of the Decoration types:");
		System.out.println("1. Balloon Decorations 2. Flower Decorations 3. Clothing Decorations");
		String deco = scan.next();
		List<Events> events = dao.displaydecoration(deco);
		for(Events e : events) {
			dao.displayEvents(e);
		}
		
	}
	
	@Override
	public void display_dateOfEvents() {                             
		//ask the user to enter the event date
		System.out.println("Enter the Event Date : ");
		String ed = scan.next();
		List<Events> events = dao.display_dateOfEvent(ed);
		for(Events e : events) {
			dao.displayEvents(e);
		}
	}

	public void packages(){
		System.out.println("Enter the Package : ");
		int ed = scan.nextInt();
		List<Events> events = dao.packages(ed);
		for(Events e : events) {
			dao.displayEvents(e);
		}
	}

	@Override
	public void menu(){
		while(true) {
			System.out.println("1. Add new Event to list : ");
			System.out.println("2. Display All Events: ");
			System.out.println("3. Display Event through Number:");
			System.out.println("4. Display Events through same Event Name: ");
			System.out.println("5.Display Events through same decoration type:");
			System.out.println("6. Display Events by same Events Date:");
			System.out.println("7. Package of the entire Event:");
     		System.out.println("press 0 to exist");
			int ch = scan.nextInt();// this for switch case variables
			switch(ch){
			case 1 : newEvent(); break;
			case 2 : displayAllEvents(); break;
			case 3 : System.out.println("Enter Event number ");
					 int num = scan.nextInt();
					 displayEventById(num);break;
			case 4 : displayEventsByNames(); break;
			case 5 :displaydecoration(); break;
			case 6 : display_dateOfEvents(); break;
			case 7 : packages(); break;
			case  0: System.exit(0);
			default : System.out.println("Entered Event details were not found");
			}
		}
		
	}

	@Override
	public void displayEventById(int x) {
		dao.eventNum(x);		
	}

	



	

	

}
