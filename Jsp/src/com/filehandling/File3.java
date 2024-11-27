package com.filehandling;

import java.io.File;
import java.io.IOException;

public class File3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File f=new File("jagga5");
        f.createNewFile();
        System.out.println(f.getAbsolutePath());
	}

}
