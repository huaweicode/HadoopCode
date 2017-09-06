package com.service.webservice;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

public class InterfaceCilent {
	
	 public void testRPC(){  
	        try{  
	            RPCServiceClient client = new RPCServiceClient();  
	            Options options = client.getOptions();  
	            String url = "http://192.168.238.253:8080/axis2/services/WebserviceInterface?wsdl";  
	            EndpointReference end = new EndpointReference(url);  
	            options.setTo(end);  
	              
	            Object[] obj = new Object[]{"tom"};  
	             Class<?>[] classes = new Class[] { String.class };    
	              
	            QName qname = new QName("http://webservice.service.com", "queryResult");    
	            String result = (String) client.invokeBlocking(qname, obj,classes)[0];  
	            System.out.println(result);  
	        }catch(AxisFault e){  
	            e.printStackTrace();  
	        }  
	    }  
	 
	 public static void main(String[] args) {
		 InterfaceCilent cilent = new InterfaceCilent();
		 cilent.testRPC();
	}

}
