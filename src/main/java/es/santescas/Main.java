package es.santescas;

import java.io.File;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.map.ObjectMapper;


import es.santescas.dto.A;
import es.santescas.dto.C;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ClassLoader classLoader = Main.class.getClassLoader();
		File archivo = new File(classLoader.getResource("data.json").getFile());
		MapToContractConverter contractConverter=new MapToContractConverter();
		
		ObjectMapper jacksonMapper=new ObjectMapper();
		Map beanMap=null;
		try {
			beanMap=jacksonMapper.readValue(archivo, Map.class);
			NestedAccessMap mapa=new NestedAccessMap(beanMap);
			
			C result=contractConverter.convertFromMap(mapa);
			System.out.println(ToStringBuilder.reflectionToString(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
