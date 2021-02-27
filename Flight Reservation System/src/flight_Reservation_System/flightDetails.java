package flight_Reservation_System;

public class flightDetails {
	private String flightNo;
	private String source;
	private String destination;
	private String jdate, rdate;
	private String jtime, rtime;
	private String journey_type;
	private String ticket_type;

	public String getTicket_type() {
		return ticket_type;
	}

	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getJdate() {
		return jdate;
	}

	public void setJdate(String jdate) {
		this.jdate = jdate;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public String getJtime() {
		return jtime;
	}

	public void setJtime(String jtime) {
		this.jtime = jtime;
	}

	public String getRtime() {
		return rtime;
	}

	public void setRtime(String rtime) {
		this.rtime = rtime;
	}

	public String getJourney_type() {
		return journey_type;
	}

	public void setJourney_type(String journey_type) {
		this.journey_type = journey_type;
	}

}
