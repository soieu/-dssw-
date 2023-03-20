package ch19.sec06;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonExample {

	public static void main(String[] args) {
		JSONObject root = new JSONObject();
		root.put("id", "winter");
		root.put("name", "한겨울");
		root.put("age", 25);
		root.put("student", true);

		JSONObject tel = new JSONObject();
		tel.put("home", "02-1234-1323");
		tel.put("mobile", "010-234-2342");
		root.put("tel", tel);
		
		
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("python");
		skill.put("c++");
		root.put("skill", skill);
		
		String json = root.toString();
		
		System.out.println(json);
	}

}
