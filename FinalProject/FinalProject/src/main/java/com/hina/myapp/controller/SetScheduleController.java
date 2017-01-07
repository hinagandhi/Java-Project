package com.hina.myapp.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


/**
 * Handles requests for the application home page.
 */
@Controller
public class SetScheduleController {
	  private static final Logger logger = LoggerFactory
	            .getLogger(SetScheduleController.class);
	 
	
	    @RequestMapping(value = "/uploadMultipleFile", method = RequestMethod.POST)
	    public @ResponseBody
	    
	    String uploadMultipleFileHandler(@RequestParam("name") String[] names,
	            @RequestParam("file") MultipartFile[] files, @RequestParam("batchId")String batchId) {
	    	
	        if (files.length != names.length)
	            return "Mandatory information missing";
	 
	        String message = "";
	        for (int i = 0; i < files.length; i++) {
	            MultipartFile file = files[i];
	            String name = names[i];
	            try {
	                byte[] bytes = file.getBytes();
	               
	                // Creating the directory to store file
	                String rootPath = System.getProperty("catalina.home");
	                File dir = new File(rootPath + File.separator + batchId);
	                if (!dir.exists())
	                    dir.mkdirs();
	 
	                // Create the file on server
	                File serverFile = new File(dir.getAbsolutePath()
	                        + File.separator + name);
	                BufferedOutputStream stream = new BufferedOutputStream(
	                        new FileOutputStream(serverFile));
	                stream.write(bytes);
	                stream.close();
	 
	           //     logger.info("Server File Location="
	             //           + serverFile.getAbsolutePath());
	 
	                message = message + "You successfully uploaded file=" + name
	                        + "<br />";
	            } catch (Exception e) {
	                return "You failed to upload " + name + " => " + e.getMessage();
	            }
	        }
	        return message;
	    }
}