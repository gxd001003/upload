package com.example.upload.Service.Impl;

import com.example.upload.Service.UploadService;
import com.example.upload.bean.FileInfo;
import com.example.upload.mapper.UploadMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadImpl implements UploadService {
    @Autowired
    UploadMapper uploadMapper;

    public void addfile(FileInfo fileBean) {
        uploadMapper.insert(fileBean);
    }

}
