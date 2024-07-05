package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.config.HibernateConfiguration;
import com.entity.Employee;

public class EmployeeDao {
	public void getEmployees() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();

		Criteria criteria = openSession.createCriteria(Employee.class);
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		transaction.commit();
	}

	public boolean addEmployee(Employee e) {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();

		openSession.save(e);
		transaction.commit();
		return true;
	}

	public void getEmployeeSalaryMoreThanTwentyK() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();

		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("Salary", 20000.00));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}

		transaction.commit();
	}

	public void getEmployeeHavngSalaryFiftyOneK() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();

		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("Salary", 51000.00));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}

		transaction.commit();

	}

	public void getEmployeeHavngAgeMoreThanThirtyFive() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();

		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("age", 35));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee.getEname() + "  " + employee.getExperience());
		}

		transaction.commit();

	}

	public void getEmployeeHavingDevProfile() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();

		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("profile", "dev"));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}

		transaction.commit();

	}

	public void getEmployeeHavingTestProfile() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();

		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("profile", "test"));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}

		transaction.commit();

	}

	public void getEmployeeHavngSalaryTwentyFiveAndMore() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();

		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.ge("Salary", 25000.00));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}

		transaction.commit();

	}

	public void getEmployeeNotHavngSalaryFiftyOneK() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();

		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.ne("Salary", 51000.00));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee.getEname() + "  " + employee.getEmail());
		}

		transaction.commit();

	}

	public void updateEmployeeSalaryHavingExperienceLessThanTwenty() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();

		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.lt("experience", 20));
		List<Employee> list = criteria.list();

		for (Employee employee : list) {
			double updatedSalary = employee.getSalary() + 10000.00;
			employee.setSalary(updatedSalary);
			System.out.println(employee);
		}

		transaction.commit();
	}

	public boolean deleteEmployee() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();

		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("experience", 21));
		List<Employee> list = criteria.list();
		
		for (Employee employee : list) {
			openSession.delete(employee);
		}
		
		transaction.commit();
		return true;

	}

	public void updateSalaryJohn() {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();

		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("ename", "john"));
		List<Employee> list = criteria.list();

		for (Employee employee : list) {
			double updatedSalary = employee.getSalary() - 21000.00;
			employee.setSalary(updatedSalary);
			System.out.println(employee);
		}

		transaction.commit();
		
	}
}
