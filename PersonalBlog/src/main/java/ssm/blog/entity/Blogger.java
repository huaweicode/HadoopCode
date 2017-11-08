package ssm.blog.entity;

import java.io.Serializable;

public class Blogger implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8835077639106016618L;
	
	private Integer id;
	private String userName;//�û���
	private String password;//����
	private String profile;//������Ϣ
	private String nickName;//�ǳ�
	private String sign;//����ǩ��
	private String imageName;//ͼƬ·��
	
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
