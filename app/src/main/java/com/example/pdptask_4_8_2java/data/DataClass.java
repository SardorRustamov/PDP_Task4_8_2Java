package com.example.pdptask_4_8_2java.data;

import java.io.Serializable;

public class DataClass implements Serializable {
    private String name="";
    private String text="";

    public DataClass(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
