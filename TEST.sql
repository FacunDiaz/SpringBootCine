-- MySQL dump 10.13  Distrib 8.0.36, for macos14 (arm64)
--
-- Host: localhost    Database: apirestcine
-- ------------------------------------------------------
-- Server version	9.2.0

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
-- Table structure for table `cine`
--

DROP TABLE IF EXISTS `cine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cine` (
  `id` int NOT NULL AUTO_INCREMENT,
  `direccion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cine`
--

LOCK TABLES `cine` WRITE;
/*!40000 ALTER TABLE `cine` DISABLE KEYS */;
INSERT INTO `cine` VALUES (1,'Recoleta 5443','Cine Recoleta'),(2,'San Martin 100','Cinepolis ');
/*!40000 ALTER TABLE `cine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `dtype` varchar(31) NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `descuento` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('Cliente',2,'facundojeojfoe@gmail.com','Facundo Diaz',NULL),('Cliente',3,'pipirulo@gmail.com','Pipirulo',NULL),('Cliente',4,'pipir4rulo@gmail.com','Pip4irulo',NULL),('Cliente',5,'pipir4rulo@gmail.com','Pipuchoo',NULL),('Cliente',6,'pipir4rulo@gmail.com','Pipuchoo',NULL),('Cliente',7,'pipir4rulo@gmail.com','Pipuchoo',NULL),('Cliente',8,'pipir4rulo@gmail.com','Pipuchoo',NULL),('Cliente',9,'pipir4rulo@gmail.com','Pipuchoo',NULL),('Cliente',10,'pipir4rulo@gmail.com','Pipuchoo',NULL),('Cliente',11,'pipir4rulo@gmail.com','Pipuchoo',NULL),('Cliente',12,'pipir4rulo@gmail.com','Pipuchoo',NULL),('Cliente',13,'pipir4rulo@gmail.com','Pipuchoo',NULL),('Cliente',14,'pipir4rulo@gmail.com','Pipuchoo',NULL),('Cliente',15,'pipir4rulo@gmail.com','Pipuchoo',NULL),('Cliente',16,'pipir4rulo@gmail.com','Pipuchoo',NULL),('Cliente',17,'manso@gmail.com','Luloeira Jairzinho',NULL),('Cliente',18,'manso@gmal.com','Luloeira Jrzinho',NULL),('Cliente',19,'manso@gmal.com','Luloeira Jrzinho',NULL),('Cliente',20,'manso@gmal.com','Luloeira Jrzinho',NULL),('Cliente',21,'pepito@gmail.com','Pepe Reinozo',NULL),('Cliente',22,'roberto@gmail.com','roberto',NULL),('Cliente',23,'pepito@gmail.com','roberto',NULL),('Cliente',24,'manso@gmal.com','Luloeira Jrzinho',NULL),('Cliente',25,'manso@gmal.com','Luloeira Jrzinho',NULL),('Cliente',26,'roberto@gmail.com','roberto',NULL),('Cliente',27,'lorezi','lucas',NULL),('Cliente',28,'ronaldo@gmail.com','Ronaldo Nazario',NULL),('Cliente',29,'ronaldo@gmail.com','Ronaldo Nazario',NULL),('Cliente',30,'pepito@gmail.com','Ronaldo Na',NULL),('Cliente',31,'ronaldo@gmail.com','Ronaldo Nazario',NULL),('Cliente',32,'pepito@gmail.com','Ronaldo Na',NULL),('Cliente',33,'pepito@gmail.com','Ronaldo Na',NULL),('Cliente',34,'robertrrro@gmail.comr','Cristiano Ronaldo',NULL),('Cliente',35,'robertrrro@gmail.comr4343','Lionel Messi',NULL);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha` datetime(6) DEFAULT NULL,
  `cine_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKa9guwhbw8xsqlqh5f1kxeltis` (`cine_id`),
  CONSTRAINT `FKa9guwhbw8xsqlqh5f1kxeltis` FOREIGN KEY (`cine_id`) REFERENCES `cine` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (1,NULL,NULL);
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dni` int NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado_cine`
--

DROP TABLE IF EXISTS `empleado_cine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado_cine` (
  `empleado_id` int NOT NULL,
  `cine_id` int NOT NULL,
  KEY `FK45djr86fa8q09d23j31s4tlj` (`cine_id`),
  KEY `FKfkolas5w1yp96ggi0ka8u2n0q` (`empleado_id`),
  CONSTRAINT `FK45djr86fa8q09d23j31s4tlj` FOREIGN KEY (`cine_id`) REFERENCES `cine` (`id`),
  CONSTRAINT `FKfkolas5w1yp96ggi0ka8u2n0q` FOREIGN KEY (`empleado_id`) REFERENCES `empleado` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado_cine`
--

LOCK TABLES `empleado_cine` WRITE;
/*!40000 ALTER TABLE `empleado_cine` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado_cine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrada`
--

DROP TABLE IF EXISTS `entrada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entrada` (
  `id` int NOT NULL AUTO_INCREMENT,
  `asiento` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrada`
--

LOCK TABLES `entrada` WRITE;
/*!40000 ALTER TABLE `entrada` DISABLE KEYS */;
INSERT INTO `entrada` VALUES (1,'5b',4000),(2,'11b',4000),(3,'30A',8000),(4,'20A',8000),(5,'15R',8000);
/*!40000 ALTER TABLE `entrada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcion`
--

DROP TABLE IF EXISTS `funcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `horario` varchar(255) DEFAULT NULL,
  `id_pelicula` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKi7tai9me0rcy9a0qcj0vei7au` (`id_pelicula`),
  CONSTRAINT `FKi7tai9me0rcy9a0qcj0vei7au` FOREIGN KEY (`id_pelicula`) REFERENCES `pelicula` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcion`
--

LOCK TABLES `funcion` WRITE;
/*!40000 ALTER TABLE `funcion` DISABLE KEYS */;
INSERT INTO `funcion` VALUES (1,'14:00',3),(2,'19:30',1),(3,'21:00',3),(4,'17:30',4),(5,'19:30',2);
/*!40000 ALTER TABLE `funcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcion_entrada`
--

DROP TABLE IF EXISTS `funcion_entrada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcion_entrada` (
  `id_funcion` int NOT NULL,
  `id_entrada` int NOT NULL,
  KEY `FK10som9rnf8f5398rnp405tsdg` (`id_entrada`),
  KEY `FKhpl1drfhxbesvnaofyw6ugsb9` (`id_funcion`),
  CONSTRAINT `FK10som9rnf8f5398rnp405tsdg` FOREIGN KEY (`id_entrada`) REFERENCES `entrada` (`id`),
  CONSTRAINT `FKhpl1drfhxbesvnaofyw6ugsb9` FOREIGN KEY (`id_funcion`) REFERENCES `funcion` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcion_entrada`
--

LOCK TABLES `funcion_entrada` WRITE;
/*!40000 ALTER TABLE `funcion_entrada` DISABLE KEYS */;
INSERT INTO `funcion_entrada` VALUES (1,3),(2,2),(3,4),(4,1),(5,5);
/*!40000 ALTER TABLE `funcion_entrada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insumo`
--

DROP TABLE IF EXISTS `insumo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `insumo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL,
  `id_compra` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdx2yw0rj0gemjb1feshbgqenr` (`id_compra`),
  CONSTRAINT `FKdx2yw0rj0gemjb1feshbgqenr` FOREIGN KEY (`id_compra`) REFERENCES `compra` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insumo`
--

LOCK TABLES `insumo` WRITE;
/*!40000 ALTER TABLE `insumo` DISABLE KEYS */;
/*!40000 ALTER TABLE `insumo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pago` (
  `id` int NOT NULL AUTO_INCREMENT,
  `monto` double NOT NULL,
  `tipo` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `pago_chk_1` CHECK ((`tipo` between 0 and 1))
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (1,34334,NULL),(2,34334,NULL),(3,34334,1),(4,4500,1),(5,4500,1),(6,4500,1),(7,4500,1),(8,4500,1),(9,4500,1),(10,4500,1),(11,4500,1),(12,4500,1),(13,4500,1),(14,4500,1),(15,450055,1),(16,450055,1),(17,450055,1),(18,450055,1),(19,450055,1),(20,450055,1),(21,450055,1),(22,450055,1),(23,450055,1),(24,450055,1),(25,450055,1),(26,450055,1),(27,450055,1),(28,45455,1),(29,45455,1),(30,45455,1),(31,45455,1),(32,45455,1),(33,45455,1),(34,45455,1),(35,45455,1),(36,45455,1),(37,0,1),(38,0,1),(39,0,1),(40,45455,1),(41,45455,0),(42,0,0),(43,0,0),(44,0,0),(45,0,0),(46,0,0),(47,0,0),(48,0,0),(49,0,0),(50,0,0),(51,0,1);
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pelicula`
--

DROP TABLE IF EXISTS `pelicula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pelicula` (
  `id` int NOT NULL AUTO_INCREMENT,
  `genero` tinyint DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `id_cine` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1j9m8iwqo3a4777qlj4bv4jp2` (`id_cine`),
  CONSTRAINT `FK1j9m8iwqo3a4777qlj4bv4jp2` FOREIGN KEY (`id_cine`) REFERENCES `cine` (`id`),
  CONSTRAINT `pelicula_chk_1` CHECK ((`genero` between 0 and 3))
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelicula`
--

LOCK TABLES `pelicula` WRITE;
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` VALUES (1,0,'Avengers Endgame',1),(2,0,'John Wick',1),(3,0,'The Batman',1),(4,3,'Inception',2);
/*!40000 ALTER TABLE `pelicula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `direccion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `id_compra` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKlnw7va21x2q4dqrwphcw6vyb2` (`id_compra`),
  CONSTRAINT `FKlnw7va21x2q4dqrwphcw6vyb2` FOREIGN KEY (`id_compra`) REFERENCES `compra` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sala`
--

DROP TABLE IF EXISTS `sala`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sala` (
  `dtype` varchar(31) NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `capacidad` int NOT NULL,
  `numero` int NOT NULL,
  `beneficios` varchar(255) DEFAULT NULL,
  `cine_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2w7p2o70hcronsfgl99sbna5f` (`cine_id`),
  CONSTRAINT `FK2w7p2o70hcronsfgl99sbna5f` FOREIGN KEY (`cine_id`) REFERENCES `cine` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala`
--

LOCK TABLES `sala` WRITE;
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
/*!40000 ALTER TABLE `sala` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sala_funcion`
--

DROP TABLE IF EXISTS `sala_funcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sala_funcion` (
  `sala_id` int NOT NULL,
  `funcion_id` int NOT NULL,
  KEY `FKombd6475c9xcrlbstmsi88gb0` (`funcion_id`),
  KEY `FKi7olf5ara3389sekc60yd3jyc` (`sala_id`),
  CONSTRAINT `FKi7olf5ara3389sekc60yd3jyc` FOREIGN KEY (`sala_id`) REFERENCES `sala` (`id`),
  CONSTRAINT `FKombd6475c9xcrlbstmsi88gb0` FOREIGN KEY (`funcion_id`) REFERENCES `funcion` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala_funcion`
--

LOCK TABLES `sala_funcion` WRITE;
/*!40000 ALTER TABLE `sala_funcion` DISABLE KEYS */;
/*!40000 ALTER TABLE `sala_funcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_venta` date DEFAULT NULL,
  `id_pago` int DEFAULT NULL,
  `cine_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKa30mkrmdcvq4bhkplcmwiyax0` (`id_pago`),
  KEY `FKr1r4db0ejqd3v8adoybqcdv5l` (`cine_id`),
  CONSTRAINT `FKa30mkrmdcvq4bhkplcmwiyax0` FOREIGN KEY (`id_pago`) REFERENCES `pago` (`id`),
  CONSTRAINT `FKr1r4db0ejqd3v8adoybqcdv5l` FOREIGN KEY (`cine_id`) REFERENCES `cine` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (5,'2025-06-12',NULL,NULL),(6,'2025-06-12',NULL,NULL),(29,'2025-06-12',27,NULL),(30,'2025-06-11',32,NULL),(31,'2025-06-11',33,NULL),(33,'2025-06-11',35,NULL),(34,'2025-06-11',36,NULL),(35,'2025-06-13',37,NULL),(36,'2025-06-13',38,NULL),(37,'2025-06-13',39,NULL),(38,'2025-06-11',40,NULL),(39,'2025-06-11',41,NULL),(40,'2025-06-13',42,NULL),(41,'2025-06-13',43,NULL),(42,'2025-06-13',44,NULL),(43,'2025-06-13',45,NULL),(44,'2025-06-13',46,NULL),(45,'2025-06-13',47,NULL),(46,'2025-06-13',48,NULL),(47,'2025-06-13',49,NULL),(48,'2025-06-13',50,NULL),(49,'2025-06-13',51,NULL);
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta_cliente`
--

DROP TABLE IF EXISTS `venta_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta_cliente` (
  `id_venta` int NOT NULL,
  `id_cliente` int NOT NULL,
  KEY `FK3c6207eugvn9o0jnvheo396vw` (`id_cliente`),
  KEY `FKbv3q95i6lpoa6g5kayc3juqeu` (`id_venta`),
  CONSTRAINT `FK3c6207eugvn9o0jnvheo396vw` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  CONSTRAINT `FKbv3q95i6lpoa6g5kayc3juqeu` FOREIGN KEY (`id_venta`) REFERENCES `venta` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta_cliente`
--

LOCK TABLES `venta_cliente` WRITE;
/*!40000 ALTER TABLE `venta_cliente` DISABLE KEYS */;
INSERT INTO `venta_cliente` VALUES (29,16),(30,17),(31,18),(33,19),(34,20),(35,21),(36,22),(37,23),(38,24),(39,25),(40,26),(41,27),(42,28),(43,29),(44,30),(45,31),(46,32),(47,33),(48,34),(49,35);
/*!40000 ALTER TABLE `venta_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta_funcion`
--

DROP TABLE IF EXISTS `venta_funcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta_funcion` (
  `id_venta` int NOT NULL,
  `id_funcion` int NOT NULL,
  KEY `FKs3uo2miwalyhpw7llsvivopdv` (`id_funcion`),
  KEY `FK1e72mujas3i91rn8ph4yrcqmj` (`id_venta`),
  CONSTRAINT `FK1e72mujas3i91rn8ph4yrcqmj` FOREIGN KEY (`id_venta`) REFERENCES `venta` (`id`),
  CONSTRAINT `FKs3uo2miwalyhpw7llsvivopdv` FOREIGN KEY (`id_funcion`) REFERENCES `funcion` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta_funcion`
--

LOCK TABLES `venta_funcion` WRITE;
/*!40000 ALTER TABLE `venta_funcion` DISABLE KEYS */;
INSERT INTO `venta_funcion` VALUES (29,3),(30,3),(31,3),(33,3),(34,3),(35,3),(36,1),(37,4),(38,3),(39,3),(40,4),(41,5),(42,5),(43,5),(44,5),(45,2),(46,2),(47,2),(48,5),(49,5);
/*!40000 ALTER TABLE `venta_funcion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-13 21:37:39
