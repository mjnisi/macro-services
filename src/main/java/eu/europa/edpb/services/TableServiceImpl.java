package eu.europa.edpb.services;

import org.springframework.stereotype.Service;

@Service
public class TableServiceImpl implements TableService{

	@Override
	public String get() {
        return "[{\"first\":\"https:\\/\\/randomfox.ca\\/images\\/100.jpg\",\"two\":\"https:\\/\\/randomfox.ca\\/?i=100\"}]";
	}

	@Override
	public String get(Long id) {
        return "{\"first\":\"https:\\/\\/randomfox.ca\\/images\\/100.jpg\",\"two\":\"https:\\/\\/randomfox.ca\\/?i=100\"}";
	}

	@Override
	public String add(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
