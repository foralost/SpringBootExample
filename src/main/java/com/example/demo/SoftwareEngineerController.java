package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("asdf")
public class SoftwareEngineerController {

	private final SoftwareEngineerService service;
	
	public SoftwareEngineerController(SoftwareEngineerService service)
	{
		this.service = service;
	}
	
	
	@GetMapping
	public List<SoftwareEngineer> getEngineers()
	{
		return service.getSoftwareEngineers();
	}
	
	@PostMapping
	public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer)
	{
		service.addNewSoftwareEngineer(softwareEngineer);
	}
	
	@GetMapping("{id}")
	public SoftwareEngineer findEngineer(@PathVariable Integer id)
	{
		return service.getEngineerById(id);	
	}
	
}
