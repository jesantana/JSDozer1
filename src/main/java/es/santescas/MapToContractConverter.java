package es.santescas;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;

import es.santescas.dto.A;
import es.santescas.dto.B;
import es.santescas.dto.C;

public class MapToContractConverter {

	Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();
	
	
	public C convertFromMap(NestedAccessMap data){
		
		Class<C> currentClass=C.class;
		return mapper.map(data, currentClass,"mapToCMapping");
	}

}
