package com.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
	public static void main(String[] args) {
		
		try {
			Path source=Paths.get("./testfile.txt");
			Path target=Paths.get("./testfilecopy.txt");
			Files.copy(source, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
