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
  `car_id` int NOT NULL AUTO_INCREMENT,
  `amount` int NOT NULL,
  `code` varchar(10) NOT NULL,
  `license_plates` varchar(45) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`car_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (7,9,'LS01','75B-000545','Limousine',50000),(8,12,'LS04','75B-001624','Limousine',50000),(9,9,'LS02','75B-000425','Limousine',50000),(10,9,'LS02','75B-000425','Limousine',50000),(11,12,'LS03','75B-001224','Limousine',50000),(12,12,'LS04','75B-001624','Limousine',50000),(13,32,'GN01','43B-000424','Hyundai 425PS',150000),(14,32,'GN02','38B-000124','Hyundai 425PS',150000),(15,9,'LS02','75B-000425','Limousine',50000);
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `info`
--

DROP TABLE IF EXISTS `info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `info` (
  `info_id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `fullname` varchar(255) NOT NULL,
  `identification_number` varchar(12) DEFAULT NULL,
  `phone` varchar(10) NOT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`info_id`),
  KEY `FKlwgnpuilbh37r12bu32bgfbow` (`user_id`),
  CONSTRAINT `FKlwgnpuilbh37r12bu32bgfbow` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `info`
--

LOCK TABLES `info` WRITE;
/*!40000 ALTER TABLE `info` DISABLE KEYS */;
/*!40000 ALTER TABLE `info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `province`
--

DROP TABLE IF EXISTS `province`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `province` (
  `province_id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(10) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`province_id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `province`
--

LOCK TABLES `province` WRITE;
/*!40000 ALTER TABLE `province` DISABLE KEYS */;
INSERT INTO `province` VALUES (64,'BG','Bắc Giang'),(65,'BK','Bắc Kạn'),(66,'CB','Cao Bằng'),(67,'HG','Hà Giang'),(68,'LS','Lạng Sơn'),(69,'PT','Phú Thọ'),(70,'QN','Quảng Ninh'),(71,'TN','Thái Nguyên'),(72,'TQ','Tuyên Quang'),(73,'LC','Lào Cai'),(74,'YB','Yên Bái'),(75,'DB','Điện Biên'),(76,'HB','Hòa Bình'),(77,'LC','Lai Châu'),(78,'SL','Sơn La'),(79,'BN','Bắc Ninh'),(80,'HNA','Hà Nam'),(81,'HD','Hải Dương'),(82,'HY','Hưng Yên'),(83,'ND','Nam Định'),(84,'NB','Ninh Bình'),(85,'TB','Thái Bình'),(86,'VP','Vĩnh Phúc'),(87,'HN','Hà Nội'),(88,'HP','Hải Phòng'),(89,'HT','Hà Tĩnh'),(90,'NA','Nghệ An'),(91,'QB','Quảng Bình'),(92,'QT','Quảng Trị'),(93,'TH','Thanh Hóa'),(94,'TTH','Thừa Thiên–Huế'),(95,'DL','Đắk Lắk'),(96,'DN','Đắk Nông'),(97,'GL','Gia Lai'),(98,'KT','Kon Tum'),(99,'LD','Lâm Đồng'),(100,'BD','Bình Định'),(101,'BT','Bình Thuận'),(102,'KH','Khánh Hòa'),(103,'NT','Ninh Thuận'),(104,'PY','Phú Yên'),(105,'QNA','Quảng Nam'),(106,'QNG','Quảng Ngãi'),(107,'ĐN','Đà Nẵng'),(108,'BRVT','Bà Rịa–Vũng Tàu'),(109,'BD','Bình Dương'),(110,'BP','Bình Phước'),(111,'DNAI','Đồng Nai'),(112,'TN','Tây Ninh'),(113,'HCM','Hồ Chí Minh'),(114,'AG','An Giang'),(115,'BL','Bạc Liêu'),(116,'BTRE','Bến Tre'),(117,'CM','Cà Mau'),(118,'ĐT','Đồng Tháp'),(119,'HG','Hậu Giang'),(120,'KG','Kiên Giang'),(121,'LA','Long An'),(122,'ST','Sóc Trăng'),(123,'TG','Tiền Giang'),(124,'TV','Trà Vinh'),(125,'VL','Vĩnh Long'),(126,'CT','Cần Thơ');
/*!40000 ALTER TABLE `province` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `role_id` int NOT NULL AUTO_INCREMENT,
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
  `route_id` int NOT NULL AUTO_INCREMENT,
  `departure_time` varchar(255) DEFAULT NULL,
  `journey_time` varchar(255) DEFAULT NULL,
  `price` double NOT NULL,
  `province_end` int DEFAULT NULL,
  `province_start` int DEFAULT NULL,
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
INSERT INTO `route` VALUES (2,'7h30','12h',150000,122,121),(3,'8h30','12h',150001,90,121);
/*!40000 ALTER TABLE `route` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status_ticket`
--

DROP TABLE IF EXISTS `status_ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `status_ticket` (
  `status_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status_ticket`
--

LOCK TABLES `status_ticket` WRITE;
/*!40000 ALTER TABLE `status_ticket` DISABLE KEYS */;
INSERT INTO `status_ticket` VALUES (1,'Use'),(2,'Paid'),(3,'Cancellation-Refund');
/*!40000 ALTER TABLE `status_ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status_trip`
--

DROP TABLE IF EXISTS `status_trip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `status_trip` (
  `status_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status_trip`
--

LOCK TABLES `status_trip` WRITE;
/*!40000 ALTER TABLE `status_trip` DISABLE KEYS */;
INSERT INTO `status_trip` VALUES (1,'Running'),(2,'Waitting');
/*!40000 ALTER TABLE `status_trip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `ticket_id` int NOT NULL AUTO_INCREMENT,
  `amount_seats` int NOT NULL,
  `date` date NOT NULL,
  `price` double NOT NULL,
  `seats` varchar(3) NOT NULL,
  `ticket_code` varchar(10) NOT NULL,
  `status` int DEFAULT NULL,
  `trip_id` int NOT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`ticket_id`),
  KEY `FK9xuwjcepe2ptko10brqmk6w7k` (`status`),
  KEY `FKjp9yu1pw75obvo1aaao6os7vk` (`trip_id`),
  KEY `FKdvt57mcco3ogsosi97odw563o` (`user_id`),
  CONSTRAINT `FK9xuwjcepe2ptko10brqmk6w7k` FOREIGN KEY (`status`) REFERENCES `status_ticket` (`status_id`),
  CONSTRAINT `FKdvt57mcco3ogsosi97odw563o` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKjp9yu1pw75obvo1aaao6os7vk` FOREIGN KEY (`trip_id`) REFERENCES `trip` (`trip_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (1,2,'2021-01-21',300000,'A1','LS01A1',2,3,NULL),(2,2,'2021-01-21',300000,'A1','LS01A1',2,3,1);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trip`
--

DROP TABLE IF EXISTS `trip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trip` (
  `trip_id` int NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `car_id` int NOT NULL,
  `route_id` int NOT NULL,
  `status` int NOT NULL,
  PRIMARY KEY (`trip_id`),
  KEY `FKmjbnpu0uj7uodbn1f5j0kp9v6` (`car_id`),
  KEY `FKeva4adpyk6glllffnw5ypj20j` (`route_id`),
  KEY `FK6fyqaeaonuxfy24r6she8mclh` (`status`),
  CONSTRAINT `FK6fyqaeaonuxfy24r6she8mclh` FOREIGN KEY (`status`) REFERENCES `status_trip` (`status_id`),
  CONSTRAINT `FKeva4adpyk6glllffnw5ypj20j` FOREIGN KEY (`route_id`) REFERENCES `route` (`route_id`),
  CONSTRAINT `FKmjbnpu0uj7uodbn1f5j0kp9v6` FOREIGN KEY (`car_id`) REFERENCES `car` (`car_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trip`
--

LOCK TABLES `trip` WRITE;
/*!40000 ALTER TABLE `trip` DISABLE KEYS */;
INSERT INTO `trip` VALUES (3,'1970-01-01',7,2,1),(4,'1970-01-01',8,2,1),(5,'1970-01-01',9,2,1),(6,'1970-01-01',11,2,1),(7,'1970-01-01',12,2,1),(8,'1970-01-01',14,2,1),(9,'2021-01-21',12,2,1);
/*!40000 ALTER TABLE `trip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `create_time` date NOT NULL,
  `modify_time` date NOT NULL,
  `password` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `role_id` int NOT NULL,
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
INSERT INTO `user` VALUES (1,'2020-01-21','2020-01-21','123456','Admin',1);
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

-- Dump completed on 2021-01-27 16:50:58
