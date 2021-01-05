package com.app.service;

import com.app.mapper.AppInfoMapper;
import com.app.pojo.AppInfo;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

public class AppInfoServiceImpl implements AppInfoService {
    @Resource
    private AppInfoMapper appInfoMapper;
    @Override
    public List<AppInfo> findAppInfoList() {
        return appInfoMapper.findAppInfoList();
    }
}
