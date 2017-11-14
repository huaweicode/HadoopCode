package ssm.blog.controller.admin;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import ssm.blog.entity.BlogType;
import ssm.blog.entity.PageBean;
import ssm.blog.service.BlogTypeService;
import ssm.blog.util.ResponseUtil;

@Controller
@RequestMapping(value="/admin/blogType")
public class BlogTypeController {
	
	@Autowired
	private BlogTypeService blogTypeService;
	@RequestMapping("/list")
	public String listBlogType(@RequestParam(value="page",required=true) String page,
			@RequestParam(value="rows",required=false) String rows,
			HttpServletResponse response) throws IOException{
		//定义分页bean
		PageBean<BlogType> pageBean = new PageBean<BlogType>(Integer.parseInt(page), Integer.parseInt(rows));
		//拿到分页结果已经记录总数pagebean
		pageBean = blogTypeService.listByPage(pageBean);
		JSONObject result = new JSONObject();
		String jsonArray = JSON.toJSONString(pageBean.getResult());
		JSONArray array = JSONArray.parseArray(jsonArray);
		result.put("rows", array);
		result.put("total", pageBean.getTotal());
		ResponseUtil.write(response, result);
		return null;
	}
	
}
