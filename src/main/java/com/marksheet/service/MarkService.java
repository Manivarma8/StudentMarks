package com.marksheet.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marksheet.entity.MarkSheet;
import com.marksheet.repository.MarkSheetRepository;

@Service
public class MarkService {
	@Autowired
	MarkSheetRepository mr;

	public List<MarkSheet> getService() {
		
		return mr.findAll();
	}

	public String postService(List<MarkSheet> ma) {
		
//		for(MarkSheet m : ma) {
//			m.setSem1Total(m.getSem1Practicals() + m.getSem1Theory());
//			m.setSem2Total(m.getSem2Practicals() + m.getSem2Theory());
//			mr.save(m);
//		}
//		ma.stream().map(m -> m.setSem1Total();
		ma.forEach(p ->{
			p.setSem1Total(p.getSem1Practicals() + p.getSem1Theory());
		    p.setSem2Total(p.getSem2Practicals() + p.getSem2Theory());
		    });
		mr.saveAll(ma);
		return "Saved as you asked";
	}

	public String deleteService() {
		mr.deleteAll();
		return "Destruction completed";
	}

	
}
