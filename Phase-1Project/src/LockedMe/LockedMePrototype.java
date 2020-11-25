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
		//User Interface
		
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("******************************LOCKEDME.COM (PROTOTYPE)*****************************");
		System.out.println("-----------------------------------------------------------------------------------"); 
		System.out.println("LOCKEDME.COM (PROTOTYPE) is a virtual key for your repository.");
		System.out.println("In this Application there are three options with generic features as follow:");
		System.out.println("Option 1--> Setting the root path of directory and retrieving the existing file names in ascending order");
		System.out.println("Option 2--> Contains business level operations as follow:");
		System.out.println("\tOption 1--> Add a user defined file in present directory.");
		System.out.println("\tOption 2--> Delete a user defined file in present directory.");
		System.out.println("\tOption 3--> Search a user defined file in present directory.");
		System.out.println("\tOption 4--> Navigate back to main menu.");
		System.out.println("Option 3--> Close the Application.");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("HERE STARTS THE APPLICATION");
		System.out.println("---------------------------------------------------------------------------------");
//-----------------------------------------------------------------------------------------------------------------------------------------------------		
		//Switch1
		
		while(true){
			System.out.println("******************************----------------------*****************************");
			System.out.println("To set path of root directory and retrieve existing file in ascending order, Enter value 1.");
			System.out.println("To do business-level operation, Enter value 2");
			System.out.println("To close the Application, Enter value 3");
			System.out.println("******************************----------------------*****************************");
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner( System.in );
			System.out.println("Enter your value:");
			 choice = scanner.nextInt();//accept user input
			
			
		
			switch(choice){
			case 1: 
//-----------------------------------------------------------------------------------------------------------------------------------------------------
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
			System.out.println("******************************----------------------*****************************");
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
        
 //----------------------------------------------------------------------------------------------------------------------------------------------------       
        
			case 2: 
                              
			
			do{
				System.out.println("******************************----------------------*****************************");
				System.out.println("To add file, Enter value 1");
				System.out.println("To delete file, Enter value 2");
				System.out.println("To search file, Enter value 3");
				System.out.println("To navigate to main menu, Enter value 4");
				System.out.println("******************************----------------------*****************************");
				
				@SuppressWarnings("resource")
				Scanner scanner5 = new Scanner( System.in );
				
				System.out.println("Enter your value:");
			    choice1 = scanner5.nextInt();//accept user input
			
			
			
			
				switch(choice1){
				case 1: 
			
			
			
			
			
//-----------------------------------------------------------------------------------------------------------------------------------------------------
     //Adding a file to existing directory   

         
        
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

        
//-----------------------------------------------------------------------------------------------------------------------------------------------------      
        break;
        
//-----------------------------------------------------------------------------------------------------------------------------------------------------      
        
        
				case 2:  
        
        
//-----------------------------------------------------------------------------------------------------------------------------------------------------       
      //Deleting a user defined file
        
		Scanner scanner3 = new Scanner( System.in );
				
        LockedMePrototype ff1 = new LockedMePrototype();
        
        System.out.println("Enter the file to be deleted: " );
        String name1 = scanner3.next();
        
        
        String result1=ff1.findFile(name1,new File(fp));
        
        File file1 = new File(result1);
        
        if (result1!=null && file1.getCanonicalPath().equals(result1)) //----added case sensitivity by using getCanonicalPath() method
        {
        	file1.delete();
        	System.out.println("File deleted successfully from location:"+result1);
        }else
        {
        	System.out.println("file is not present in directory so can't be delete.");
        }
   
//-----------------------------------------------------------------------------------------------------------------------------------------------------
        
      break;
      
//-----------------------------------------------------------------------------------------------------------------------------------------------------
     
      
      
				case 3:  
      
        
        
//-----------------------------------------------------------------------------------------------------------------------------------------------------      
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
        
//-----------------------------------------------------------------------------------------------------------------------------------------------------
       
        break;
        
//-----------------------------------------------------------------------------------------------------------------------------------------------------
				case 4: System.out.println("Navigating back to main menu."); 
   
				
				break;
//-----------------------------------------------------------------------------------------------------------------------------------------------------				
				
				default: System.out.println("Incorrec value! please select correct value.");
				
				
				}//--------switch2
				
				
			}//----------while2
			while (choice1 != 4);
			break;

//-----------------------------------------------------------------------------------------------------------------------------------------------------				
             
			
			case 3: System.out.println("APPLICATION CLOSED.");
			System.exit(0);
			
//-----------------------------------------------------------------------------------------------------------------------------------------------------			
			
			default: System.out.println("Incorrec value! please select correct value.");
			
			
			}//---------switch1
			
		
			
		}//----------------while1
			
		 
        
	
	
      
	
	
	
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