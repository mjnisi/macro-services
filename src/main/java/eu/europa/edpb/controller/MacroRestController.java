package eu.europa.edpb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.europa.edpb.services.TableService;

@RestController
@RequestMapping("/macro")
public class MacroRestController {
	
	@Autowired
	private TableService tableService;

    @GetMapping(value = "/get")
    public String getAll() {
        return tableService.get();
    }

    @GetMapping(value = "/get/{id}")
    public String get(@PathVariable Long id) {
        return tableService.get(id);
    }

/*    public String add() {
        return tableService.add();
    }
    
    public String delete() {
    	return tableService.delete();
    }
    */
}
