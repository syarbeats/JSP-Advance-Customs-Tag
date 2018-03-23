package com.cdc.mitrais.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.mitrais.model.CustomerBean;

/**
 * Servlet implementation class CustomerList
 */
@WebServlet("/customer-list")
public class CustomerList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private static final Logger logger = LoggerFactory.getLogger(CustomerBean.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerBean customerBean = new CustomerBean();
		List<CustomerBean> customerList = new ArrayList<CustomerBean>();
		customerList = customerBean.getAllCustomer();
		
		HttpSession session = request.getSession();
		session.setAttribute("customerList", customerList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/results/show-customer-list.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
