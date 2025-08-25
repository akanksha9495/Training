package com.sutherland.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
@GetMapping
public String Welcome() {
	return "Welcome to spring boot";
}

@GetMapping("/getreq")
public String anotherGet()
{
	return "another get request";
}

@PostMapping
public String postMethod()
{
	return "this is post request";
}

@PutMapping
public String putMethod()
{
	return "this is put method";
}

@DeleteMapping
public String deleteMapping()
{
	return "this is delete mapping";
}
}
