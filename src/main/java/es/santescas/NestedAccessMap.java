package es.santescas;

import java.util.Map;

public class NestedAccessMap{

	private Map<String,Object> internalMap;
	
	public NestedAccessMap(Map<String,Object> internalMap){
		this.internalMap=internalMap;
	}
	
	
	public Object getValue(String key){
		if("this".equals(key)){
			return this;
		}
		else{
			
			String[] allKeys=key.split("\\.");
			Map<String,Object> tempResult=internalMap;
			
			for(int i=0;i<allKeys.length-1;i++){
				tempResult=(Map<String,Object>)tempResult.get(allKeys[i]);
			}
			
			
			return tempResult.get(allKeys[allKeys.length-1]);
		}
	}

}
