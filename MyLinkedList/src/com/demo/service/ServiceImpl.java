package com.demo.service;

import com.demo.dao.Dao;
import com.demo.dao.DaoImpl;

public class ServiceImpl implements Service{
	Dao dao;
	public ServiceImpl()
	{
		dao=new DaoImpl();
	}
	@Override
	public void insert(String data) {
		dao.insert(data);
		
	}
	@Override
	public String delete() {
		String s=dao.deletestr();
		return s;
	}
	@Override
	public void display() {
		dao.display();
		
	}
	@Override
	public void isFull() {
		dao.isFull();
		
	}
	@Override
	public void isEmpty() {
		dao.isEmpty();
		
	}
	
}
