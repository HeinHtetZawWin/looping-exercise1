package com.demo;

import com.demo.compute.Retirement;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        context.registerShutdownHook();


        Scanner scanner = new Scanner(System.in);

        Retirement retirement = context.getBean(Retirement.class);

    }
}
