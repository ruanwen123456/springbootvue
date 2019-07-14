package com.ruanhao.springbootvue;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class SingleUpload {

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	@GetMapping("uploadSingle")
	public String getUploadSingle() {
		return "uploadSingle";
	}
	@PostMapping("/uploadSingle")
	@ResponseBody
	public String upload(MultipartFile uploadFile,HttpServletRequest request) {
		String realPath = request.getSession().getServletContext().getRealPath("/uploadFile");
		String format = sdf.format(new Date());
		File folder = new File(realPath+format);
		//如果目录不存在就创建
		if(!folder.isDirectory()) {
			folder.mkdirs();
		}
		String oldName = uploadFile.getOriginalFilename();
		String newName = UUID.randomUUID().toString()+oldName.substring(oldName.indexOf("."), oldName.length());
		try {
			uploadFile.transferTo(new File(folder, newName));
			String filePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/uploadFile/"+format+newName;
			return filePath;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "上传失败";
	}
	
}
