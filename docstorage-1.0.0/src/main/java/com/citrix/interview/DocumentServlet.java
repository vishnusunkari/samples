package com.citrix.interview;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;
/**
 * Do not change the @WebServlet annotation Follow the REST API specification,
 * avoid multipart form uploads
 */
@WebServlet("/documents/*")
public class DocumentServlet extends HttpServlet {

	private static final String id = null;
	/**
	 * Implement storage servlet here!
	 */

	// Search Document if present or not
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean success = false;
		File file = null;
		try {
					
			file = getFile(request);			
			if (!file.exists()) {				
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);			
			} else {
				System.out.println("File exists  !");
				response.setContentLength((int) file.length());
		        response.setHeader("Content-Disposition", "attachment; filename="
		                + file.getName());
		        ServletOutputStream outStream = response.getOutputStream();
		        byte[] bbuf = new byte[(int) file.length() + 1024];
		        DataInputStream in = new DataInputStream(new FileInputStream(file));
		        int length = 0;
		        while ((in != null) && ((length = in.read(bbuf)) != -1)) {
		            outStream.write(bbuf, 0, length);
		        }
		        in.close();
		        outStream.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}		
		if (success) {
			response.setStatus(HttpServletResponse.SC_OK);
		}
	}

	// Creation of Document
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String unique = UUID.randomUUID().toString();
		String docId = unique.substring(0, 20);
		// create the document
		try {
			Path target = Paths.get("C:" + "/" + docId);
			Path path = Files.createFile(target);
			File file = path.toFile();
			OutputStream outputStream = new FileOutputStream(file);
			IOUtils.copy(request.getInputStream(), outputStream);
			response.setStatus(HttpServletResponse.SC_CREATED);
			response.setContentLength((int) file.length());
		} catch (IOException io) {
			io.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}

	}

	// Deletion of Document
	@Override
	public void doDelete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean success = false;
		File file = null;
		try {
			file = getFile(request);			
			if (!file.exists()) {				
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);			
			} else {
				System.out.println("File exists  !");
				success = file.delete(); // actual delete operation
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}		
		if (success) {
			response.setStatus(HttpServletResponse.SC_NO_CONTENT);
		} 		
	}

	private File getFile(HttpServletRequest request) throws Exception {		
		StringBuilder fileName = new StringBuilder("C:\\\\").append(request.getPathInfo().substring(1));		
		return new File(fileName.toString());
	}

}
