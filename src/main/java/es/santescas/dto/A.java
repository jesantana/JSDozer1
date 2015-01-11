package es.santescas.dto;

import java.util.List;

public class A {

	

	private Integer id;
	private String name;
	
	private List<String> related;
	
	private InternalA internalA;
	
	private CompactInternalA compactA;
	
	
	public CompactInternalA getCompactA() {
		return compactA;
	}

	public void setCompactA(CompactInternalA compactA) {
		this.compactA = compactA;
	}

	public InternalA getInternalA() {
		return internalA;
	}

	public void setInternalA(InternalA internalA) {
		this.internalA = internalA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getRelated() {
		return related;
	}

	public void setRelated(List<String> related) {
		this.related = related;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
