package org.example.corporation.dao;

import org.example.corporation.entities.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDAO {
    public void addEmployee(Employee employee) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        } catch (Exception e) {
            if  (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
