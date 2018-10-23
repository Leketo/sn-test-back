package my.com.sn.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import my.com.sn.model.Patience;

@RestController
public class HomeController {
	
	@GetMapping("/patiences")
	public List<Patience> patiences() {
		List<Patience> list = new ArrayList<Patience>(Arrays.asList(new Patience("Leketo", 26), new Patience("Andrea", 21), new Patience("Jose", 2)));
	//	Map<String, List<Patience>> map = new HashMap<String, List<Patience>>();
	//	map.put("data", list);
		return list;
	}
	
}
