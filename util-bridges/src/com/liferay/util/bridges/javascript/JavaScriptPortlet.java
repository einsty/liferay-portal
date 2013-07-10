/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.util.bridges.javascript;

import com.liferay.util.bridges.scripting.ScriptingPortlet;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;

/**
 * @author Jorge Ferrer
 * @author Alberto Montero
 * @author Brian Wing Shun Chan
 */
public class JavaScriptPortlet extends ScriptingPortlet {

	@Override
	public void init() throws PortletException {
		super.init();

		language = _LANGUAGE;
	}

	@Override
	protected String getFileName(RenderRequest renderRequest) {
		return renderRequest.getParameter("javascriptFile");
	}

	private static final String _LANGUAGE = "javascript";

}