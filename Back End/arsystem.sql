
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adlogin`
--

DROP TABLE IF EXISTS `adlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adlogin` (
  `userid` varchar(10) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`userid`),
  CONSTRAINT `adlogin_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `admin` (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adlogin`
--

LOCK TABLES `adlogin` WRITE;
/*!40000 ALTER TABLE `adlogin` DISABLE KEYS */;
INSERT INTO `adlogin` VALUES ('1HK17CS102','Neha'),('1HK17CS111','Prasanjit');
/*!40000 ALTER TABLE `adlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `a_id` varchar(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `contact` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('1HK17CS102','Neha Mittal','Neha','8249404416'),('1HK17CS111','Prasanjit Singh','Prasanjit','9113123283');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `pass` AFTER INSERT ON `admin` FOR EACH ROW insert into adlogin values(new.a_id,new.password) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `aircraft`
--

DROP TABLE IF EXISTS `aircraft`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aircraft` (
  `f_no` varchar(5) NOT NULL,
  `f_name` varchar(20) DEFAULT NULL,
  `b_seat` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`f_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aircraft`
--

LOCK TABLES `aircraft` WRITE;
/*!40000 ALTER TABLE `aircraft` DISABLE KEYS */;
INSERT INTO `aircraft` VALUES ('6E-1','IndiGo',5),('6E-2','IndiGo',0),('6E-3','IndiGo',0),('6E-4','IndiGo',0),('6E-5','IndiGo',0),('AI-1','Air India',0),('G8-1','GoAir',0),('G8-2','GoAir',0),('G8-3','GoAir',0),('G8-4','GoAir',0),('G8-5','GoAir',0),('I5-1','AirAsia',0),('I5-2','AirAsia',0),('I5-3','AirAsia',0),('I5-4','AirAsia',0),('I5-5','AirAsia',0),('SG-1','Spicejet',0),('SG-2','Spicejet',0),('SG-3','Spicejet',0),('SG-4','Spicejet',0),('SG-5','Spicejet',0),('UK-1','Vistara',0),('UK-2','Vistara',0),('UK-3','Vistara',0),('UK-4','Vistara',0),('UK-5','Vistara',0);
/*!40000 ALTER TABLE `aircraft` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `area`
--

DROP TABLE IF EXISTS `area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `area` (
  `src` varchar(10) DEFAULT NULL,
  `dest` varchar(10) DEFAULT NULL,
  `flt_no` varchar(5) DEFAULT NULL,
  `fare` float DEFAULT NULL,
  `Arrival` time NOT NULL,
  `Depature` time NOT NULL,
  `wk_day` varchar(8) NOT NULL,
  KEY `flt_no` (`flt_no`),
  CONSTRAINT `area_ibfk_1` FOREIGN KEY (`flt_no`) REFERENCES `aircraft` (`f_no`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `area`
--

LOCK TABLES `area` WRITE;
/*!40000 ALTER TABLE `area` DISABLE KEYS */;
INSERT INTO `area` VALUES ('Bangalore','Patna','6E-1',2500,'08:00:00','10:00:00','Sunday'),('Patna','Bangalore','6E-1',2500,'11:00:00','13:00:00','Sunday'),('Bangalore','Delhi','6E-1',1500,'14:00:00','16:00:00','Sunday'),('Delhi','Bangalore','6E-1',3000,'18:00:00','20:00:00','Sunday'),('Chennai','Goa','6E-1',2000,'13:00:00','15:00:00','Sunday'),('Goa','Chennai','6E-1',2000,'18:00:00','20:00:00','Sunday'),('Delhi','Chennai','6E-2',3500,'06:00:00','09:00:00','Monday'),('Chennai','Delhi','6E-2',3500,'12:00:00','14:00:00','Monday'),('Ahmedabad','Guwahati','6E-4',8000,'10:00:00','14:00:00','Monday'),('Guwahati','Ahmedabad','6E-4',8000,'16:15:00','20:40:00','Monday'),('Bangalore','Chennai','G8-1',2000,'06:15:00','08:58:00','Sunday'),('Chennai','Bangalore','G8-1',2000,'09:45:00','11:50:00','Sunday'),('Bangalore','Patna','G8-1',3000,'12:15:00','14:58:00','Sunday'),('Patna','Bangalore','G8-1',2000,'18:25:00','20:45:00','Sunday'),('Patna','Delhi','G8-1',6900,'18:25:00','20:45:00','Tuesday');
/*!40000 ALTER TABLE `area` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `ostv` BEFORE INSERT ON `area` FOR EACH ROW insert into st (fno,src,dest,wk_day,arv,dep) values(new.flt_no,new.src,new.dest,new.wk_day,new.Arrival,new.Depature) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `nstv` BEFORE INSERT ON `area` FOR EACH ROW insert into st (fno,src,dest,wk_day,arv,dep) values(new.flt_no,new.src,new.dest,new.wk_day,new.Arrival,new.Depature) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking` (
  `pnr` int(11) NOT NULL AUTO_INCREMENT,
  `seat_no` int(11) DEFAULT NULL,
  `f_no` varchar(5) DEFAULT NULL,
  `ps_id` varchar(5) DEFAULT NULL,
  `u_id` int(11) DEFAULT NULL,
  `f_comp` varchar(10) DEFAULT NULL,
  `p_name` varchar(20) DEFAULT NULL,
  `source` varchar(10) DEFAULT NULL,
  `Destination` varchar(10) DEFAULT NULL,
  `Durationt` varchar(3) DEFAULT NULL,
  `arrival` time DEFAULT NULL,
  `departure` time DEFAULT NULL,
  PRIMARY KEY (`pnr`),
  KEY `u_id` (`u_id`),
  KEY `ps_id` (`ps_id`),
  KEY `f_no` (`f_no`),
  CONSTRAINT `booking_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`) ON DELETE CASCADE,
  CONSTRAINT `booking_ibfk_2` FOREIGN KEY (`ps_id`) REFERENCES `passenger` (`ps_id`) ON DELETE CASCADE,
  CONSTRAINT `booking_ibfk_3` FOREIGN KEY (`f_no`) REFERENCES `aircraft` (`f_no`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (1,1,'6E-1','12',1,'IndiGo','Arpit','Bangalore','Delhi','2h','14:00:00','16:00:00'),(5,2,'6E-1','74',7,'IndiGo','rohit','Bangalore','Delhi','2h','14:00:00','16:00:00'),(6,3,'6E-1','74',7,'IndiGo','mohit','Bangalore','Delhi','2h','14:00:00','16:00:00'),(7,5,'6E-1','81',8,'IndiGo','yhf','Bangalore','Delhi','2h','14:00:00','16:00:00');
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passenger`
--

DROP TABLE IF EXISTS `passenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passenger` (
  `ps_id` varchar(5) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `nationality` varchar(20) DEFAULT NULL,
  `contact` varchar(12) DEFAULT NULL,
  `u_id` int(11) DEFAULT NULL,
  `i_prf` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ps_id`),
  UNIQUE KEY `i_prf` (`i_prf`),
  UNIQUE KEY `contact` (`contact`),
  KEY `u_id` (`u_id`),
  CONSTRAINT `passenger_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passenger`
--

LOCK TABLES `passenger` WRITE;
/*!40000 ALTER TABLE `passenger` DISABLE KEYS */;
INSERT INTO `passenger` VALUES ('11','Rahul','Delhi',18,'INDIA','9876543211',1,'123456789'),('12','Arpit','Punjab',20,'INDIA','9988776655',1,'123456788'),('21','harsh kumar','patna',23,'INDIA','8204367166',2,'123987'),('22','pritam','kolkata',22,'INDIA','8271565419',2,'123546'),('31','kunal','GAYA',20,'INDIA','9155012043',3,'915512'),('41','sum',' Bangalore',20,'INDIA','856432',4,'s123'),('51','krishmal','Nepal',2,'INDIA','9380756516',5,'krish'),('71','rohit','hwyegjhdsbchbeg',21,'INDIA','879787978',7,'7265467532674'),('72','mohit','fghjsyaudika',21,'INDIA','88773342',7,'11009988'),('73','Shobit','sdhfjkskdf',19,'INDIA','663341890',7,'11667722'),('74','pritam','shimoga',1,'INDIA','7687687',7,'87585'),('81','yhf','gfn',1,'INDIA','64y',8,'45555');
/*!40000 ALTER TABLE `passenger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seat`
--

DROP TABLE IF EXISTS `seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seat` (
  `p_id` varchar(5) DEFAULT NULL,
  `seat_no` int(11) NOT NULL,
  `f_no` varchar(5) DEFAULT NULL,
  UNIQUE KEY `p_id` (`p_id`),
  KEY `f_no` (`f_no`),
  CONSTRAINT `seat_ibfk_1` FOREIGN KEY (`f_no`) REFERENCES `aircraft` (`f_no`) ON DELETE CASCADE,
  CONSTRAINT `seat_ibfk_2` FOREIGN KEY (`p_id`) REFERENCES `passenger` (`ps_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat`
--

LOCK TABLES `seat` WRITE;
/*!40000 ALTER TABLE `seat` DISABLE KEYS */;
/*!40000 ALTER TABLE `seat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st`
--

DROP TABLE IF EXISTS `st`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st` (
  `fno` varchar(5) NOT NULL,
  `src` varchar(10) NOT NULL,
  `dest` varchar(10) NOT NULL,
  `wk_day` varchar(8) NOT NULL,
  `day` date DEFAULT NULL,
  `seat_no` int(11) DEFAULT '0',
  `arv` time DEFAULT NULL,
  `dep` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st`
--

LOCK TABLES `st` WRITE;
/*!40000 ALTER TABLE `st` DISABLE KEYS */;
INSERT INTO `st` VALUES ('6E-1 ',' Bangalore',' Patna ',' Sunday ',NULL,0,'08:00:00','10:00:00'),('6E-1 ',' Patna ',' Bangalore',' Sunday ',NULL,0,'11:00:00','13:00:00'),('6E-1 ',' Bangalore',' Delhi ',' Sunday ',NULL,0,'14:00:00','16:00:00'),('6E-1 ',' Delhi ',' Bangalore',' Sunday ',NULL,0,'18:00:00','20:00:00'),('6E-1 ',' Chennai ',' Goa ',' Sunday ',NULL,0,'13:00:00','15:00:00'),('6E-1 ',' Goa',' Chennai ',' Sunday ',NULL,0,'18:00:00','20:00:00'),('6E-2 ',' Delhi',' Chennai',' Monday ',NULL,0,'06:00:00','09:00:00'),('6E-2 ',' Chennai',' Delhi',' Monday ',NULL,0,'12:00:00','14:00:00'),('6E-4 ',' Ahmedabad',' Guwahati ',' Monday ',NULL,0,'10:00:00','14:00:00'),('6E-4 ',' Guwahati',' Ahmedabad',' Monday ',NULL,0,'16:15:00','20:40:00'),('G8-1 ',' Bangalore',' Chennai ',' Sunday ',NULL,0,'06:15:00','08:58:00'),('G8-1 ',' Chennai',' Bangalore',' Sunday ',NULL,0,'09:45:00','11:50:00'),('G8-1 ',' Bangalore',' Patna ',' Sunday ',NULL,0,'12:15:00','14:58:00'),('G8-1 ',' Patna',' Bangalore',' Sunday ',NULL,0,'18:25:00','20:45:00');
/*!40000 ALTER TABLE `st` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `f_name` varchar(30) DEFAULT NULL,
  `l_name` varchar(30) DEFAULT NULL,
  `e_mail` varchar(100) NOT NULL,
  `password` varchar(32) DEFAULT NULL,
  `gender` varchar(8) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `p_num` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `e_mail` (`e_mail`,`p_num`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'abc','xyz','abc@xyz','asdf','Male','1998-11-06','1234567890'),(2,'harsh','kumar','1hk17cs050@hkbk.edu.in','qwerty123','Male','1996-11-08','8204367166'),(3,'kunal','raj','KUNALKESHRI9155@GMAIL.COM','kkrr','Male','1999-06-03','9155012043'),(4,'sum','syed','ssun@123','sss','Male','2006-11-21','95355'),(5,'krishmal','shrestha','sabin.xtha','krish','Male','2019-06-02','9380756516'),(6,'Chitransh ','Lowanshi','hkbk@edu.in','12345678','Male','2000-02-25','9131006778'),(7,'Rohit','Bhaskar','rokkrohit2@gmail.com','rohit','Male','1998-11-29','9992990402'),(8,'chuu','tiya','123','123','Male','2019-11-15','123');
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

-- Dump completed on 2019-12-17 21:49:09
