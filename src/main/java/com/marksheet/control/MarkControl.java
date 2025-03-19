package com.marksheet.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marksheet.entity.MarkSheet;
import com.marksheet.service.MarkService;

@RestController
@RequestMapping(value = "marksheet")
public class MarkControl {
	@Autowired
	MarkService ms;

	@GetMapping("/getMarks")
	public List<MarkSheet> getAll(){
		return ms.getService();
	}
	
	@PostMapping("/postMarks")
	public String postAll(@RequestBody List<MarkSheet> m){
		return ms.postService(m);
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		return ms.deleteService();
	}
	
}
