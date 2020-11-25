package com.tankilo.gap.demo.service;

import com.tankilo.gap.demo.repository.GreetingHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService1 {


    @Autowired
    private GreetingHistoryRepository repository;

    @Autowired
    private NotTracedService notTracedService;

    public void insertGreetingHistory1(String name) {
        repository.insertGreetingHistory(name);
        notTracedService.makeGap2();
    }
}
