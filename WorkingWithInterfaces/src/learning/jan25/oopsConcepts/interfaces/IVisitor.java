package learning.jan25.oopsConcepts.interfaces;

public interface IVisitor {
	
	interface IFacility{
		public String getAcknowledgement();
	}
	
	public void visitFacility(IFacility facility);

}
