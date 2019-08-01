package com.neu.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class fileUpLoad
 */
@WebServlet("/fileUpLoad")
@MultipartConfig(maxFileSize=5242880,maxRequestSize=10485760)
public class fileUpLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fileUpLoad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	Part part = request.getPart("file");
		
		Collection<Part> parts = request.getParts();
		//�õ��ϴ����ļ���
		for(Part part : parts) {
			String fileName=part.getSubmittedFileName();
			
			String path = request.getServletContext().getRealPath("/files");
			
			String newFileName=path + "/"+fileName;
			
			if(fileName !=null && !fileName.equals("")) {
				//���ļ�����д�뵽ָ���ļ�λ��
				part.write(newFileName);
				
				
			}
		}
		
		
		response.getWriter().print("fileupload ok");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}






















