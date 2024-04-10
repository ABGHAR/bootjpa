package com.cg.jpa.helper;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

//@Component
//public class FileUploadHelper {
//	public final String UPLOAD_DIR="C:\\Users\\ABGHAR\\git\\repository\\bootjpaexample\\src\\main\\resources\\static\\image";
//public boolean uploadFile(MultipartFile f)
//{
//	boolean  f1=false;
//	
//	try {
////		//
////		InputStream iStream=f.getInputStream();
////		byte data[]=new byte
//		//Files.copy(f.getInputStream(), UPLOAD_DIR+File.separator+MultipartFile.getOriginalFilename(), StandardCopyOption.REPLACE_EXISTING);
//	//}
//	return f1;
////}
////}
