package com.kf.controller;

import com.kf.entity.Cpu;
import com.kf.entity.Screen;

public class Computer {
    private Cpu cpu;
    private Screen screen;
    public void output(){
        cpu.calc();
        screen.display();
    }
    public Cpu getCpu()
    {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
