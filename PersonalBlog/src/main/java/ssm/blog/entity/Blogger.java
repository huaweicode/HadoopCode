package ssm.blog.entity;

import java.io.Serializable;

public class Blogger implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8835077639106016618L;
	
	private Integer id;
	private String userName;//用户名
	private String password;//密码
	private String profile;//博主信息
	private String nickName;//昵称
	private String sign;//博主签名
	private String imageName;//图片路径
	
	public Blogger() {
	}
	
	public Blogger(String userName,String password,String profile,String nickName,String sign,String imageName) {
		this.userName=userName;
		this.password=password;
		this.profile=profile;
		this.nickName=nickName;
		this.sign=sign;
		this.imageName=imageName;
	}
	
	@Override
	public String toString() {
		return "Blogger{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", profile='" + profile + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sign='" + sign + '\'' +
                ", imageName='" + imageName + '\'' +
                '}';
	}

}
