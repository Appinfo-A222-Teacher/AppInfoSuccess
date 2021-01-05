package com.app.mapper;

import com.app.pojo.AppInfo;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;

import java.util.List;

public interface AppInfoMapper {
    List<AppInfo> findAppInfoList();
}
