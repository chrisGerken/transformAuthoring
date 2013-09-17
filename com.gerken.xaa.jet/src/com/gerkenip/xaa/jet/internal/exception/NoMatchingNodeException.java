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

public class NoMatchingNodeException extends JET2TagException {

	private static final long serialVersionUID = -143366914438772236L;

	private String tagName;
	private String attributeName;
	private String expression;
	
	public NoMatchingNodeException(String tagName, String attributeName, String expression) {
		super();
		this.tagName = tagName;
		this.attributeName = attributeName;
		this.expression = expression;
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
		return XaaMessages.NoMatchingNodeException_NoNodesMatching;
	}

	private Object[] getArgs() {
		String args[] = new String[3];
		args[0] = tagName;
		args[1] = attributeName;
		args[2] = expression;
		return args;
	}

	
}
