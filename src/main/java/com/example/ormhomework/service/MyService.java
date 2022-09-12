package com.example.ormhomework.service;

import com.example.ormhomework.repositiry.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    MyRepository myRepository;
}
