package com.fileuploader.fileuploader.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.fileuploader.fileuploader.model.FileDB;
import com.fileuploader.fileuploader.repository.FileDBRepository;


@Service
public class FileStorageService {
	@Autowired
	private FileDBRepository fileDBRepository;
	
	public FileDB store(MultipartFile file, int empid, String fileName) throws IOException{
		String fName = StringUtils.cleanPath(file.getOriginalFilename());
		FileDB fileDB = new FileDB(fName, file.getContentType(), file.getBytes(), empid, fileName);
		
		return fileDBRepository.save(fileDB);
	}
	
	public FileDB getFile(String id) {
		return fileDBRepository.findById(id).get();
	}
	
	public Stream<FileDB> getAllFiles(){
		return fileDBRepository.findAll().stream();
	}
}
