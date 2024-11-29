package com.example.SpringDB_ByUsingHQL.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SpringDB_ByUsingHQL.entity.Employee;

@Repository
public class Emp_Dao {

    @Autowired
    SessionFactory factory;

    public String insert(Employee e) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(e); // Simplified - Using Hibernate's save method

        transaction.commit();
        session.close();
        return "Employee data saved successfully.";
    }

    public String delete(int emp_id) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "delete from Employee where emp_id = :emp_id";
        Query<Employee> query = session.createQuery(hql);
        query.setParameter("emp_id", emp_id);

        int rowsAffected = query.executeUpdate();
        transaction.commit();
        session.close();

        return rowsAffected > 0 ? "Employee data deleted successfully." : "No Employee found to delete.";
    }

    public String update(Employee e, int emp_id) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "update Employee set firstname = :firstname, lastname = :lastname, address = :address, city = :city where emp_id = :emp_id";
        Query<?> query = session.createQuery(hql);
        query.setParameter("firstname", e.getFirstname());
        query.setParameter("lastname", e.getLastname());
        query.setParameter("address", e.getAddress());
        query.setParameter("city", e.getCity());
        query.setParameter("emp_id", emp_id);

        int rowsAffected = query.executeUpdate();
        transaction.commit();
        session.close();

        return rowsAffected > 0 ? "Employee data updated successfully." : "No Employee found to update.";
    }

    public Employee getSingleRecord(int emp_id) {
        Session session = factory.openSession();

        String hql = "from Employee where emp_id = :emp_id";
        Query<Employee> query = session.createQuery(hql, Employee.class);
        query.setParameter("emp_id", emp_id);

        Employee employee = query.uniqueResult();
        session.close();

        return employee;
    }

    public List<Employee> fetchAllData() {
        Session session = factory.openSession();

        String hql = "from Employee";
        Query<Employee> query = session.createQuery(hql, Employee.class);

        List<Employee> employees = query.getResultList();
        session.close();

        return employees;
    }
}
