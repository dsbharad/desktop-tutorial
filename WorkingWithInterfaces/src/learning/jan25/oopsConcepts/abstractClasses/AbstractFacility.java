package learning.jan25.oopsConcepts.abstractClasses;

import learning.jan25.oopsConcepts.interfaces.IVisitor.IFacility;

public abstract class AbstractFacility implements IFacility {

	private Double latitude;
	private Double longititude;
	private String tokenOnVisit;
	private String nameOfFacility;

	public AbstractFacility(Double latitude, Double longititude, String tokenOnVisit, String nameOfFacility) {
		super();
		this.latitude = latitude;
		this.longititude = longititude;
		this.tokenOnVisit = tokenOnVisit;
		this.nameOfFacility = nameOfFacility;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongititude() {
		return longititude;
	}

	public String getTokenOnVisit() {
		return tokenOnVisit;
	}

	public String getNameOfFacility() {
		return nameOfFacility;
	}

	@Override
	public String toString() {
		return "AbstractFacility [latitude=" + latitude + ", longititude=" + longititude + ", tokenOnVisit="
				+ tokenOnVisit + ", nameOfFacility=" + nameOfFacility + "]";
	}

}
