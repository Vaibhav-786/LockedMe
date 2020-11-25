package LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LockedMePrototype
{
	
	static String fp;
	static int choice,choice1;
	public static void main (String[] args) throws IOException 
	{
		//Scanner scanner = new Scanner( System.in );
		
//------------------------------------------------------------------------------------------------		
		while(true){
			System.out.println("To execute case 1, Enter value 1");
			System.out.println("To execute case 2, Enter value 2");
			System.out.println("To Exit, Enter value 9");
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner( System.in );
			System.out.println("Enter your choice::");
			 choice = scanner.nextInt();//accept user input
			
			
		
			switch(choice){
			case 1: System.out.println("I am case 1");
//------------------------------------------------------------------------------------------------------------------------------------
	//	selecting root directory and retrieving existing file in ascending order 
		
		
		
		
		Scanner scanner1 = new Scanner( System.in );
        System.out.println("Enter the Root Directory path: ");
        String dirPath = scanner1.nextLine(); // Takes the directory path as the user input
        fp=dirPath;
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
        
        
        
        
        break;
        
 //------------------------------------------------------------------------------------------------------       
        
			case 2: System.out.println("I am case 2");
                              
			
			do{
				System.out.println("To execute case 11, Enter value 11");
				System.out.println("To execute case 22, Enter value 22");
				System.out.println("To execute case 33, Enter value 33");
				System.out.println("To Exit, Enter value 99");
				
				@SuppressWarnings("resource")
				Scanner scanner5 = new Scanner( System.in );
				
				System.out.println("Enter your choice::");
			    choice1 = scanner5.nextInt();//accept user input
			
			
			
			
				switch(choice1){
				case 11: System.out.println("I am case 11");
			
			
			
			
			
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
        
        
				Scanner scanner2 = new Scanner( System.in );
        boolean success=false;
        System.out.println("Enter file name to be created "); 
        String filename = scanner2.nextLine(); 
        File f = new File(fp,filename); 
        if (f.exists()) 
        { System.out.println("File already exists"); } 
        else { System.out.println("No such file exists, creating now"); 
        success = f.createNewFile(); 
        if (success) 
        { System.out.printf("Successfully created new file: %s%n", f); } 
        else { System.out.printf("Failed to create new file: %s%n", f); } }  

        
  //---------------------------------------------------------------------------------      
        break;
        
  //------------------------------------------------------------------------      
        
        
				case 22: System.out.println("I am case 22"); 
        
        
 //-------------------------------------------------------------------------------------------       
      //Deleting a user defined file
        
				Scanner scanner3 = new Scanner( System.in );
				
        LockedMePrototype ff1 = new LockedMePrototype();
        
        System.out.println("Enter the file to be delete: " );
        String name1 = scanner3.next();
        
        
        String result1=ff1.findFile(name1,new File(fp));
        
        File file1 = new File(result1);
        
        if (result1!=null && file1.getCanonicalPath().equals(result1)) //----added case sensitivity by using getCanonicalPath() method
        {
        	file1.delete();
        	System.out.println("File deleted successfully from location:"+result1);
        }else
        {
        	System.out.println("file is not present in directory so can't be deleted.");
        }
   
//------------------------------------------------------------------------------------------------
        
      break;
      
//--------------------------------------------------------------------------------------------------------
     
      
      
				case 33: System.out.println("I am case 33"); 
      
        
        
 //-------------------------------------------------------------------------------------------------------------------------       
        // Searching a user defined file
        
        
				Scanner scanner4 = new Scanner( System.in );
				
        LockedMePrototype ff = new LockedMePrototype();
       
        System.out.println("Enter the file to be searched: " );
        String name = scanner4.next();
        
        
        String result=ff.findFile(name,new File(fp));
        
        File file = new File(result);
        
        if (result!=null && file.getCanonicalPath().equals(result)) //----added case sensitivity by using getCanonicalPath() method
        {
        	System.out.println("File searched successfully at location:"+result);
        }else
        {
        	System.out.println("file is not present in directory.");
        }
        
//-------------------------------------------------------------------------------------------------------
       
        break;
        
//----------------------------------------------------------------------------------------------------------
				case 99: System.out.println("Exiting the inner application"); 
   
				
				break;
//-----------------------------------------------------------------------------------------------------				
				
				default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
				
				
				}//--------switch2
				
				
			}//----------while2
			while (choice1 != 99);
			break;

//--------------------------------------------------------------------------------------------------				
             
			
			case 9: System.out.println("Exiting the application");
			System.exit(0);
			
//---------------------------------------------------------------------------------------------------------			
			
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			
			
			}//---------switch1
			
			//scanner.close();
			
		}//----------------while1
			
			//scanner.close(); 
        
	
	
      
	
	
	
	}//-----main 
	
	public String findFile(String name,File file) 
    {    
		String searchedpath="";
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
                findFile(name,fil);
            }
            else if (name.equalsIgnoreCase(fil.getName()))
            {
            	searchedpath=fil.getAbsolutePath();
            }
            
        }
		return (searchedpath);
    }
	
	
}//------class