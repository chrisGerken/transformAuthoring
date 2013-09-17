/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2011.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package com.gerkenip.xaa.jet.internal.exception;

import java.text.MessageFormat;

import org.eclipse.jet.taglib.JET2TagException;

import com.gerkenip.xaa.jet.internal.i10.XaaMessages;

public class MissingRequiredAttributeException extends JET2TagException {

	private static final long serialVersionUID = -143366914438772236L;

	private String tagName;
	private String attributeName;
	
	public MissingRequiredAttributeException(String tagName, String attributeName) {
		super();
		this.tagName = tagName;
		this.attributeName = attributeName;
	}

	public String getLocalizedMessage() {
		return buildMessage();
	}

	public String getMessage() {
		return buildMessage();
	}

	public String toString() {
		return buildMessage();
	}

	private String buildMessage() {
		return MessageFormat.format(getPattern(),getArgs());
	}

	private String getPattern() {
		return XaaMessages.MissingRequiredAttributeException_MissingAttribute;
	}

	private Object[] getArgs() {
		String args[] = new String[2];
		args[0] = tagName;
		args[1] = attributeName;
		return args;
	}

	
}
