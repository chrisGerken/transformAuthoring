/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2011.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package com.gerkenip.xaa.jet.internal.function;

		/*  Begin imports */

import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.jet.xpath.Context;
import org.eclipse.jet.xpath.XPathFunction;
import org.eclipse.jet.xpath.XPathFunctionWithContext;
import org.eclipse.jet.xpath.XPathUtil;

		/*  End imports */

public class ToJetTagsFunction implements XPathFunction, XPathFunctionWithContext {

	private Context context;

	public ToJetTagsFunction() {
		super();
	}

	public Object evaluate(List args) {
	
		String _expression = null;
	
		if (args.size() > 0) {
			_expression = XPathUtil.xpathString(args.get(0));
		}

		/**
	 	 *  Begin function logic
		 */

		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(_expression,"{}",true);
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if (token.equals("{")) {
				sb.append("<c:get select=\"");
			} else if (token.equals("}")) {
				sb.append("\" />");
			} else {
				sb.append(token);
			}
		}
		return sb.toString();

		/**
	 	 *  End function logic
		 */
	}

	public void setContext(Context context) {
		this.context = context;
	}

		/*  Begin custom methods */

		/*  End custom methods */

}
