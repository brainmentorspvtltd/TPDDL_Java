package com.tpddl.bts.users.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.tpddl.bts.users.dao.UploadDAO;
import com.tpddl.bts.utils.CommonConstants;
import com.tpddl.bts.utils.ExcelReader;
import com.tpddl.bts.utils.Mailer;
import com.tpddl.bts.utils.XLSDTO;

/**
 * Servlet implementation class UploadController
 */
@WebServlet("/uploadusers")
public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ResourceBundle rb = ResourceBundle.getBundle(CommonConstants.CONFIG_NAME);	
		String uploadLocation = rb.getString(CommonConstants.FILE_UPLOAD_LOCATION);
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		PrintWriter pw = response.getWriter();
			try {
				List<FileItem> fi = sf.parseRequest(request);
				for(FileItem f : fi) {
					String fullPath = uploadLocation+"/"+f.getName();
					f.write(new File(fullPath));
					ArrayList<XLSDTO> list = ExcelReader.readExcel(fullPath);
					System.out.println("File Data is :::"+list);
					System.out.println("Size is "+list.size());
					UploadDAO dao =new UploadDAO();
					String result = dao.upload(list)==false?"Record Uploaded SuccessFully ":"Problem while Uploading";
					
					pw.println(result);
					Mailer.sendMail();
					break;
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pw.close();
	}

}
