package com.example.upload.bean;


import javax.persistence.Column;
import javax.persistence.Id;

public class FileInfo {
    @Id
    @Column
    private int id;
    @Column
    private int size;
    @Column
    private String type;
    @Column
    private  String name1;
    @Column
    private String time;
    @Column
    private String  adress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
