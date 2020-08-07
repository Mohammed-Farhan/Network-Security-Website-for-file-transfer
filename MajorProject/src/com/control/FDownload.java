package com.control;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Dao;

/**
 * Servlet implementation class FDownload
 */
@WebServlet("/FDownload")
public class FDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**45
	 * @see HttpServlet#HttpServlet()
	 */
	public FDownload() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String fid = request.getParameter("fid");
			System.out.println(fid);
			Connection con = Dao.connect();
			Statement st = con.createStatement();
			ResultSet r = st.executeQuery("select * from data where fid='"
					+ fid + "'");
			OutputStream o = response.getOutputStream();
			if (r.next()) {
				response.setContentType(r.getString(8));
				o.write(r.getBytes(4));
				o.write(r.getBytes(5));
				o.write(r.getBytes(6));
				o.write(r.getBytes(7));
			}
			o.flush();
			o.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
