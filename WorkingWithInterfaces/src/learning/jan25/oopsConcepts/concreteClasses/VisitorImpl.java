package learning.jan25.oopsConcepts.concreteClasses;

import learning.jan25.oopsConcepts.abstractClasses.AbstractVisitor;
import learning.jan25.oopsConcepts.interfaces.IVisitor;

public class VisitorImpl extends AbstractVisitor implements IVisitor {

	@Override
	public void visitFacility(IFacility facility) {
		System.out.println("I visited");

	}

}
