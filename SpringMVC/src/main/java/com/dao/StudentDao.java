package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bean.Student;

public class StudentDao{
	
	private HibernateTemplate hibernatetemplete;
	
	

	public HibernateTemplate getHibernatetemplete() {
		return hibernatetemplete;
	}



	public void setHibernatetemplete(HibernateTemplate hibernatetemplete) {
		this.hibernatetemplete = hibernatetemplete;
	}

	@Transactional
	public void inserStudent(Student s) {
		this.hibernatetemplete.saveOrUpdate(s);
	}
	
	@Transactional
	public List<Student> getAllStudent(){
		return this.hibernatetemplete.loadAll(Student.class);
	}

	@Transactional
	public Student getStudent(int id) {
		return this.hibernatetemplete.get(Student.class, id);
	}
	
	@Transactional
	public void deleteStudent(int id) {
		Student s = this.hibernatetemplete.get(Student.class, id);
		this.hibernatetemplete.delete(s);
	}
}