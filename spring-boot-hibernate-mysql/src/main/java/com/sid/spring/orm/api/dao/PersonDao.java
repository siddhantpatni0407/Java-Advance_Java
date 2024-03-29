package com.sid.spring.orm.api.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sid.spring.orm.api.model.Person;

/**
 * @author Siddhant
 *
 * May 1, 2021
 */
@Repository
@Transactional
public class PersonDao {

	@Autowired
	private SessionFactory factory;

	public void savePerson(Person person) {
		getSession().save(person);
	}

	@SuppressWarnings("unchecked")
	public List<Person> getPersons() {
		return getSession().createCriteria(Person.class).list();
	}

	private Session getSession() {
		Session session = factory.getCurrentSession();
		if (session == null) {
			session = factory.openSession();
		}
		return session;
	}

}
