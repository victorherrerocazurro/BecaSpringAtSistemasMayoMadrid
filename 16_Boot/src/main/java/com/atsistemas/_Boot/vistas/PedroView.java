package com.atsistemas._Boot.vistas;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.View;

public class PedroView implements View {

	private String path;
	
	public PedroView(String path) {
		super();
		this.path = path;
	}

	@Override
	public String getContentType() {
		return "text/html";
	}

	@Override
	public void render(Map<String, ?> arg0, HttpServletRequest arg1, HttpServletResponse arg2) throws Exception {
		
		arg1.getRequestDispatcher(path).forward(arg1, arg2);
		
		//arg2.getOutputStream().print("HolaMundo!!! " + arg0.get("persona"));
	}

}
