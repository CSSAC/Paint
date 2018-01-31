package com.example.prrateekk.paint;


import android.graphics.Path;

/**
 * Created by prrateekk on 29/1/18.
 */

public class FingerPath {

    private Path path;
    private int color;
    private int strokeWidth;

    public FingerPath(Path path, int color, int strokeWidth) {
        this.path = path;
        this.color = color;
        this.strokeWidth = strokeWidth;
    }

    public Path getPath() {
        return this.path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }
}
