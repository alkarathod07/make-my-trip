package com.BikkadIT.MakeMyTripClientApp.PassangerService;

import java.util.List;

import com.BikkadIT.MakeMyTripClientApp.model.Passanger;
import com.BikkadIT.MakeMyTripClientApp.model.Ticket;

public interface PassangerServiceI {
	
	public abstract Ticket bookTicket(Passanger psg);

}
