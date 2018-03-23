package com.cdc.mitrais.tags;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.cdc.mitrais.model.CustomerBean;

public class MakeTableTag extends SimpleTagSupport {
	
	private Object[][] rowItems;
	private String headerClass;
	private String bodyClass;
	
	public void doTag() throws JspException, IOException{

		
		if(rowItems.length > 0) {
			JspContext context = getJspContext();
			JspWriter out = context.getOut();
			out.println("<TABLE BORDER=1>");
			Object[] headingRow = rowItems[0];
			printOneRow(headingRow, getStyle(headerClass), out);

			int counter = 0;
			
			for(Object[] bodyRow: rowItems) {
				if(counter != 0) {
					printOneRow(bodyRow, getStyle(bodyClass), out);
				}
				counter++;
			}
			out.println("</TABLE>");
		}
	}

	private void printOneRow(Object[] columnEntries, Object style, JspWriter out) throws IOException {
		
		out.println(" <TR" + style + ">");
		
		for(Object columnEntry: columnEntries) {
			out.println(" <TD>" + columnEntry + "</TD>");
		}
		out.println(" </TR>");
		
	}
	
	private void printOneRowFromListOfObject(List<CustomerBean> custList, Object style, JspWriter out) throws IOException {

		out.println(" <TR" + style + ">");
		
		for(CustomerBean cust: custList) {
			out.println(" <TD>" + cust.getFname()+" "+cust.getLname() + "</TD>");
			out.println(" <TD>" + cust.getSex()+ "</TD>");
			out.println(" <TD>" + cust.getMarried()+ "</TD>");
			out.println(" <TD>" + cust.getAge()+ "</TD>");
			out.println(" <TD>" + cust.getChildren()+ "</TD>");
			out.println(" <TD>" + cust.getSmoker()+ "</TD>");
		}
		
		out.println(" </TR>");

	}

	private Object getStyle(String className) {
		
		if (className == null) {
			return("");
		} else {
			return(" CLASS=\"" + headerClass + "\"");
		}
	}

	public Object[][] getRowItems() {
		return rowItems;
	}
	public void setRowItems(Object[][] rowItems) {
		this.rowItems = rowItems;
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
	
	
}
