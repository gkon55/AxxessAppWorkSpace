package com.example.axxessapplication.model;
import java.util.ArrayList;
import java.util.List;

public class Root
{
    private List<Data> data;

    private boolean success;

    private int status;

    public void setData(List<Data> data){
        this.data = data;
    }
    public List<Data> getData(){
        return this.data;
    }
    public void setSuccess(boolean success){
        this.success = success;
    }
    public boolean getSuccess(){
        return this.success;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public int getStatus(){
        return this.status;
    }
}
