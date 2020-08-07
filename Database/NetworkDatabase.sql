/*
SQLyog Community v8.71 
MySQL - 5.5.30 : Database - vtjns08_2018
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`vtjns08_2018` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `vtjns08_2018`;

/*Table structure for table `attack` */

DROP TABLE IF EXISTS `attack`;

CREATE TABLE `attack` (
  `FId` varchar(250) DEFAULT NULL,
  `Owner` varchar(250) DEFAULT NULL,
  `UserId` varchar(250) DEFAULT NULL,
  `Ip` varchar(250) DEFAULT NULL,
  `Date1` varchar(250) DEFAULT NULL,
  `fcount` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `attack` */

/*Table structure for table `data` */

DROP TABLE IF EXISTS `data`;

CREATE TABLE `data` (
  `fid` varchar(255) DEFAULT NULL,
  `uid` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `part1` longblob,
  `part2` longblob,
  `part3` longblob,
  `part4` longblob,
  `type` varchar(255) DEFAULT NULL,
  `fdes` varchar(255) DEFAULT NULL,
  `f1key` varchar(255) DEFAULT NULL,
  `f2key` varchar(255) DEFAULT NULL,
  `f3key` varchar(255) DEFAULT NULL,
  `f4key` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `data` */

/*Table structure for table `data1` */

DROP TABLE IF EXISTS `data1`;

CREATE TABLE `data1` (
  `fid` varchar(255) DEFAULT NULL,
  `uid` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `Part` longblob,
  `type` varchar(255) DEFAULT NULL,
  `fdes` varchar(255) DEFAULT NULL,
  `f1key` varchar(255) DEFAULT NULL,
  `f2key` varchar(255) DEFAULT NULL,
  `f3key` varchar(255) DEFAULT NULL,
  `f4key` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `data1` */

/*Table structure for table `fcount` */

DROP TABLE IF EXISTS `fcount`;

CREATE TABLE `fcount` (
  `Fid` varchar(250) DEFAULT NULL,
  `Uid` varchar(250) DEFAULT NULL,
  `FCount` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fcount` */

/*Table structure for table `keyrequest` */

DROP TABLE IF EXISTS `keyrequest`;

CREATE TABLE `keyrequest` (
  `Fid` varchar(250) DEFAULT NULL,
  `Owner` varchar(250) DEFAULT NULL,
  `UserId` varchar(250) DEFAULT NULL,
  `Status1` varchar(250) DEFAULT NULL,
  `Date1` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `keyrequest` */

/*Table structure for table `owner` */

DROP TABLE IF EXISTS `owner`;

CREATE TABLE `owner` (
  `Name` varchar(250) DEFAULT NULL,
  `Email` varchar(250) NOT NULL,
  `Password` varchar(250) DEFAULT NULL,
  `Mobile` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `owner` */

/*Table structure for table `ukeys` */

DROP TABLE IF EXISTS `ukeys`;

CREATE TABLE `ukeys` (
  `Fid` varchar(250) DEFAULT NULL,
  `UserId` varchar(250) DEFAULT NULL,
  `Key1` varchar(250) DEFAULT NULL,
  `Key2` varchar(250) DEFAULT NULL,
  `Key3` varchar(250) DEFAULT NULL,
  `Key4` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ukeys` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `Name` varchar(250) DEFAULT NULL,
  `Email` varchar(250) NOT NULL,
  `Password` varchar(250) DEFAULT NULL,
  `Mobile` varchar(250) DEFAULT NULL,
  `Status1` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
