package com.wipro.bbs.entity;

public class Bus {
	private String busId;
	private String source;
    private String destination;
    private String busType;
    private int totalSeats;
    private int availableSeats;
    private double baseFare;
    public Bus(String busId, String source, String destination, String busType, int totalSeats, int availableSeats,
			double baseFare) {
		super();
		this.busId = busId;
		this.source = source;
		this.destination = destination;
		this.busType = busType;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
		this.baseFare = baseFare;
	}
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
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
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public double getBaseFare() {
		return baseFare;
	}
	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", source=" + source + ", destination=" + destination + ", busType=" + busType
				+ ", totalSeats=" + totalSeats + ", availableSeats=" + availableSeats + ", baseFare=" + baseFare + "]";
	}
    
    

}
