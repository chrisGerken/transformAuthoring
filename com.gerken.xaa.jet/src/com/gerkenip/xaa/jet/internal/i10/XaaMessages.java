/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2011.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package com.gerkenip.xaa.jet.internal.i10;

import org.eclipse.osgi.util.NLS;

/**
 * An accessor class for externalized strings.
 * 
 */
public class XaaMessages extends NLS {

	private static final String BUNDLE_NAME = "com.gerkenip.xaa.jet.internal.i10.XaaMessages"; //$NON-NLS-1$

	public static String ExpressionTranslationException_ErrorTranslatingExpression;

	public static String MissingRequiredAttributeException_MissingAttribute;

	public static String InvalidAttributeException_InvalidAttribute;

	public static String NoMatchingNodeException_NoNodesMatching;

	static {
		NLS.initializeMessages(BUNDLE_NAME, XaaMessages.class);
	}
}
