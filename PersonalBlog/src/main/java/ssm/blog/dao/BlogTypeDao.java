package ssm.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ssm.blog.entity.BlogType;

/**
 * 博客类别dao
 * @author admin
 *
 */
public interface BlogTypeDao {
	
	/**
	 * 添加博客类别信息
	 * @param blogType
	 * @return
	 */
	Integer addBlogType(BlogType blogType);
	/**
	 * 删除博客类别信息
	 * @param id
	 * @return
	 */
	Integer deleteBlogType(Integer id);
	/**
	 * 更新博客类别信息
	 * @param blogType
	 * @return
	 */
	Integer updateBlogType(BlogType blogType);
	/**
	 * 根据ID查询博客类别信息
	 * @param id
	 * @return
	 */
	BlogType getById(Integer id);
	/**
	 * 分页查询博客类别信息
	 * @param start
	 * @param end
	 * @return
	 */
	List<BlogType> listBypage(@Param("start") Integer start,@Param("end") Integer end);
	
	/**
	 * 总记录条数
	 * @return
	 */
	Long getTotal();

}
