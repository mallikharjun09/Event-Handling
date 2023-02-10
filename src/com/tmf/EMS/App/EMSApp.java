package com.tmf.EMS.App;

import com.tmf.EMS.Services.EMSServices;
import com.tmf.EMS.Services.EMSServicesImpl;
import com.tmf.EMS.models.Events;

public class EMSApp {

	public static void main(String[] args) {
		EMSServices service = new EMSServicesImpl();
		service.menu();
	}

}
