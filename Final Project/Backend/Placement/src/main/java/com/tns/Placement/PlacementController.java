package com.tns.Placement;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/placement")
public class PlacementController {
	
	@Autowired
	private PlacementRepository repo;
	
	@GetMapping("/{id}")
	public Placement retrieveCollegeById(@PathVariable Long id)
	{
		return repo.findById(id).get();
	}
	
	@GetMapping
	public List<Placement> retrieveCollege()
	{
		return repo.findAll();
	}
	
	@PostMapping
	public Placement createCollege(@RequestBody Placement placement)
	{
		return repo.save(placement);
	}
	
	@PutMapping("/{id}")
	public Placement updateCollege(@PathVariable Long id, @RequestBody Placement placement)
	{
		placement.setId(id);
		return repo.save(placement);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCollegeById(@PathVariable Long id)
	{
		repo.deleteById(id);
	}
	
		
}
