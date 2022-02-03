create database otomasyon;
use otomasyon;


CREATE TABLE `hastane_otomasyonu`.`admin10` (
  `admin_id` INT NOT NULL AUTO_INCREMENT,
  `admin_name` VARCHAR(45) NULL,
  `admin_surname` VARCHAR(45) NULL,
  `admin_password` VARCHAR(45) NULL,
  `admin_email` VARCHAR(45) NULL,
  `creation_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`admin_id`));
