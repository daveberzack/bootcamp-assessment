package com.daveberzack.bootcamp.assessment.service;

import org.springframework.stereotype.Service;

@Service
public class AdderService {

    public int addNumbers(int a, int b){
        return a + b;
    }

}
