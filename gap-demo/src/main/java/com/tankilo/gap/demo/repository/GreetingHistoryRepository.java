package com.tankilo.gap.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingHistoryRepository {
    public int insertGreetingHistory(String name) {
        try {
            Thread.sleep(200L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }
}
