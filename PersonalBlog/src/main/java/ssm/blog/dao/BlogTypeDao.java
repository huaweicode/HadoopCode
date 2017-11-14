package ssm.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ssm.blog.entity.BlogType;

/**
 * �������dao
 * @author admin
 *
 */
public interface BlogTypeDao {
	
	/**
	 * ��Ӳ��������Ϣ
	 * @param blogType
	 * @return
	 */
	Integer addBlogType(BlogType blogType);
	/**
	 * ɾ�����������Ϣ
	 * @param id
	 * @return
	 */
	Integer deleteBlogType(Integer id);
	/**
	 * ���²��������Ϣ
	 * @param blogType
	 * @return
	 */
	Integer updateBlogType(BlogType blogType);
	/**
	 * ����ID��ѯ���������Ϣ
	 * @param id
	 * @return
	 */
	BlogType getById(Integer id);
	/**
	 * ��ҳ��ѯ���������Ϣ
	 * @param start
	 * @param end
	 * @return
	 */
	List<BlogType> listBypage(@Param("start") Integer start,@Param("end") Integer end);
	
	/**
	 * �ܼ�¼����
	 * @return
	 */
	Long getTotal();

}
