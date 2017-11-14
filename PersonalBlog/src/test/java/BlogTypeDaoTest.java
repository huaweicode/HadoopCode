import java.security.interfaces.RSAKey;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RestController;

import ssm.blog.dao.BlogTypeDao;
import ssm.blog.entity.BlogType;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class BlogTypeDaoTest {
	
	@Autowired
	private BlogTypeDao blogTypeDao;
	
//	@Test
	public void addBlogType() throws Exception{
		BlogType blogType = new BlogType("Mysql", 10);
		int result = blogTypeDao.addBlogType(blogType);
		System.out.println(result);
	}
	
//	@Test
	public void deleteBlogType(){
		int result = blogTypeDao.deleteBlogType(17);
		System.out.println(result);
	}
//	@Test
	public void updateBlogType(){
		BlogType blogType = blogTypeDao.getById(16);
		blogType.setTypeName("orcal");
		blogType.setorderNum(1000);
		int result = blogTypeDao.updateBlogType(blogType);
		System.out.println(result);
	}
//	@Test
	public void getById(){
		BlogType blogType = blogTypeDao.getById(16);
		System.out.println(blogType);
	}
//	@Test
	public void listByPage(){
		Integer page = 2;
		Integer pageSize = 5;
		Integer start = (page-1)*pageSize;
		Integer end = page*pageSize;
		List<BlogType> blogTypeList = blogTypeDao.listBypage(start, end);
		for (BlogType blogType : blogTypeList) {
			System.out.println(blogType);
		}
	}
	@Test
	public void getTotal(){
		long result = blogTypeDao.getTotal();
		System.out.println(result);
	}
}
