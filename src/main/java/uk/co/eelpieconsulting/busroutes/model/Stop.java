package uk.co.eelpieconsulting.busroutes.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Stop implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String towards;
	private String indicator;
	private double latitude;
	private double longitude;
	private Set<Route> routes;
	private Boolean nationalRail, tube, tram;
	
	public Stop() {
		this.routes = new HashSet<Route>();
	}
	
	public Stop(int id, String name, String towards, String indicator, double latitude, double longitude, Boolean nationalRail, Boolean tube, Boolean tram) {
		this.id = id;
		this.name = name;
		this.towards = towards;
		this.indicator = indicator;
		this.latitude = latitude;
		this.longitude = longitude;
		this.nationalRail = nationalRail;
		this.tube = tube;
		this.tram = tram;
		this.routes = new HashSet<Route>();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getTowards() {
		return towards;
	}

	public String getIndicator() {
		return indicator;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
	
	public Boolean isNationalRail() {
		return nationalRail;
	}

	public Boolean isTube() {
		return tube;
	}
	
	public Boolean isTram() {
		return tram;
	}
	
	public void addRoute(Route route) {
		routes.add(route);
	}
	
	public Set<Route> getRoutes() {
		return routes;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setTowards(String towards) {
		this.towards = towards;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Stop other = (Stop) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Stop [id=" + id + ", name=" + name + ", towards=" + towards
				+ ", indicator=" + indicator + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", routes=" + routes
				+ ", nationalRail=" + nationalRail + ", tube=" + tube
				+ ", tram=" + tram + "]";
	}
	
}
