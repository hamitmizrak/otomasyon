package com.hamit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.hamit.dto.AdminDto;

public class AdminDao implements IDaoImplement<AdminDto> {

	// create
	@Override
	public void create(AdminDto dto) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "insert admin10 (admin_name,admin_surname,admin_password,admin_email) values (?,?,?,?); ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, dto.getAdminName());
			preparedStatement.setString(2, dto.getAdminSurname());
			preparedStatement.setString(3, dto.getAdminPassword());
			preparedStatement.setString(4, dto.getAdminEmail());
			int rowsEfected = preparedStatement.executeUpdate();
			if (rowsEfected > 0) {
				System.out.println(AdminDto.class + " Ba�ar�l� bir �ekilde eklendi.");
			} else {
				System.out.println("AdminDto eklemede s�k�nt� var .....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// update
	@Override
	public void update(AdminDto dto) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "update admin10 set admin_name=?,admin_surname=?,admin_password=?,admin_email=? where admin_id=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, dto.getAdminName());
			preparedStatement.setString(2, dto.getAdminSurname());
			preparedStatement.setString(3, dto.getAdminPassword());
			preparedStatement.setString(4, dto.getAdminEmail());
			preparedStatement.setInt(5, dto.getAdminId());
			int rowsEfected = preparedStatement.executeUpdate();
			if (rowsEfected > 0) {
				System.out.println(AdminDto.class + " Ba�ar�l� bir �ekilde g�ncellendi.");
			} else {
				System.out.println("AdminDto g�ncelleme s�k�nt� var .....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// delete
	@Override
	public void delete(AdminDto dto) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "delete from  admin10  where admin_id=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, dto.getAdminId());
			int rowsEfected = preparedStatement.executeUpdate();
			if (rowsEfected > 0) {
				System.out.println(AdminDto.class + " Ba�ar�l� bir �ekilde silindi.");
			} else {
				System.out.println("AdminDto silmede s�k�nt� var .....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// list
	@Override
	public ArrayList<AdminDto> list() {
		AdminDto adminDto;
		ArrayList<AdminDto> list = new ArrayList<AdminDto>();
		try (Connection connection = getInterfaceConnection()) {
			String sql = "select * from  admin10";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				adminDto = new AdminDto();
				adminDto.setAdminId(resultSet.getInt("admin_id"));
				adminDto.setAdminName(resultSet.getString("admin_name"));
				adminDto.setAdminSurname(resultSet.getString("admin_surname"));
				adminDto.setAdminEmail(resultSet.getString("admin_email"));
				adminDto.setAdminPassword(resultSet.getString("admin_password"));
				adminDto.setTarih(resultSet.getDate("creation_date"));
				list.add(adminDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// test
	public static void main(String[] args) {
		AdminDao dao = new AdminDao();

		// Create
		// AdminDto dto = new AdminDto("Hamit", "Mizrak", "sifre", "hamitmizrak@gmail.com");
		// dao.create(dto);

		// update
		// AdminDto dto = new AdminDto("Hamit44", "Mizrak44", "sifre44", "hamitmizrak@gmail.com44");
		// dto.setAdminId(2);
		// dao.update(dto);

		// delete
		// AdminDto dto = new AdminDto();
		// dto.setAdminId(2);
		// dao.delete(dto);

		// listeleme
		// for (AdminDto temp : dao.list()) {
		// System.out.println(temp);
		// }

	}
}
