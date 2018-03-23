package com.cdc.mitrais.tags;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.cdc.mitrais.model.CustomerBean;

public class MakeTableTagV2 extends SimpleTagSupport{
	private List<CustomerBean> rowItems;
	private String headerClass;
	private String bodyClass;
	
	public void doTag() throws JspException, IOException{

		if(getRowItems().size() > 0) {
			JspContext context = getJspContext();
			JspWriter out = context.getOut();
			out.println("<TABLE BORDER=1>");
			Object[] headingRow = {"NAME","SEX","MARRIED","AGE","CHILDREN","SMOKER"};
			printHeader(headingRow, getStyle(headerClass), out);
			printOneRowFromListOfObject(rowItems, getStyle(bodyClass), out);
			out.println("</TABLE>");
		}
	}

	private void printHeader(Object[] columnEntries, Object style, JspWriter out) throws IOException {

		out.println(" <TR" + style + ">");

		for(Object columnEntry: columnEntries) {
			out.println(" <TD>" + columnEntry + "</TD>");
		}
		out.println(" </TR>");

	}
	
	private void printOneRowFromListOfObject(List<CustomerBean> custList, Object style, JspWriter out) throws IOException {

		
		
		for(CustomerBean cust: custList) {
			out.println(" <TR" + style + ">");
			out.println(" <TD>" + cust.getFname()+" "+cust.getLname() + "</TD>");
			out.println(" <TD>" + cust.getSex()+ "</TD>");
			out.println(" <TD>" + cust.getMarried()+ "</TD>");
			out.println(" <TD>" + cust.getAge()+ "</TD>");
			out.println(" <TD>" + cust.getChildren()+ "</TD>");
			out.println(" <TD>" + cust.getSmoker()+ "</TD>");
			out.println(" </TR>");
		}
		
		

	}

	private Object getStyle(String className) {
		
		if (className == null) {
			return("");
		} else {
			return(" CLASS=\"" + headerClass + "\"");
		}
	}

	
	public String getHeaderClass() {
		return headerClass;
	}
	public void setHeaderClass(String headerClass) {
		this.headerClass = headerClass;
	}
	public String getBodyClass() {
		return bodyClass;
	}
	public void setBodyClass(String bodyClass) {
		this.bodyClass = bodyClass;
	}


	public List<CustomerBean> getRowItems() {
		return rowItems;
	}


	public void setRowItems(List<CustomerBean> rowItems) {
		this.rowItems = rowItems;
	}
}
