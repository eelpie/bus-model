package uk.co.eelpieconsulting.busroutes.model;

import java.util.HashSet;
import java.util.Set;

public class Stop {

	private final int id;
	private final String name;
	private final String towards;
	private final String indicator;
	private final double latitude;
	private final double longitude;
	private final Set<Route> routes;
	private final Boolean nationalRail, tube;

	public Stop(int id, String name, String towards, String indicator, double latitude, double longitude, Boolean nationalRail, Boolean tube) {
		this.id = id;
		this.name = name;
		this.towards = towards;
		this.indicator = indicator;
		this.latitude = latitude;
		this.longitude = longitude;
		this.nationalRail = nationalRail;
		this.tube = tube;
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

	public void addRoute(Route route) {
		routes.add(route);
	}
	
	public Set<Route> getRoutes() {
		return routes;
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
		return "Stop [id=" + id + ", indicator=" + indicator + ", latitude="
				+ latitude + ", longitude=" + longitude + ", name=" + name
				+ ", nationalRail=" + nationalRail + ", routes=" + routes
				+ ", towards=" + towards + ", tube=" + tube + "]";
	}
	
}
