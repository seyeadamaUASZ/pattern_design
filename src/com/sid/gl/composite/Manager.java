package com.sid.gl.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    private  List<Employee> directs = new ArrayList<>();
    public Manager(int id, String name) {
        super(id, name);
    }

    @Override
    public void add(Employee e) {
        directs.add(e);
    }

    @Override
    public void remove(Employee e) {
       directs.remove(e);
    }

    @Override
    public List<Employee> directs() {
        return directs;
    }

    @Override
    public Employee getChild(int i) {
        return directs.get(i);
    }
}
