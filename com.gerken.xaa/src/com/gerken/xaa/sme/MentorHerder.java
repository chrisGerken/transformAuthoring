package com.gerken.xaa.sme;

public class MentorHerder {

	private static MentorHerder	instance;
	
	private MentorHerder() {
	}

	public static MentorHerder getInstance() {
		if (instance == null) {
			instance = new MentorHerder();
		}
		return instance;
	}
	
	public IXaaMentor[] getMentors() {
		IXaaMentor[] result = new IXaaMentor[4];
		result[0] = new BasicMentor();
		result[1] = new JavaMentor();
		result[2] = new MavenMentor();
		result[3] = new Ios4Mentor();
		return result;
	}
}
