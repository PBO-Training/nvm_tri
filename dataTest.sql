-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: travel
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `car` (
  `car_id` bigint NOT NULL AUTO_INCREMENT,
  `amount` int NOT NULL,
  `code` varchar(10) NOT NULL,
  `license_plates` varchar(45) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`car_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,9,'LS01','75B-000425','Limousine',50000),(2,12,'LS02','75B-001422','Limousine',70000),(3,17,'LS03','75B-002735','Limousine',100000);
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `info`
--

DROP TABLE IF EXISTS `info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `info` (
  `info_id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `fullname` varchar(255) NOT NULL,
  `identification_number` varchar(12) DEFAULT NULL,
  `phone` varchar(10) NOT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`info_id`),
  KEY `FKlwgnpuilbh37r12bu32bgfbow` (`user_id`),
  CONSTRAINT `FKlwgnpuilbh37r12bu32bgfbow` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `info`
--

LOCK TABLES `info` WRITE;
/*!40000 ALTER TABLE `info` DISABLE KEYS */;
INSERT INTO `info` VALUES (1,'204 P1','tri72027@gmail.com','Nguyễn Văn Minh Trí','191848429','0702427138',1),(2,'25 Nguyễn Văn Cừ','asdhasd@gmail.,com','Nguyễn Xuaan Tân An','123456789','0123456789',NULL);
/*!40000 ALTER TABLE `info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `province`
--

DROP TABLE IF EXISTS `province`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `province` (
  `province_id` bigint NOT NULL AUTO_INCREMENT,
  `code` varchar(10) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`province_id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `province`
--

LOCK TABLES `province` WRITE;
/*!40000 ALTER TABLE `province` DISABLE KEYS */;
INSERT INTO `province` VALUES (1,'BG','Bắc Giang'),(2,'BK','Bắc Kạn'),(3,'CB','Cao Bằng'),(4,'HG','Hà Giang'),(5,'LS','Lạng Sơn'),(6,'PT','Phú Thọ'),(7,'QN','Quảng Ninh'),(8,'TN','Thái Nguyên'),(9,'TQ','Tuyên Quang'),(10,'LC','Lào Cai'),(11,'YB','Yên Bái'),(12,'DB','Điện Biên'),(13,'HB','Hòa Bình'),(14,'LC','Lai Châu'),(15,'SL','Sơn La'),(16,'BN','Bắc Ninh'),(17,'HNA','Hà Nam'),(18,'HD','Hải Dương'),(19,'HY','Hưng Yên'),(20,'ND','Nam Định'),(21,'NB','Ninh Bình'),(22,'TB','Thái Bình'),(23,'VP','Vĩnh Phúc'),(24,'HN','Hà Nội'),(25,'HP','Hải Phòng'),(26,'HT','Hà Tĩnh'),(27,'NA','Nghệ An'),(28,'QB','Quảng Bình'),(29,'QT','Quảng Trị'),(30,'TH','Thanh Hóa'),(31,'TTH','Thừa Thiên–Huế'),(32,'DL','Đắk Lắk'),(33,'DN','Đắk Nông'),(34,'GL','Gia Lai'),(35,'KT','Kon Tum'),(36,'LD','Lâm Đồng'),(37,'BD','Bình Định'),(38,'BT','Bình Thuận'),(39,'KH','Khánh Hòa'),(40,'NT','Ninh Thuận'),(41,'PY','Phú Yên'),(42,'QNA','Quảng Nam'),(43,'QNG','Quảng Ngãi'),(44,'ĐN','Đà Nẵng'),(45,'BRVT','Bà Rịa–Vũng Tàu'),(46,'BD','Bình Dương'),(47,'BP','Bình Phước'),(48,'DNAI','Đồng Nai'),(49,'TN','Tây Ninh'),(50,'HCM','Hồ Chí Minh'),(51,'AG','An Giang'),(52,'BL','Bạc Liêu'),(53,'BTRE','Bến Tre'),(54,'CM','Cà Mau'),(55,'ĐT','Đồng Tháp'),(56,'HG','Hậu Giang'),(57,'KG','Kiên Giang'),(58,'LA','Long An'),(59,'ST','Sóc Trăng'),(60,'TG','Tiền Giang'),(61,'TV','Trà Vinh'),(62,'VL','Vĩnh Long'),(63,'CT','Cần Thơ');
/*!40000 ALTER TABLE `province` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `role_id` bigint NOT NULL AUTO_INCREMENT,
  `code` varchar(10) NOT NULL,
  `description` varchar(600) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'AD','Quyền Quản Trị Cao Nhất','Quản Trị Hệ Thống'),(2,'US','Quyền của người dùng','Người dùng');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `route`
--

DROP TABLE IF EXISTS `route`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `route` (
  `route_id` bigint NOT NULL AUTO_INCREMENT,
  `departure_time` varchar(255) DEFAULT NULL,
  `journey_time` varchar(255) DEFAULT NULL,
  `price` double NOT NULL,
  `province_end` bigint DEFAULT NULL,
  `province_start` bigint DEFAULT NULL,
  PRIMARY KEY (`route_id`),
  KEY `FKf35sld3wxdk9m2o6ocfth9y87` (`province_end`),
  KEY `FKppwgd1o09bh957ommhjuai46k` (`province_start`),
  CONSTRAINT `FKf35sld3wxdk9m2o6ocfth9y87` FOREIGN KEY (`province_end`) REFERENCES `province` (`province_id`),
  CONSTRAINT `FKppwgd1o09bh957ommhjuai46k` FOREIGN KEY (`province_start`) REFERENCES `province` (`province_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `route`
--

LOCK TABLES `route` WRITE;
/*!40000 ALTER TABLE `route` DISABLE KEYS */;
INSERT INTO `route` VALUES (1,'7h30','12h',150000,24,31),(2,'7h30','12h',120000,44,31),(3,'7h30','12h',120000,31,24);
/*!40000 ALTER TABLE `route` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status_ticket`
--

DROP TABLE IF EXISTS `status_ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `status_ticket` (
  `status_id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status_ticket`
--

LOCK TABLES `status_ticket` WRITE;
/*!40000 ALTER TABLE `status_ticket` DISABLE KEYS */;
INSERT INTO `status_ticket` VALUES (1,'Đã sử dụng'),(2,'Đã thanh toán');
/*!40000 ALTER TABLE `status_ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status_trip`
--

DROP TABLE IF EXISTS `status_trip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `status_trip` (
  `status_id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status_trip`
--

LOCK TABLES `status_trip` WRITE;
/*!40000 ALTER TABLE `status_trip` DISABLE KEYS */;
INSERT INTO `status_trip` VALUES (1,'Đã chạy'),(2,'Đang chờ');
/*!40000 ALTER TABLE `status_trip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `ticket_id` bigint NOT NULL AUTO_INCREMENT,
  `amount_seats` int NOT NULL,
  `date` date NOT NULL,
  `price` double NOT NULL,
  `seats` varchar(255) NOT NULL,
  `ticket_code` varchar(20) NOT NULL,
  `status` bigint DEFAULT NULL,
  `trip_id` bigint NOT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`ticket_id`),
  KEY `FK9xuwjcepe2ptko10brqmk6w7k` (`status`),
  KEY `FKjp9yu1pw75obvo1aaao6os7vk` (`trip_id`),
  KEY `FKdvt57mcco3ogsosi97odw563o` (`user_id`),
  CONSTRAINT `FK9xuwjcepe2ptko10brqmk6w7k` FOREIGN KEY (`status`) REFERENCES `status_ticket` (`status_id`),
  CONSTRAINT `FKdvt57mcco3ogsosi97odw563o` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKjp9yu1pw75obvo1aaao6os7vk` FOREIGN KEY (`trip_id`) REFERENCES `trip` (`trip_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (1,1,'2021-02-02',200000,'A01','LS01A01',2,4,NULL),(2,2,'2021-02-02',400000,'A03,A04','LS01A01',2,4,NULL),(3,2,'2021-02-02',440000,'A01,A02','LS01A01A02',2,5,NULL),(4,1,'2021-02-02',170000,'A06','LS01A06',2,4,NULL);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trip`
--

DROP TABLE IF EXISTS `trip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trip` (
  `trip_id` bigint NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `car_id` bigint NOT NULL,
  `route_id` bigint NOT NULL,
  `status` bigint NOT NULL,
  PRIMARY KEY (`trip_id`),
  KEY `FKmjbnpu0uj7uodbn1f5j0kp9v6` (`car_id`),
  KEY `FKeva4adpyk6glllffnw5ypj20j` (`route_id`),
  KEY `FK6fyqaeaonuxfy24r6she8mclh` (`status`),
  CONSTRAINT `FK6fyqaeaonuxfy24r6she8mclh` FOREIGN KEY (`status`) REFERENCES `status_trip` (`status_id`),
  CONSTRAINT `FKeva4adpyk6glllffnw5ypj20j` FOREIGN KEY (`route_id`) REFERENCES `route` (`route_id`),
  CONSTRAINT `FKmjbnpu0uj7uodbn1f5j0kp9v6` FOREIGN KEY (`car_id`) REFERENCES `car` (`car_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trip`
--

LOCK TABLES `trip` WRITE;
/*!40000 ALTER TABLE `trip` DISABLE KEYS */;
INSERT INTO `trip` VALUES (1,'2021-02-02',1,1,2),(2,'2021-02-02',2,1,2),(3,'2021-02-02',3,1,2),(4,'2021-02-02',1,2,2),(5,'2021-02-02',2,2,2);
/*!40000 ALTER TABLE `trip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` bigint NOT NULL AUTO_INCREMENT,
  `create_time` date NOT NULL,
  `modify_time` date DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `role_id` bigint NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FKn82ha3ccdebhokx3a8fgdqeyy` (`role_id`),
  CONSTRAINT `FKn82ha3ccdebhokx3a8fgdqeyy` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'2021-02-02',NULL,'123456','tri72027',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-02 17:33:16
