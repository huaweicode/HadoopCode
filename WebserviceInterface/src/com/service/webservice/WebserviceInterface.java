package com.service.webservice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;


import com.service.jdbc.JdbcUtil;

public class WebserviceInterface {

	public String queryResult() {
		String result = "";
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		try {
			ResultSet rs = null;
			rs = JdbcUtil.query();
			Map<String, String> map = null;
			while (rs.next()) {
				map = new HashMap<String, String>();
				map.put("itfID", rs.getString(1));
				map.put("subNo", rs.getString(2));
				map.put("dclNo", rs.getString(3));
				list.add(map);
			}
			JSONArray jsonArray = JSONArray.fromObject(list);
			result = jsonArray.toString();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	


}
