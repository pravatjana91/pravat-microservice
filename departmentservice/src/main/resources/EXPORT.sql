
-- Dumping database structure for sample
DROP DATABASE IF EXISTS `sample`;
CREATE DATABASE IF NOT EXISTS `sample` /*!40100 DEFAULT CHARACTER SET utf8mb4  */;
USE `sample`;

-- Dumping structure for table sample.department
DROP TABLE IF EXISTS `department`;
CREATE TABLE IF NOT EXISTS `department` (
  `department_id` int(11) NOT NULL AUTO_INCREMENT,
  `department_name` int(11) DEFAULT NULL,
  PRIMARY KEY (`department_id`)
) ;

-- Dumping data for table sample.department: ~0 rows (approximately)
DELETE FROM `department`;

-- Dumping structure for table sample.employee
DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `employee_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255)  DEFAULT NULL,
  `last_name` varchar(255)  DEFAULT NULL,
  `email` varchar(255)  DEFAULT NULL,
  `address_line` varchar(255)  DEFAULT NULL,
  `City` varchar(255)  DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ;

-- Dumping data for table sample.employee: ~0 rows (approximately)
DELETE FROM `employee`;

-- Dumping structure for table sample.employee_department
DROP TABLE IF EXISTS `employee_department`;
CREATE TABLE IF NOT EXISTS `employee_department` (
  `emp_dept_map_id` int(10) NOT NULL AUTO_INCREMENT,
  `employee_id` int(10) DEFAULT NULL,
  `dept_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`emp_dept_map_id`)
) ;

-- Dumping data for table sample.employee_department: ~0 rows (approximately)
DELETE FROM `employee_department`;
