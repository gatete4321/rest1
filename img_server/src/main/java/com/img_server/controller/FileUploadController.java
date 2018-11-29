package com.img_server.controller;

import com.img_server.DateUtil;
import com.img_server.Log;
import com.img_server.ValidationUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/*
  @author zy
  @date: 2018/3/18 11:33
  
*/
@RestController
@RequestMapping("/fileManage")
public class FileUploadController {

    @Value("${img.filePath}")
    private String filePath;

    //文件上传相关代码
    @PutMapping (value = "/uploadImg")
    public String upload(@RequestParam("file") MultipartFile file) {
        JSONObject returnData = new JSONObject();
        if (file.isEmpty()) {
            returnData.put("RETURN_CODE", 2);
            returnData.put("RETURN_MSG","Empty file");
            return returnData.toString();
        }
        // 获取文件名
        String fileName = file.getOriginalFilename();
        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        if(suffixName.contains("jpg")||suffixName.contains("JPG")||suffixName.contains("jpeg")||suffixName.contains("JPEG")||suffixName.contains("png")||suffixName.contains("PNG")){
        }else {
            Log.logger.info("Invalid file type");
            returnData.put("RETURN_CODE", 2);
            returnData.put("RETURN_MSG","Invalid file type");
            return returnData.toString();
        }
        Log.logger.info("================================ fileName =  "+fileName+"       path = "+filePath);
        //新文件名
        fileName = DateUtil.formateDateAndSSS()+suffixName;
        // 文件上传后的路径
        File dest = new File(filePath + fileName);
        // 检测是否存在目录
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
            returnData.put("RETURN_CODE", 1);
            returnData.put("RETURN_MSG","Upload successful");
            returnData.put("RETURN_DATA",fileName);
            Log.logger.info("================================ return =  Upload successful");
            return returnData.toString();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        returnData.put("RETURN_CODE", 2);
        returnData.put("RETURN_MSG","Upload failure");
        return returnData.toString();
    }

    /*
        根据name获取图片
     */
    @RequestMapping(value = "/showImg/{picName}")
    public void showMerchantPicture(HttpServletResponse response, @PathVariable String picName) {
        try {
            response.setCharacterEncoding("UTF-8");
            if (null != picName && !"".equals(picName)) {
                if(ValidationUtil.isNullString(filePath)){
                    return;
                }
                Log.logger.info("showImg,picPath="+filePath);
                File file = new File(filePath+picName);
                if(!file.exists()){
                    Log.logger.info("Image not found,picPath="+filePath);
                    return;
                }
                FileInputStream is = new FileInputStream(filePath+picName);
                // 得到文件大小
                int i = is.available();
                byte data[] = new byte[i];
                // 读数据
                is.read(data);
                is.close();
//                 设置返回的文件类型
                response.setContentType("image/*");
//                 得到向客户端输出二进制数据的对象
                OutputStream toClient = response.getOutputStream();
//                 输出数据
                toClient.write(data);
                toClient.close();
                Log.logger.info("Read the picture");
            }
        }catch (FileNotFoundException e){
            Log.logger.info("Image not found.");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
