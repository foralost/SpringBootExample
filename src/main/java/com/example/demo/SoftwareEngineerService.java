package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SoftwareEngineerService {

	private SoftwareEngineerRepository softwareEngineerRepository;
	
	public SoftwareEngineerService (SoftwareEngineerRepository softwareEngineerRepository)
	{
		this.softwareEngineerRepository = softwareEngineerRepository;
	}
	
	public List<SoftwareEngineer> getSoftwareEngineers()
	{
		return softwareEngineerRepository.findAll();
	}
	
	public void addNewSoftwareEngineer(SoftwareEngineer s)
	{
		softwareEngineerRepository.save(s);
	}
	
	public SoftwareEngineer getEngineerById(Integer Id)
	{
		return softwareEngineerRepository.findById(Id).orElseThrow(() -> new IllegalStateException("asdf"));
	}
}
