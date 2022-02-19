package propertyFileConfiguration_Adactin;

public class FileReaderManager {

	private FileReaderManager() {
      //constructor as private.
	}
	
	public static FileReaderManager getInstanceFRM() { //static method.

		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
    public Configuration_Reader getInstanceCR() throws Throwable  {  //non-static method.
      
    	Configuration_Reader cr = new Configuration_Reader();
    	return cr;
    	
	}
	 
		
		
		
		
	
}
