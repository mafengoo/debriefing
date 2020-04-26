package com.hanlm.debriefing.modules.file.controller;

import com.hanlm.debriefing.resultReturn.ReturnResult;
import com.hanlm.debriefing.util.FileUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/file")
public class FileController {

    @RequestMapping("/downloadFile")
    public void Download(HttpServletResponse response) {
        String fileName = "ceshi1.mp4";
        String result = FileUtil.downloadFile(response, fileName);
        System.out.println(result);
    }
    @RequestMapping("/test")
    public ReturnResult test(){
        return ReturnResult.ok().message("测试");
    }
}
