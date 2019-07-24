-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 17, 2018 at 12:01 AM
-- Server version: 8.0.12
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `criminalrecord`
--

-- --------------------------------------------------------

--
-- Table structure for table `criminalsplitimage`
--

CREATE TABLE `criminalsplitimage` (
  `sno` int(20) NOT NULL,
  `criminalid` int(20) NOT NULL,
  `hair` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `forehead` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `eye` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `nose` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mouth` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `chin` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `criminalsplitimage`
--

INSERT INTO `criminalsplitimage` (`sno`, `criminalid`, `hair`, `forehead`, `eye`, `nose`, `mouth`, `chin`) VALUES
(6, 1, './Images/Criminalimg/1FName/1FName_hair.png', './Images/Criminalimg/1FName/1FName_forehead.png', './Images/Criminalimg/1FName/1FName_eye.png', './Images/Criminalimg/1FName/1FName_nose.png', './Images/Criminalimg/1FName/1FName_mouth.png', './Images/Criminalimg/1FName/1FName_chin.png'),
(9, 56, './Images/Criminalimg/56Vibishana/56Vibishana_hair.png', './Images/Criminalimg/56Vibishana/56Vibishana_forehead.png', './Images/Criminalimg/56Vibishana/56Vibishana_eye.png', './Images/Criminalimg/56Vibishana/56Vibishana_nose.png', './Images/Criminalimg/56Vibishana/56Vibishana_mouth.png', './Images/Criminalimg/56Vibishana/56Vibishana_chin.png'),
(10, 58, './Images/Criminalimg/58Ashoka/58Ashoka_hair.png', './Images/Criminalimg/58Ashoka/58Ashoka_forehead.png', './Images/Criminalimg/58Ashoka/58Ashoka_eye.png', './Images/Criminalimg/58Ashoka/58Ashoka_nose.png', './Images/Criminalimg/58Ashoka/58Ashoka_mouth.png', './Images/Criminalimg/58Ashoka/58Ashoka_chin.png'),
(11, 76, './Images/Criminalimg/76Ramesh/76Ramesh_hair.png', './Images/Criminalimg/76Ramesh/76Ramesh_forehead.png', './Images/Criminalimg/76Ramesh/76Ramesh_eye.png', './Images/Criminalimg/76Ramesh/76Ramesh_nose.png', './Images/Criminalimg/76Ramesh/76Ramesh_mouth.png', './Images/Criminalimg/76Ramesh/76Ramesh_chin.png'),
(12, 89, './Images/Criminalimg/89Deven/89Deven_hair.png', './Images/Criminalimg/89Deven/89Deven_forehead.png', './Images/Criminalimg/89Deven/89Deven_eye.png', './Images/Criminalimg/89Deven/89Deven_nose.png', './Images/Criminalimg/89Deven/89Deven_mouth.png', './Images/Criminalimg/89Deven/89Deven_chin.png'),
(13, 54, './Images/Criminalimg/54Barid/54Barid_hair.png', './Images/Criminalimg/54Barid/54Barid_forehead.png', './Images/Criminalimg/54Barid/54Barid_eye.png', './Images/Criminalimg/54Barid/54Barid_nose.png', './Images/Criminalimg/54Barid/54Barid_mouth.png', './Images/Criminalimg/54Barid/54Barid_chin.png'),
(14, 82, './Images/Criminalimg/82Ashraf/82Ashraf_hair.png', './Images/Criminalimg/82Ashraf/82Ashraf_forehead.png', './Images/Criminalimg/82Ashraf/82Ashraf_eye.png', './Images/Criminalimg/82Ashraf/82Ashraf_nose.png', './Images/Criminalimg/82Ashraf/82Ashraf_mouth.png', './Images/Criminalimg/82Ashraf/82Ashraf_chin.png'),
(15, 85, './Images/Criminalimg/85Sumit/85Sumit_hair.png', './Images/Criminalimg/85Sumit/85Sumit_forehead.png', './Images/Criminalimg/85Sumit/85Sumit_eye.png', './Images/Criminalimg/85Sumit/85Sumit_nose.png', './Images/Criminalimg/85Sumit/85Sumit_mouth.png', './Images/Criminalimg/85Sumit/85Sumit_chin.png'),
(16, 103, './Images/Criminalimg/103Chandra/103Chandra_hair.png', './Images/Criminalimg/103Chandra/103Chandra_forehead.png', './Images/Criminalimg/103Chandra/103Chandra_eye.png', './Images/Criminalimg/103Chandra/103Chandra_nose.png', './Images/Criminalimg/103Chandra/103Chandra_mouth.png', './Images/Criminalimg/103Chandra/103Chandra_chin.png'),
(17, 47, './Images/Criminalimg/47Apsaras/47Apsaras_hair.png', './Images/Criminalimg/47Apsaras/47Apsaras_forehead.png', './Images/Criminalimg/47Apsaras/47Apsaras_eye.png', './Images/Criminalimg/47Apsaras/47Apsaras_nose.png', './Images/Criminalimg/47Apsaras/47Apsaras_mouth.png', './Images/Criminalimg/47Apsaras/47Apsaras_chin.png'),
(18, 90, './Images/Criminalimg/90Kartik/90Kartik_hair.png', './Images/Criminalimg/90Kartik/90Kartik_forehead.png', './Images/Criminalimg/90Kartik/90Kartik_eye.png', './Images/Criminalimg/90Kartik/90Kartik_nose.png', './Images/Criminalimg/90Kartik/90Kartik_mouth.png', './Images/Criminalimg/90Kartik/90Kartik_chin.png');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `criminalsplitimage`
--
ALTER TABLE `criminalsplitimage`
  ADD PRIMARY KEY (`sno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `criminalsplitimage`
--
ALTER TABLE `criminalsplitimage`
  MODIFY `sno` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
