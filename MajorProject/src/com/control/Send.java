package com.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.KeyBean;
import com.dao.Dao;

/**
 * Servlet implementation class Send
 */
@WebServlet("/Send")
public class Send extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Send() {
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
		PrintWriter o = response.getWriter();
		String fid = request.getParameter("fid");
		String uid = request.getParameter("uid");
		String sql = "select * from ukeys where fid='" + fid + "' and userid='"
				+ uid + "'";
		boolean b = Dao.getData(sql);
		if (b == true) {
			o.println("<script type=\"text/javascript\">");
			o.println("alert('User Already Recieved The Keys');");
			o.println("window.location='okey.jsp';</script>");
		} else {
			sql = "select * from data1 where fid='" + fid + "'";
			String key1 = "", key2 = "", key3 = "", key4 = "";
			List<String> lt = Dao.getOKeys(sql);
			Iterator<String> itr = lt.iterator();
			while (itr.hasNext()) {
				key1 = itr.next();
				key2 = itr.next();
				key3 = itr.next();
				key4 = itr.next();
			}
			KeyBean kb = new KeyBean();
			kb.setFid(fid);
			kb.setUid(uid);
			kb.setKey1(key1);
			kb.setKey2(key2);
			kb.setKey3(key3);
			kb.setKey4(key4);
			sql = "insert into ukeys values(?,?,?,?,?,?)";
			int i = Dao.sendKeys(sql, kb);
			if(i > 0){
				o.println("<script type=\"text/javascript\">");
				o.println("alert('Keys are sent to user successfully');");
				o.println("window.location='okey.jsp';</script>");
			}else{
				o.println("<script type=\"text/javascript\">");
				o.println("alert('Keys are not sent to user');");
				o.println("window.location='okey.jsp';</script>");
			}
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
