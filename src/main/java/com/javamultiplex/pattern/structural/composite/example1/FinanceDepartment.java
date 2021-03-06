package com.javamultiplex.pattern.structural.composite.example1;

/**
 * @author Rohit Agarwal on 01/09/20 9:11 pm
 * @copyright www.javamultiplex.com
 */
public class FinanceDepartment implements Department {
    @Override
    public void printDepartmentName() {
        System.out.println(this.getClass().getSimpleName());
    }
}
