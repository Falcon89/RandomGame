package com.company;

import com.company.controller.Controller;
import com.company.model.Model;
import com.company.view.View;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new Model(), new View());
//        controller.userProcess();

        Set<String> s = new HashSet<>();
        System.out.println(s.add("A"));
        System.out.println(s.add("A"));
    }
}
