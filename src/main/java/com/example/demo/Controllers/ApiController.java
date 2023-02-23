package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Services.ApiService;

@RestController
public class ApiController {
	@Autowired
	 ApiService stuService;
	 @PostMapping("/addDetails")
	 public Student addinfo(@RequestBody Student st) {
		 return stuService.saveDetails(st);
	 }
	 @GetMapping("fetch")
	 public List<Student> fetchDetails(){
		 return stuService.getDetails();
	 }
	 @PutMapping("/update")
	 public Student updateInfo (@RequestBody Student st1 ) {
		 return stuService.updateDetails(st1);
	 }
	 @DeleteMapping("/delete/{id}")
	 public String deleteInfo(@PathVariable("id") int id) {
		 stuService.deleteDetails(id);
		 return "Details deleted success";
	 }
}
