package com.tnsif.sm.store;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController
{
	@Autowired
   private StoreService service;
	
	//Restful API methods for retrieval operations
	
	@GetMapping("/Store")
	public List<Store> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/Store/{storeid}")
	public ResponseEntity<Store> get(@PathVariable Integer storeid)
	{
		try
		{
			Store store=service.get(storeid);
			return new ResponseEntity<Store>(store, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Store>(HttpStatus.NOT_FOUND);
		}
	}
	
	// Create Operation
	@PostMapping("/Store")
	public void add(@RequestBody Store store)
	{
		service.save(store);
	}
	
	//Update Operation
	@PutMapping("/Store/{storeid}")
	public ResponseEntity<?> update(@RequestBody Store store, @PathVariable Integer storeid) 
	{
		try
		{
			Store existStore=service.get(storeid);
			service.save(store);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete Operation
	@DeleteMapping("/Store/{storeid}")
	public void delete(@PathVariable Integer storeid)
	{
		service.delete(storeid);
	}
}