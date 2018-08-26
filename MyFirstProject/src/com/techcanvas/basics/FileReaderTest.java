package com.techcanvas.basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	

	public static void main(String[] args)  throws IOException {
		FileReader is;
		BufferedReader reader = null;
		
		try {
			File file = new File(System.getProperty("user.dir")+ "/resources/Sample.txt");
			is = new FileReader(file);
			reader = new BufferedReader(is);
			String line;
			
			while ((line=reader.readLine()) != null)
			{ System.out.println(line);
			}
		}
			catch (Exception e)
			{}
			finally {
				reader.close();
			}
			
					
		}
		
		

	}


