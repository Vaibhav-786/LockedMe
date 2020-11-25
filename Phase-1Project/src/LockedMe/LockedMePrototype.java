package LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LockedMePrototype 
{
	public static void main (String[] args) throws IOException 
	{
//------------------------------------------------------------------------------------------------------------------------------------
	//	selecting root directory and retrieving existing file in ascending order 
		
		
		
		
		Scanner scanner = new Scanner( System.in );
        System.out.println("Enter the Root Directory path: ");
        String dirPath = scanner.nextLine(); // Takes the directory path as the user input
        File folder = new File(dirPath);
        if(folder.isDirectory())
        {
        	System.out.println("Root Directory is present.");
        	
        	List<String> listFile = Arrays.asList(folder.list());
        	Collections.sort(listFile);
        	if (folder.list().length > 0)
        	{
			System.out.println("---------------------------------------");
			System.out.println("Name of files present in root directory  in ascending order:");
			for(Object o:listFile)
			{
				String s = o.toString();
				System.out.println(s);
			}
        	}else
        	{
        		System.out.println("The root directory " + folder.getPath() + " is empty.");
        	}
        }else
        {
        	System.out.println("Root Directory is not present");
        }
        
        
        scanner.close();
        
        
        
        
        
        
        
        
	}//------main
}//----class
