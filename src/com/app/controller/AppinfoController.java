package com.app.controller;


import com.app.pojo.AppInfo;
import com.app.service.AppInfoService;
import com.app.service.AppInfoSrevice;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/dev")
public class AppinfoController {

    @Resource
    private AppInfoService appInfoService    ;

    @RequestMapping("/flatform/app/list")
    public String appInfoList(HttpServletRequest request){

        List<AppInfo> appInfoList =  appInfoService.findAppInfoList();
        request.setAttribute("appInfoList",appInfoList);

        return "developer/appinfolist";
    }
}
