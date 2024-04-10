package com.cg.jpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
	@PostMapping("/uploadfile")
	public ResponseEntity<String>uploadFile(@RequestParam("file") MultipartFile file)
	
	
	{
		//validation
		 if (file == null || file.isEmpty())
		{
			return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body("File upload is required. Please attach a file.asd");
		}
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getName());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		return ResponseEntity.ok("working");
		//return null;
	}
	
	// file upload code ....

}
