package uk.co.eelpieconsulting.busroutes.model;

import java.io.Serializable;

public class Message implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private int stopId;
	private String message;
	private int priority;
	private long startDate;
	private long endDate;
	
	public Message() {
	}
	
	public Message(String id, int stopId, String message, int priority, long startDate, long endDate) {
		this.id = id;
		this.stopId = stopId;
		this.message = message;
		this.priority = priority;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getId() {
		return id;
	}
	public int getStopId() {
		return stopId;
	}
	public String getMessage() {
		return message;
	}
	public int getPriority() {
		return priority;
	}
	public long getStartDate() {
		return startDate;
	}
	public long getEndDate() {
		return endDate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + stopId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (stopId != other.stopId)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Message [endDate=" + endDate + ", id=" + id + ", message="
				+ message + ", priority=" + priority + ", startDate="
				+ startDate + ", stopId=" + stopId + "]";
	}
	
}
