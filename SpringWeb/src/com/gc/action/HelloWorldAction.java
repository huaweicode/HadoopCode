package com.gc.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldAction implements Controller {
	
	private String helloWorld;
	private String viewPage;

	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Map model = new HashMap();
		model.put("helloWorld", getHelloWorld());
		return new ModelAndView(getViewPage(),model);
	}


	public String getHelloWorld() {
		return helloWorld;
	}

    //依赖注入要返回的页面
	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}

    //获取要返回的页面
	public String getViewPage() {
		return viewPage;
	}


	public void setViewPage(String viewPage) {
		this.viewPage = viewPage;
	}

}
