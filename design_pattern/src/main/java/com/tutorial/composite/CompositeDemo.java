package com.tutorial.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 30000);
        Employee headSales = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michale", "Head marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee sales1 = new Employee("Richard", "Sales", 10000);
        Employee sales2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headMarketing);
        CEO.add(headSales);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        headSales.add(sales1);
        headSales.add(sales2);

        Employee.printEmployeeTree(CEO);
    }
}
