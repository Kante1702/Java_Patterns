package behavioralPatterns.Iteratorr.second;

import java.util.List;

public class Company implements Agregate{

    private List<Employee> employees;
    public Company(List<Employee>employees) {
        this.employees = employees;
    }

    @Override
    public Iterator createIterator() {
        return new EmployeeIterator(employees);
    }
}
