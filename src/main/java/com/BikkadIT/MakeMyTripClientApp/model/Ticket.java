package com.BikkadIT.MakeMyTripClientApp.model;

public class Ticket {
private int tid;
	
    private int pnr;
	
	private String ticketStatus;
	
	private Double ticketPrice;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", pnr=" + pnr + ", ticketStatus=" + ticketStatus + ", ticketPrice=" + ticketPrice
				+ "]";
	}

	public Ticket(int tid, int pnr, String ticketStatus, Double ticketPrice) {
		super();
		this.tid = tid;
		this.pnr = pnr;
		this.ticketStatus = ticketStatus;
		this.ticketPrice = ticketPrice;
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
