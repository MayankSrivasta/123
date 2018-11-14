package com.bge.dts.storysteps;

	import java.io.File;
	import java.io.IOException;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import org.apache.commons.io.FileUtils;

	public class FileBackup {
		
		public void fileCopy() throws IOException  {
	    	
	    	Date now = new Date();
	    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
	    	String time = dateFormat.format(now);
	    	String folderName = ("WhiteGate_"+time); 	    	
	    	String path = "F:\\eclipse-workspace\\Backup\\";
	        File dir = new File(path+folderName);
	        if (!dir.exists()) {
	            if (dir.mkdir()) {
	                System.out.println(folderName+"Directory is created!");
	            } else {
	                System.out.println("Failed to create directory!");
	            }
	        
	        File sourceLocation= new File("F://eclipse-workspace//ui-acceptance-whitegate//target/site/serenity");        
	        File targetLocation = new File(""+dir);
	        FileUtils.copyDirectory(sourceLocation, targetLocation); 
	    }
	    
	}
}