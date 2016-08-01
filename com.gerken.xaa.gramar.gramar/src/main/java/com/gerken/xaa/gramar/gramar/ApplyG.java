package com.gerken.xaa.gramar.gramar;

import org.gramar.Apply;
import org.gramar.exception.GramarException;
import org.gramar.util.PropertiesHelper;

public class ApplyG extends Apply {

	@Override
	public void defaultValues(PropertiesHelper pm) {
		super.defaultValues(pm);
	}

	public static void main (String[] args) {

		String[] a = { "gramar=com.gerken.xaa.gramar.gramar" , "diagram" };
		try {
			new ApplyG().apply(a);
		} catch (GramarException e) {
			System.err.println(e.toString());
		}

	}

}
