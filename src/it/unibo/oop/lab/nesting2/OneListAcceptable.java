package it.unibo.oop.lab.nesting2;

import java.util.Iterator;

public class OneListAcceptable<T> implements Acceptable<T> {
	private java.util.List <T> list;
	
	public OneListAcceptable(java.util.List<T> l) {
		this.list = l;
	}


	public Acceptor<T> acceptor() {
		final Iterator<T> it= list.iterator();
		return new Acceptor<T>(){
	            public void accept(final T newElem) throws Acceptor.ElementNotAcceptedException {
	                try {
	                    if (newElem.equals(it.next())) {
	                        return;
	                    }
	                } catch (Exception e) {
	                    System.out.println("end of list");
	                }
	                throw new Acceptor.ElementNotAcceptedException(newElem);
	            }

	            public void end() throws Acceptor.EndNotAcceptedException {
	                try {
	                    if (!it.hasNext()) {	                    	
	                        return;
	                    }
	                } catch (Exception e) {
	                    System.out.println(e.getMessage());
	                }
	                throw new Acceptor.EndNotAcceptedException();
	            }
		};
	}

	
}
