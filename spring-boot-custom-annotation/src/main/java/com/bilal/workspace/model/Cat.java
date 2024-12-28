package com.bilal.workspace.model;

import com.bilal.workspace.ImportantString;
import com.bilal.workspace.RunImmediately;
import com.bilal.workspace.VeryImportant;
import lombok.AllArgsConstructor;

@VeryImportant
@AllArgsConstructor
public class Cat {
    private Integer id;
    @ImportantString
    public String name;

    @RunImmediately(times = 3)
    public void makeSound() {
        System.out.println("meow!!!");
    }
}
