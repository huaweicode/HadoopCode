package ssm.blog.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtil {
	
	/**
	 * 向response对象写入数据
	 * @param response
	 * @param object
	 * @throws IOException
	 */
	public static void write(HttpServletResponse response,Object object) throws IOException{
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(object.toString());
		out.flush();
		out.close();
	}

}
