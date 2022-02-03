package com.hamit.dao;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDaoImplement<T> {

	// CRUD
	public void create(T dto);

	public void update(T dto);

	public void delete(T dto);

	public ArrayList<T> list();

	// gövdeli method
	default Connection getInterfaceConnection() {
		DatabaseConnectionEcodation baglanti = new DatabaseConnectionEcodation();
		return baglanti.getConnectionDb();
	}
}
