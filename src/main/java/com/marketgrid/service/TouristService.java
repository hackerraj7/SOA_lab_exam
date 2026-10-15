package com.marketgrid.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketgrid.model.Tourist;
import com.marketgrid.repository.TouristRepository;

@Service
public class TouristService {
	@Autowired
	TouristRepository TR;
	public TouristService(TouristRepository TR) {
		
		// TODO Auto-generated constructor stub
		this.TR = TR;
	}
	public Object addTourist(Tourist T) {
		HashMap<String, Object> response = new HashMap<>();
		try {
			TR.save(T);
			response.put("code", 200);
			response.put("data", T);
		}
		catch(Exception e) {
			response.put("code", 500);
			response.put("error", e.getMessage());
		}
		return response;
	}
	public Object updateTourist(Tourist T) {
		HashMap<String, Object> response = new HashMap<>();
		try {
			Tourist temp = TR.findById(T.getId()).get();
			temp.setName(T.getName());
			response.put("code", 200);
			response.put("data", T);
		}
		catch(Exception e) {
			response.put("code", 500);
			response.put("error", e.getMessage());
		}
		return response;
	}
}
