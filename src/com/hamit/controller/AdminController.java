package com.hamit.controller;

import java.util.ArrayList;

import com.hamit.dao.AdminDao;
import com.hamit.dao.IDaoImplement;
import com.hamit.dto.AdminDto;

public class AdminController implements IDaoImplement<AdminDto> {
	AdminDao adminDao;

	@Override
	public void create(AdminDto dto) {
		adminDao = new AdminDao();
		adminDao.create(dto);
	}

	@Override
	public void update(AdminDto dto) {
		adminDao = new AdminDao();
		adminDao.update(dto);

	}

	@Override
	public void delete(AdminDto dto) {
		adminDao = new AdminDao();
		adminDao.delete(dto);

	}

	@Override
	public ArrayList<AdminDto> list() {
		adminDao = new AdminDao();
		return adminDao.list();
	}

}
