package org.formacion;

import java.util.Collection;

public interface Agrupador {

	void add (Object elemento);
	
	int numeroElementos();

	default void addAll(Collection collection){
		for (Object elem : collection) {
			this.add(elem);
		}
	}
	
}
