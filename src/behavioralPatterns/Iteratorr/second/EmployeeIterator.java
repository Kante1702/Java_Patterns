package behavioralPatterns.Iteratorr.second;

import java.util.List;
import java.util.NoSuchElementException;
//specificky iterator
public class EmployeeIterator implements Iterator<Employee>{

   private int index =0;
   private List<Employee> employeeList;

   public EmployeeIterator(List<Employee> employees)
   {
       this.employeeList = employees;
   }

    @Override
    public boolean hasNext() {
        return index < employeeList.size();
    }

    @Override
    public Employee next() {
        if(!hasNext())
        {
            throw new NoSuchElementException();
        }
        return employeeList.get(index++);
    }
}
