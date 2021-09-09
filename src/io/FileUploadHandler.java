package io;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Stream;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import parser.ColorAverage;
import parser.ParsePixels;

public class FileUploadHandler extends HttpServlet {
    private static final long serialVersionUID = 1 ;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String file_name = null;
        String file_name2="";
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
        if (!isMultipartContent) {
            return;
        }
        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
            List < FileItem > fields = upload.parseRequest(request);
            Iterator < FileItem > it = fields.iterator();
            if (!it.hasNext()) {
                return;
            }
            
            while (it.hasNext()) {
                FileItem fileItem = it.next();
                file_name2 = fileItem.getName();
                    if (fileItem.getSize() > 0) {
                    	String tempFilePath = fileItem.toString().split(", ")[1].replace("StoreLocation=","");
                        file_name = tempFilePath.split("/")[tempFilePath.split("/").length-1];
                    	Stream<Entry<String, Integer>> colors = new ColorAverage(new ParsePixels(tempFilePath).getColors()).getValue();
                    	//colors.forEach(System.out::println);
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            out.println("<script type='text/javascript'>");
            out.println("window.location.href='index.jsp?filename="+file_name2+"'");
            out.println("</script>");
            out.close();
        }
    }
}