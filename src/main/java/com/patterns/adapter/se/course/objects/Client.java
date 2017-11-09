package com.patterns.adapter.se.course.objects;

import com.patterns.adapter.se.course.adapter.PrinterAdapter;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("text1");
        list.add("text2");
        list.add("text3");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);
    }
}
