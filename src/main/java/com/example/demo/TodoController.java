package com.example.demo;

public class TodoController {
    private String name;
    private int id;

    public TodoController(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TodoController() {
        // TODO Auto-generated constructor stub
        System.out.println("");
    }


}
