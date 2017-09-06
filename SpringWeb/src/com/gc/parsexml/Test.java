package com.gc.parsexml;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class Test {
	
	private void parseXML(){
		SAXReader reader = new SAXReader();
		String xml = readFile();
		xml = xml.replace(UtilCommon.UTF8STRINGLOW, "")
				.replace(UtilCommon.UTF8STRINGUP, "")
				.replace(UtilCommon.ROOT_VERSION, "")
				.replace(UtilCommon.ROOTBEGIN, "")
				.replace(UtilCommon.ROOTEND, "")
				.replace("\r|\n", "");
		xml = "<root><LIST>" + xml + "</LIST></root>";
		SAXReader saxReader = new SAXReader();
		try {
			Document document = saxReader.read(new ByteArrayInputStream(xml.getBytes("GBK")));
			Element root = document.getRootElement();
			for (Iterator iterator = root.elementIterator();iterator.hasNext();) {
				Element child = (Element) iterator.next();
				
			}
		} catch (UnsupportedEncodingException | DocumentException e) {
			e.printStackTrace();
		}
	}
	
	private static void subString(){
		String xml = readFile();
		xml = xml.replace("\r|\n", ""); 
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < xml.length(); i++) {
			xml = xml.substring(xml.indexOf(UtilCommon.UTF8STRINGUP), xml.indexOf(UtilCommon.ROOTEND));
			System.out.println(xml);
		}
	}
	
	public static void main(String[] args) {
		
		for (EnumTest e : EnumTest.values()) {
			System.out.println(e.toString());
		}
		
	}
	
	public static String readFile(){
		File file = new File("D:\\checklist\\bills.xml");
		StringBuffer readstring = new StringBuffer();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));  
			int tempbyte;
			String a = "";
			while((a = reader.readLine()) != null){
				readstring.append(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return readstring.toString();
		
	}
	
	

}
