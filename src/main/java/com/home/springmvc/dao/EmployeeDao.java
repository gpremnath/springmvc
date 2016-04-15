package com.home.springmvc.dao;

/**
 * Created by premnath on 5/8/15.
 */
import java.util.List;

import com.home.springmvc.model.Employee;

public interface EmployeeDao {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

}