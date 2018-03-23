package com.cdc.mitrais.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ForEachTag extends SimpleTagSupport {

	private Object[] items;
	private String attributeName;

	public void doTag() throws JspException, IOException{

		for(Object item : items) {
			getJspContext().setAttribute(attributeName, item);
			getJspBody().invoke(null);
		}
	}

	public Object[] getItems() {
		return items;
	}

	public void setItems(Object[] items) {
		this.items = items;
	}

	public void setVar(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}


}
