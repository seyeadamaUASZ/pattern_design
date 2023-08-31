package com.sid.gl.composite;

import java.util.List;

public abstract class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Employee e) {
        throw new UnsupportedOperationException();
    }

    public void remove(Employee e) {
        throw new UnsupportedOperationException();
    }

    public Employee getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public List<Employee> directs() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return String.format("%s: %d", name, id);
    }


}
