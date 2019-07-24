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
-- Table structure for table `criminalimgdesc`
--

CREATE TABLE `criminalimgdesc` (
  `sno` int(20) NOT NULL,
  `criminalid` int(20) NOT NULL,
  `eyecolor` varchar(20) NOT NULL,
  `haircolor` varchar(20) NOT NULL,
  `facedesc` varchar(20) NOT NULL,
  `other_detail` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `criminalimgdesc`
--

INSERT INTO `criminalimgdesc` (`sno`, `criminalid`, `eyecolor`, `haircolor`, `facedesc`, `other_detail`) VALUES
(103, 56, 'Black', 'Black', 'V-shape', ''),
(104, 58, 'Black', 'Black', 'U-shape', 'Face: light'),
(105, 76, 'Black', 'Brown', 'V-shape', ''),
(106, 89, 'Brown', 'Black', 'V-shape', 'Chinese'),
(107, 54, 'Brown', 'Black', 'U-shape', 'Like faty'),
(108, 82, 'Black', 'Black', 'U-shape', 'Wearing White cap'),
(109, 85, 'Black', 'Black', 'V-shape', ''),
(110, 103, 'Black', 'Shaded', 'Round', ''),
(111, 47, 'Black', 'Black', 'U-shape', ''),
(112, 90, 'Black', 'Black', 'Round', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `criminalimgdesc`
--
ALTER TABLE `criminalimgdesc`
  ADD PRIMARY KEY (`sno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `criminalimgdesc`
--
ALTER TABLE `criminalimgdesc`
  MODIFY `sno` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=113;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
