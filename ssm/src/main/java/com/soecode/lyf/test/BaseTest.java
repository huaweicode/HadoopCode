package com.soecode.lyf.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ����spring��junit���ϣ�junit����ʱ����springIOC���� spring-test��junit
 * @author admin
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//����junit�����ļ�
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class BaseTest {

}
