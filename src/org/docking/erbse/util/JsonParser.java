package org.docking.erbse.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonParser {

	private static JsonParser instance;
	static
	{
		instance = new JsonParser();
	}

	private JsonParser(){

	}

	public static JsonParser getInstance()
	{
		return instance;
	}

	/** 
	 * ?�라미터�??�겨받�? ?�트�?배열??JsonArray ?�태???�트링으�?br/>
	 * 만들??�?값을 리턴?�다.<br/>
	 * ex) str[0]=0 , str[1]=0 , str[2]=0 -> [0,0,0]
	 */
	@SuppressWarnings("unchecked")
	public String jParseArr(String[] str) {

		JSONArray jArr = new JSONArray();

		for (int i = 0; i < str.length; i++) 
		{
			jArr.add(str[i]);
		}

		return jArr.toString();
	}

	/** 
	 * ?�라미터�??�겨받�? ?�개???�트�?배열 ?�값�?벨류값을 JsonObject ?�태???�트링으�?br/>
	 * 만들??결과값을 리턴?�다. ?�값�?value 값�? 1:1 ??��???�어???�며 ?�른 ?�이즈의<br/>
	 * 배열??경우 ?�러 메시�?? 반환?�다. �?�� ?�공??�?배열??같�? ?�덱?�는 key:value 구조�?�??�??�다.<br/>
	 * ex) key[0]="1", key[1]="2", key[2]="3"<br/>
	 *       val[0]="??, val[1]="??, val[2]="??<br/>
	 * -> {"1":"??,"2":"??,"3":"??}
	 */
	@SuppressWarnings("unchecked")
	public String jParseObj(String[] key, String[] val) {
		JSONObject jObj = new JSONObject();

		for (int i = 0; i < val.length; i++) 
		{
			jObj.put(key[i], val[i]);
		}

		return jObj.toString();
	}
}
