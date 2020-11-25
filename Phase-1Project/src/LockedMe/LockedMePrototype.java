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
        
      //--------------------------------------------------------------------------------------------------------------------------------
        //Adding a file to existing directory   

         
      
       /*	// first way to add file  
        //----------------------------------------------------------------------------------    	  
           System.out.println("Enter the file name:");
           String filename = scanner.nextLine();
           File file = new File(dirPath,filename); //initialize File object and passing path as argument  
           boolean result;  
           try   
           {  
           result = file.createNewFile();  //creates a new file  
           if(result)      // test if successfully created a new file  
           {  
           System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
           }  
           else  
           {  
           System.out.println("File already exist at location: "+file.getCanonicalPath());  
           }  
           }   
           catch (IOException e)   
           {  
           e.printStackTrace();    //prints exception if any  
           } 
       		
        //-------------------------------------------------------------------------------------
      	  
           */
           
           
        //second way to add file
           
           
           
           boolean success=false;
           System.out.println("Enter file name to be created "); 
           String filename = scanner.nextLine(); 
           File f = new File(dirPath,filename); 
           if (f.exists()) 
           { System.out.println("File already exists"); } 
           else { System.out.println("No such file exists, creating now"); 
           success = f.createNewFile(); 
           if (success) 
           { System.out.printf("Successfully created new file: %s%n", f); } 
           else { System.out.printf("Failed to create new file: %s%n", f); } }        
        
        
        scanner.close();
        
        
        
        
        
        
        
        
	}//------main
}//----class
