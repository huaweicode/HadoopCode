package com.gc.parsexml;


public class UtilCommon {

	public static String UTF8STRINGUP = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
	public static String UTF8STRINGLOW = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
	public static String ROOTBEGIN = "<root>";
	public static String ROOTEND = "</root>";
	public static String ROOTBEGINUP = "<ROOT>";
	public static String ROOTENDUP = "</ROOT>";
	public static String ROOT_VERSION = "<root _version=\"v1.0\">";
	/**
	 * 直属局实验室系统：接受或回退接口编号
	 */
	public static String ACCEPTINTERFACE = "01";
	
	/**
	 *  直属局实验室系统：反馈检测报告URL接口编号
	 */
	public static String URLINTERFACE = "02";
	
	/**
	 * 直属局实验室系统：检测项结果反馈接口编号
	 */
	public static String ITEMINTERFACE = "03";
	
	/**
	 * 直属局实验室系统：送检单下发接口编号
	 */
	public static String SENDBILL = "04";
	
	/**
	 * 直属局实验室系统：送检单检测报告接口编号
	 */
	public static String UPLOADREPORT = "05";
	/**
	 * 
	 */
	public static String SOURCE_TYPE = "05";
	
	/**
	 * 外网同步数据：向外网发送送检单接口编号
	 */
	public static String INTERNET_SEND_BILL = "11";
	
	/**
	 * 外网同步数据：同步外网送检单检测结果接口编号
	 */
	public static String INTERNET_ACC_RESULT_BILL = "12";

	/**
	 * 外网同步数据：向外网发送送检单结果处理信息接口编号
	 */
	public static String INTERNET_SEND_BILL_RESPONSE = "13";
	
	/**
	 * 接口监控定时编码
	 */
	public static String JOB_MONITOR_LOG = "90";
	
	
	
	/**
	 * 实验室类型，直属局实验室
	 */
	public static String LAB_TYPE_LAN = "0";

	/**
	 * 实验室类型，第三方实验室
	 */
	public static String LAB_TYPE_INTERNET = "1";

	

	// ----------------------------报文错误码
	// 开始----------------------------------------------------
	/**
	 * 通讯业务处理正常
	 */
	public static String XMLSUCCESS = "0000";
	public static String XMLSUCCESSDESC = "通讯业务处理正常";
	/**
	 * 报文无法解析
	 */
	public static String XMLERROR01 = "0100";
	public static String XMLERRORDESC01 = "报文无法解析";

	/**
	 * 申请报文,信息上报不够完整
	 */
	public static String XMLERROR02 = "0103";
	public static String XMLERRORDESC02 = "申请报文,信息上报不够完整";

	/**
	 * 用户验证不通过
	 */
	public static String XMLERROR03 = "0104";
	public static String XMLERRORDESC03 = "用户验证不通过";

	/**
	 * 目标应用需要一致
	 */
	public static String XMLERROR04 = "0106";
	public static String XMLERRORDESC04 = "目标应用需要一致";

	/**
	 * 参数不能是空值
	 */
	public static String XMLERROR05 = "0116";
	public static String XMLERRORDESC05 = "参数不能是空值";

	/**
	 * 申请报文接收解析处理，出现异常
	 */
	public static String XMLERROR06 = "0122";
	public static String XMLERRORDESC06 = "申请报文接收解析处理，出现异常";

	/**
	 * 接收报文，出现异常
	 */
	public static String XMLERROR07 = "0213";
	public static String XMLERRORDESC07 = "接收报文，出现异常";

	/**
	 * 接收接口系统报文,解析保存出现异常
	 */
	public static String XMLERROR08 = "0215";
	public static String XMLERRORDESC08 = "接收接口系统报文,解析保存出现异常";

	/**
	 * 消息头格式不正确
	 */
	public static String XMLERROR09 = "0105";
	public static String XMLERRORDESC09 = "消息头格式不正确";

	/**
	 * 接收发送报文、解析、保存异常
	 */
	public static String XMLERROR10 = "0214";
	public static String XMLERRORDESC10 = "接收发送报文、解析、保存异常";

	/**
	 * 未获取数据
	 */
	public static String XMLERROR11 = "0401";
	public static String XMLERRORDESC11 = "为获取符合条件的数据";
	
	/**
	 * CA服务器请求错误
	 */
	public static String CASERROR = "0501";
	public static String CASERRORDESC = "CA服务器请求出现异常";
	
	/**
	 * 主干系统请求错误
	 */
	public static String ESBERROR = "0601";
	public static String ESNERRORDESC = "请求主干系统出现异常";

	// ----------------------------报文错误码
	// 结束----------------------------------------------------
}
