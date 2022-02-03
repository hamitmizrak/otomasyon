package com.hamit.main;

import java.util.Scanner;

import com.hamit.dao.AdminDao;
import com.hamit.dto.AdminDto;
import com.hamit.dto.UserDto;

public class MainClass {

	private int sonuc() {
		System.out.println("\nBir secim yapiniz...");
		System.out.println("1-)Ekle\n2-)Gincelle\n3-)Sil\n4-)Listele\n5-)iikii");
		Scanner klavye = new Scanner(System.in);
		int cevap = klavye.nextInt();
		return cevap;
	}

	public void isRegister() {
		Scanner klavye = new Scanner(System.in);
		String userName, userSurname, userPassword, userEmailAddress;
		UserDto dto = new UserDto();

		System.out.println("adınızı  giriniz");
		userName = klavye.nextLine();
		dto.setUserName(userName);

		System.out.println("soyadınızı  giriniz");
		userSurname = klavye.nextLine();
		dto.setUserName(userSurname);

		System.out.println("şifrenizi  giriniz");
		userPassword = klavye.nextLine();
		dto.setUserPassword(userPassword);

		System.out.println("Email addresinizi giriniz");
		userEmailAddress = klavye.nextLine();
		dto.setUserEmailAddress(userEmailAddress);
	}

	public void karar() {

		boolean isLogin = false;

		if (isLogin) {
			try {
				int key = sonuc();
				switch (key) {
					case 1:
						createMethod();
						System.out.println("*************************************************************************");
						listMethod();
						System.out.println("*************************************************************************");
						break;

					case 2:
						System.out.println("*************************************************************************");
						listMethod();
						System.out.println("*************************************************************************");
						updateMethod();
						break;

					case 3:
						System.out.println("*************************************************************************");
						listMethod();
						System.out.println("*************************************************************************");
						deleteMethod();
						break;

					case 4:
						listMethod();
						break;

					case 5:
						System.out.println("iikii yapiliyor");
						System.exit(0);
						break;

					default:
						System.out.println("Verdmii olduiunuz sayi seiimin diiindadir.");
						break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Lütfen Giriş yapınız olunuz.... ");
		}

	}

	private void listMethod() {
		AdminDao adminDao = new AdminDao();
		for (AdminDto temp : adminDao.list()) {
			System.out.println(temp);
		}
	}

	private void deleteMethod() {
		AdminDao adminDao = new AdminDao();
		AdminDto adminDto = new AdminDto();
		System.out.println("Silmek istediiiniz id giriniz");
		Scanner klavye = new Scanner(System.in);
		int id = klavye.nextInt();
		adminDto.setAdminId(id);
		adminDao.delete(adminDto);

	}

	private void updateMethod() {
		AdminDao adminDao = new AdminDao();
		AdminDto adminDto = new AdminDto();
		Scanner klavye = new Scanner(System.in);
		String adi, soyadi, sifre, email;
		int id;
		System.out.println("Gincelenecek  ID giriniz");
		id = klavye.nextInt();

		System.out.println("Gincelenecek  adi giriniz");
		adi = klavye.nextLine();
		System.out.println("Gincelenecek  soyadi giriniz");
		soyadi = klavye.nextLine();
		System.out.println("Gincelenecek  iifre giriniz");
		sifre = klavye.nextLine();
		System.out.println("Gincelenecek  email giriniz");
		email = klavye.nextLine();

		adminDto.setAdminId(id);
		adminDto.setAdminEmail(email);
		adminDto.setAdminName(adi);
		adminDto.setAdminSurname(soyadi);
		adminDto.setAdminPassword(sifre);
		adminDao.update(adminDto);
	}

	private void createMethod() {
		AdminDao adminDao = new AdminDao();
		AdminDto adminDto = new AdminDto();
		Scanner klavye = new Scanner(System.in);
		String adi, soyadi, sifre, email;

		System.out.println("Eklenecek  adi giriniz");
		adi = klavye.nextLine();
		System.out.println("Eklenecek  soyadi giriniz");
		soyadi = klavye.nextLine();
		System.out.println("Eklenecek  iifre giriniz");
		sifre = klavye.nextLine();
		System.out.println("Eklenecek  email giriniz");
		email = klavye.nextLine();

		adminDto.setAdminEmail(email);
		adminDto.setAdminName(adi);
		adminDto.setAdminSurname(soyadi);
		adminDto.setAdminPassword(sifre);
		adminDao.create(adminDto);

	}
}

/*
 
 
  
 */
