package com.tankilo.gap.demo.service;

import com.tankilo.gap.demo.repository.GreetingHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService2 {
    public void insertGreetingHistory2(String name) {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
