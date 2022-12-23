package com.BikkadIT.MakeMyTripClientApp.PassangerService;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.BikkadIT.MakeMyTripClientApp.model.Passanger;
import com.BikkadIT.MakeMyTripClientApp.model.Ticket;
@Service
public class PassangerServiceImpl implements PassangerServiceI {

	@Override
	public Ticket bookTicket(Passanger psg) {
		String url="http://localhost:9494/bookTicket";
		
		/*WebClient webclient=WebClient.create();
		Ticket ticket = webclient.post()
		.contentType(MediaType.APPLICATION_JSON)
		.accept(MediaType.APPLICATION_JSON)
		.body(BodyInserters.fromValue(psg)).retrieve().bodyToMono(Ticket.class).block();
		
				return ticket;*/
				
				RestTemplate rt=new RestTemplate();
		System.out.println(psg);
		
 ResponseEntity<Ticket> ticket = rt.postForEntity(url,psg, Ticket.class);
		Ticket body = ticket.getBody();
		return body;
	
	}

}
