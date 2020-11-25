package com.tankilo.gap.demo.service;

import org.springframework.stereotype.Component;

@Component
public class NotTracedService {

    public void makeGap1() {
        try {
            Thread.sleep(40L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void makeGap2() {
        try {
            Thread.sleep(60L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void makeGap3() {
        try {
            Thread.sleep(80L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
