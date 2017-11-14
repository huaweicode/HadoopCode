package ssm.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.blog.dao.BlogTypeDao;
import ssm.blog.entity.BlogType;
import ssm.blog.entity.PageBean;
import ssm.blog.service.BlogTypeService;
@Service
public class BlogTypeServiceImpl implements BlogTypeService {
	
	@Autowired
	private BlogTypeDao blogTypeDao;

	public PageBean<BlogType> listByPage(PageBean<BlogType> pageBean) {
		//��ѯ��ҳ���
		pageBean.setResult(blogTypeDao.listBypage(pageBean.getStart(), pageBean.getEnd()));
		//��ѯ��¼����
		pageBean.setTotal(blogTypeDao.getTotal());
		return pageBean;
	}

}
