package com.ti.tetris.model;

import com.ti.tetris.model.shapes.*;

import java.util.concurrent.ThreadLocalRandom;

public class ShapeFactory {
    public ShapeInterface getShape(){
        Integer rand = ThreadLocalRandom.current().nextInt(7);
        switch (rand){
            case 0:
                return new I();
            case 1:
                return new J();
            case 2:
                return new L();
            case 3:
                return new O();
            case 4:
                return new S();
            case 5:
                return new Z();
            case 6:
                return new T();

      }
        return null;
    }
}
