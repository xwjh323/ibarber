package com.example.service;

import com.example.entity.MyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.ServiceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ServiceService extends ServiceImpl<ServiceMapper, MyService> {

    @Resource
    private ServiceMapper serviceMapper;

}