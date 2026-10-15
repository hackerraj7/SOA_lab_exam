package com.marketgrid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marketgrid.model.Tourist;
import com.marketgrid.service.TouristService;

@RestController
public class TouristController {
	@Autowired
	TouristService TS;
	public TouristController(TouristService TS) {
		this.TS = TS;
	}
	@PostMapping("/add")
	public Object addTourist(@RequestBody Tourist t) {
		return TS.addTourist(t);
	}
	@PostMapping("/update")
	public Object updateName(@RequestBody Tourist t) {
		return TS.updateTourist(t);
	}
}
