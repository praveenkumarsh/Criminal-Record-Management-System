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
-- Table structure for table `criminaldata`
--

CREATE TABLE `criminaldata` (
  `sno` int(5) NOT NULL,
  `criminalid` int(5) NOT NULL,
  `firstname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `lastname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `middlename` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `dateofbirth` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `gender` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `age` int(5) NOT NULL,
  `criminaladdress` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `city` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `state` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `date_of_arrest` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `crimeinvolved` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `eyewitnessid` int(5) NOT NULL,
  `eyewitnessname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `eyewitnessaddress` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `complaintno` int(5) NOT NULL,
  `criminalimage` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin7;

--
-- Dumping data for table `criminaldata`
--

INSERT INTO `criminaldata` (`sno`, `criminalid`, `firstname`, `lastname`, `middlename`, `dateofbirth`, `gender`, `age`, `criminaladdress`, `city`, `state`, `date_of_arrest`, `crimeinvolved`, `eyewitnessid`, `eyewitnessname`, `eyewitnessaddress`, `complaintno`, `criminalimage`) VALUES
(17, 56, 'Vibishana', 'Singh', 'Guha', '22/7/1989', 'Male', 30, 'W/2 Vinochem Ind Est, \r\nA Goddev Road, \r\nBhayander (east)', ' Mumbai', ' Maharashtra', '15/8/2015', 'Theft', 2, 'Rahul', '730 , A, Sai Tower, Mhb Colony\r\n Mumbai', 675, './Images/Criminalimg/56Vibishana/56Vibishana.png'),
(18, 58, 'Ashoka', 'Kamat', 'Kumar', '6/9/1990', 'Male', 28, '326 a Wagle Estate , Midc, Road No , Wagle Industrial Estate', 'Mumbai', 'Maharastra', '8/7/2017', 'Murder', 7, 'Sandeep', '32', 987, './Images/Criminalimg/58Ashoka/58Ashoka.png'),
(20, 76, 'Ramesh', 'Prajapati', 'Singh', '3/2/1991', 'Male', 27, 'Shop No 3, Mohanlal Mension 1 St Floor, Underai Road, Nr Police Chowki, Malad (west)', ' Bangalore', ' Karnataka', '23/9/2010', 'Chain Snatching', 63, 'Asad', '45 , Corner Building, City Market, N R Road', 24, './Images/Criminalimg/76Ramesh/76Ramesh.png'),
(21, 89, 'Deven', 'Sankar', 'Singh', '4/7/1995', 'Male', 23, '256 , Bazar Gate Street, Perin Nariman Street, , Agiary Lane, Fort', ' Mumbai', ' Mumbai', '12/10/2016', 'Theft', 983, 'Garima', 'D No 44-jc, M T B Road, Mtb Road, Banglore', 456, './Images/Criminalimg/89Deven/89Deven.png'),
(24, 54, 'Barid', 'Swaminathan', 'Sharma', '5/5/1991', 'Male', 28, '111 -a, B Desai Rd, Opp St Stephens Church, August Kranti Marg', ' Mumbai', ' Maharashtra', '6/3/2016', 'Theft', 34, 'Yama', '12 , Moonlight Sh Cen, Ak Rd, Andheri (west) mumbai', 5, './Images/Criminalimg/54Barid/54Barid.png'),
(25, 82, 'Ashraf', 'Iqbal', 'Mohommad', '16/5/1992', 'Male', 27, '46 /, Mahalaxmi Indl Est, Gandhi Nagar, Lower Parel', 'Delhi', 'Delhi', '13/4/2016', 'Murder', 32, 'Kami', '145 , Abdul Rehman Street, Mandvi Maharastra', 89, './Images/Criminalimg/82Ashraf/82Ashraf.png'),
(26, 85, 'Sumit', 'Saini', 'Kumar', '12/7/1988', 'Male', 31, '11266 /, East Park Road, Doriwalan, Gali No , Karol Bagh', 'Delhi', 'Delhi', '24/5/2013', 'Chain Snatching', 56, 'Deepesh', '146 , A, Green Acre, New Link Rd, Movie Time Cinema Ln Kharodi, Malad (w), Kerala', 98, './Images/Criminalimg/85Sumit/85Sumit.png'),
(27, 103, 'Chandra', 'Singh', 'Handa', '4/7/1993', 'Male', 26, 'H18/11, Sriram Mansarovar, South Avenue,kamaraj Nagar, Thiruvanmiyur', 'Bhopal', 'Madhyapradesh', '5/7/2018', 'Theft', 34, 'Devender', '37 --/C//-, Road Number , Banjara Hills, Ministers Quarters', 99, './Images/Criminalimg/103Chandra/103Chandra.png'),
(28, 47, 'Apsaras', 'Shetthy', 'Kumar', '19/11/1981', 'Male', 37, '41 , Gariahat Road[s],rd Floor, Dhakuria', 'Noida', 'UttarPradesh', '11/2/2005', 'Murder', 65, 'Vignesh', 'Siddhivinayak Chambers, 1st Floor Ram Krishna Paramhans Roa, Bandra (east)', 59, './Images/Criminalimg/47Apsaras/47Apsaras.png'),
(29, 90, 'Kartik', 'Sharma', 'Kumar', '25/3/1985', 'Male', 33, 'Guide Tailors, Nr Chamunda Circle, Svp Rd, Borivli(w)', 'Noida', 'UttarPradesh', '29/8/2011', 'Murder', 91, 'Faijal', '338 , Tulsi Kripa Bldg, Pant Nagar, Ghatkopar(e)', 63, './Images/Criminalimg/90Kartik/90Kartik.png');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `criminaldata`
--
ALTER TABLE `criminaldata`
  ADD PRIMARY KEY (`sno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `criminaldata`
--
ALTER TABLE `criminaldata`
  MODIFY `sno` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
