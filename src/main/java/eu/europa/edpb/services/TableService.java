package eu.europa.edpb.services;

public interface TableService {
	
	public String get();
	
	public String get(Long id);

	public String add(Long id);

	public String delete(Long id);

}
