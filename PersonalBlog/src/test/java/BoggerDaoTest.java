


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ssm.blog.dao.BloggerDao;
import ssm.blog.entity.Blogger;


@RunWith(SpringJUnit4ClassRunner.class)//ʹ��spring����
@ContextConfiguration(locations = "classpath:spring-beans.xml")//����spring�����ļ�·��
public class BoggerDaoTest {
	@Autowired   
	private BloggerDao bloggerDao;
	@Test
	public void getBloggerData() throws Exception {
		Blogger blogger = bloggerDao.getBolggerData();
		System.out.println(blogger);
	}

}
