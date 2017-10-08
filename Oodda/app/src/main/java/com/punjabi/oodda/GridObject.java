package com.punjabi.oodda;

/**
 * Created by Aman on 13-Feb-16.
 */
public class GridObject {

    private String name;
    private int state;

    public GridObject(String name, int state) {
        super();
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
