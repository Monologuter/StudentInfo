/*
 Navicat Premium Data Transfer

 Source Server         : docker5.7 3307@123456
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3307
 Source Schema         : student_demo

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 26/11/2020 10:14:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `power` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
BEGIN;
INSERT INTO `admin` VALUES (1, 'admin', '123456', 1);
INSERT INTO `admin` VALUES (19, '201701132801', '201701132801', 2);
INSERT INTO `admin` VALUES (33, '20170102', '20170102', 3);
INSERT INTO `admin` VALUES (34, '20170103', '20170103', 3);
INSERT INTO `admin` VALUES (35, '20170104', '20170104', 3);
INSERT INTO `admin` VALUES (37, '20170106', '20170106', 3);
INSERT INTO `admin` VALUES (43, '20170112', '20170112', 3);
INSERT INTO `admin` VALUES (44, '20170113', '20170113', 3);
INSERT INTO `admin` VALUES (45, '20170114', '20170114', 3);
INSERT INTO `admin` VALUES (46, '20170115', '20170115', 3);
INSERT INTO `admin` VALUES (47, '20170116', '20170116', 3);
INSERT INTO `admin` VALUES (48, '20170117', '20170117', 3);
INSERT INTO `admin` VALUES (49, '20170118', '20170118', 3);
INSERT INTO `admin` VALUES (50, '20170119', '20170119', 3);
INSERT INTO `admin` VALUES (51, '20170120', '20170120', 3);
INSERT INTO `admin` VALUES (52, '202001133701', '202001133701', 2);
INSERT INTO `admin` VALUES (53, '201701132803', '201701132803', 2);
COMMIT;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `class_no` varchar(20) DEFAULT NULL,
  `major_id` int(11) DEFAULT NULL,
  `class_name` varchar(20) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `join_time` varchar(20) DEFAULT NULL,
  `student_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
BEGIN;
INSERT INTO `class` VALUES (27, '2017042827', 28, '休闲体育1班', '1', '2017', 0);
INSERT INTO `class` VALUES (28, '2017011328', 13, '市场营销1班', '1', '2017', 3);
INSERT INTO `class` VALUES (29, '2017011529', 15, '人力资源管理1班', '1', '2017', 0);
INSERT INTO `class` VALUES (30, '2017011430', 14, '会计学1班', '1', '2017', 0);
INSERT INTO `class` VALUES (31, '2017011631', 16, '国际经济与贸易1班', '1', '2017', 0);
INSERT INTO `class` VALUES (32, '2017070232', 2, '信息与计算科学1班', '1', '2017', 0);
INSERT INTO `class` VALUES (33, '2017070233', 2, '信息与计算科学1班', '1', '2017', 0);
INSERT INTO `class` VALUES (34, '2020111134', 11, '哈哈哈哈', '1', '2020', 0);
INSERT INTO `class` VALUES (35, '2020050435', 4, '1班', '1', '2020', 0);
INSERT INTO `class` VALUES (36, '2020111136', 11, '2班', '1', '2020', 0);
INSERT INTO `class` VALUES (37, '2020011337', 13, '软件工程二班', '1', '2020', 1);
INSERT INTO `class` VALUES (38, '2020111138', 11, '软件工程二班', '1', '2020', 1);
INSERT INTO `class` VALUES (39, '2020050439', 4, '汉语言文化1班', '1', '2020', 0);
INSERT INTO `class` VALUES (40, '2020062940', 29, '师范英语1班', '1', '2020', 0);
INSERT INTO `class` VALUES (41, '2020011341', 13, '财务管理17级', '在学', '2020', 0);
COMMIT;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(30) DEFAULT NULL,
  `credit` int(11) DEFAULT NULL,
  `course_time` int(11) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
BEGIN;
INSERT INTO `course` VALUES (20, '数据库', 8, 36, '必修');
INSERT INTO `course` VALUES (21, '设计模式', 5, 60, '必修');
INSERT INTO `course` VALUES (22, 'java', 3, 56, '必修');
INSERT INTO `course` VALUES (23, 'mysql', 8, 40, '必修');
INSERT INTO `course` VALUES (24, 'javaEE', 10, 60, '必修');
INSERT INTO `course` VALUES (25, 'test', 9, 36, '必修');
INSERT INTO `course` VALUES (26, 'gugug', 7, 90, '必修');
COMMIT;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `depart_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
BEGIN;
INSERT INTO `department` VALUES (1, '经济与管理学院');
INSERT INTO `department` VALUES (2, '政法学院');
INSERT INTO `department` VALUES (3, '教育科学学院');
INSERT INTO `department` VALUES (4, '体育与健康学院');
INSERT INTO `department` VALUES (5, '文学院');
INSERT INTO `department` VALUES (6, '外国语学院');
INSERT INTO `department` VALUES (7, '数学与统计学院');
INSERT INTO `department` VALUES (8, '生命科学学院');
INSERT INTO `department` VALUES (9, '机械与汽车工程学院');
INSERT INTO `department` VALUES (10, '电子与电气工程学院');
INSERT INTO `department` VALUES (11, '计算机科学与软件学院');
INSERT INTO `department` VALUES (12, '环境与化学工程学院');
INSERT INTO `department` VALUES (13, '食品与制药工程学院');
INSERT INTO `department` VALUES (14, '旅游与历史文化学院');
INSERT INTO `department` VALUES (15, '音乐学院');
INSERT INTO `department` VALUES (16, '美术学院');
COMMIT;

-- ----------------------------
-- Table structure for major
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `major_name` varchar(30) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of major
-- ----------------------------
BEGIN;
INSERT INTO `major` VALUES (1, '数学与应用科学', 7);
INSERT INTO `major` VALUES (2, '信息与计算科学', 7);
INSERT INTO `major` VALUES (3, '金融与应用统计', 7);
INSERT INTO `major` VALUES (4, '汉语言文化', 5);
INSERT INTO `major` VALUES (5, '秘书学', 5);
INSERT INTO `major` VALUES (6, '书法学', 5);
INSERT INTO `major` VALUES (7, '汉语国际教育', 5);
INSERT INTO `major` VALUES (8, '语文教育', 5);
INSERT INTO `major` VALUES (9, '计算机科学与技术', 11);
INSERT INTO `major` VALUES (10, '网络工程', 11);
INSERT INTO `major` VALUES (11, '软件工程', 11);
INSERT INTO `major` VALUES (12, '物联网工程', 11);
INSERT INTO `major` VALUES (13, '市场营销', 1);
INSERT INTO `major` VALUES (14, '会计学', 1);
INSERT INTO `major` VALUES (15, '人力资源管理', 1);
INSERT INTO `major` VALUES (16, '国际经济与贸易', 1);
INSERT INTO `major` VALUES (17, '投资学和电子商务', 1);
INSERT INTO `major` VALUES (18, '法学', 2);
INSERT INTO `major` VALUES (19, '思想政治教育', 2);
INSERT INTO `major` VALUES (20, '行政管理', 2);
INSERT INTO `major` VALUES (21, '政治学与法律学', 2);
INSERT INTO `major` VALUES (22, '应用心理学', 3);
INSERT INTO `major` VALUES (23, '小学教育', 3);
INSERT INTO `major` VALUES (24, '学前教育', 3);
INSERT INTO `major` VALUES (25, '教育技术学', 3);
INSERT INTO `major` VALUES (26, '体育教育', 4);
INSERT INTO `major` VALUES (27, '社会体育指导与管理', 4);
INSERT INTO `major` VALUES (28, '休闲体育', 4);
INSERT INTO `major` VALUES (29, '师范英语', 6);
INSERT INTO `major` VALUES (30, '商务英语', 6);
INSERT INTO `major` VALUES (31, '外贸日语', 6);
INSERT INTO `major` VALUES (32, '生物科学与技术', 8);
INSERT INTO `major` VALUES (33, '园林工程', 8);
INSERT INTO `major` VALUES (34, '食品质量与安全', 8);
INSERT INTO `major` VALUES (35, '机械设计制造及其自动化', 9);
INSERT INTO `major` VALUES (36, '车辆工程', 9);
INSERT INTO `major` VALUES (37, '物理学', 10);
INSERT INTO `major` VALUES (38, '电子信息科学与技术', 10);
INSERT INTO `major` VALUES (39, '通信工程', 10);
INSERT INTO `major` VALUES (40, '电气工程及其自动化', 10);
INSERT INTO `major` VALUES (41, '化学', 12);
INSERT INTO `major` VALUES (42, '环境工程', 12);
INSERT INTO `major` VALUES (43, '制药工程', 12);
INSERT INTO `major` VALUES (44, '食品加工技术', 12);
INSERT INTO `major` VALUES (45, '精细化学品生产技术', 12);
INSERT INTO `major` VALUES (46, '制药工程', 13);
INSERT INTO `major` VALUES (47, '旅游管理', 14);
INSERT INTO `major` VALUES (48, '酒店管理', 14);
INSERT INTO `major` VALUES (49, '历史学', 14);
INSERT INTO `major` VALUES (50, '音乐学', 15);
INSERT INTO `major` VALUES (51, '音乐表演', 15);
INSERT INTO `major` VALUES (52, '舞蹈学', 15);
INSERT INTO `major` VALUES (53, '美术学', 16);
INSERT INTO `major` VALUES (54, '工艺美术', 16);
INSERT INTO `major` VALUES (55, '产品设计', 16);
INSERT INTO `major` VALUES (56, '动画设计', 16);
INSERT INTO `major` VALUES (57, '环境设计', 16);
INSERT INTO `major` VALUES (58, '视觉传达设计', 16);
COMMIT;

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL,
  `teaching_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score
-- ----------------------------
BEGIN;
INSERT INTO `score` VALUES (73, 18, 100, 1, 1);
INSERT INTO `score` VALUES (74, 19, 80, 1, 1);
INSERT INTO `score` VALUES (75, 20, 0, 2, 2);
INSERT INTO `score` VALUES (77, 19, 90, 1, 3);
INSERT INTO `score` VALUES (78, 22, 9, 1, 3);
INSERT INTO `score` VALUES (79, 18, 100, 1, 4);
INSERT INTO `score` VALUES (80, 19, 0, 2, 4);
INSERT INTO `score` VALUES (81, 22, 0, 2, 4);
COMMIT;

-- ----------------------------
-- Table structure for semester
-- ----------------------------
DROP TABLE IF EXISTS `semester`;
CREATE TABLE `semester` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of semester
-- ----------------------------
BEGIN;
INSERT INTO `semester` VALUES (1, '2017-2018-1');
INSERT INTO `semester` VALUES (2, '2017-2018-2');
INSERT INTO `semester` VALUES (3, '2018-2019-1');
INSERT INTO `semester` VALUES (4, '2018-2019-2');
INSERT INTO `semester` VALUES (5, '2019-2020-1');
INSERT INTO `semester` VALUES (6, '2019-2020-2');
COMMIT;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_no` varchar(20) DEFAULT NULL,
  `student_name` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `birthday` varchar(20) DEFAULT NULL,
  `origin` varchar(20) DEFAULT NULL,
  `cellphone` varchar(20) DEFAULT NULL,
  `idcard` varchar(30) DEFAULT NULL,
  `imageurl` varchar(50) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `politics` varchar(20) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `voucher` varchar(20) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `county` varchar(20) DEFAULT NULL,
  `detailed_address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES (18, '201701132801', '张三', '江苏省苏州市其他', '男', '11/21/2017', '江苏', '18992323647', '4412244342323141311', NULL, '在读', '群众', 28, '4412244342323141311', '江苏', '苏州', '其他', '');
INSERT INTO `student` VALUES (19, '201701132802', '李四', '江苏省南京市玄武区玄武湖', '男', '01/14/1996', '江苏', '18939827347', '441225193847563821', NULL, '在读', '中共预备党员', 28, '441225193847563821', '江苏', '南京', '玄武区', '玄武湖');
INSERT INTO `student` VALUES (20, '201701132803', '王五', '浙江省杭州市拱墅区西湖', '男', '01/14/1997', '浙江杭州', '18939827348', '441225193847563821', NULL, '在读', '中共预备党员', 38, '441225193847563821', '浙江', '杭州', '拱墅区', '西湖');
INSERT INTO `student` VALUES (21, '202001133701', '陈亚', '江苏省苏州市平江区苏州', '男', '10/08/2020', '江苏', '18582370367', '441225193847563821', NULL, '在学', '中共预备党员', 37, '441225193847563821', '江苏', '苏州', '平江区', '苏州');
INSERT INTO `student` VALUES (22, '201701132803', '陈亚111', '北京省北京市东城区', '男', '10/03/2020', '江苏', '18582370367', '321225193847563821', NULL, '在学', '中共党员', 28, '321225193847563821', '北京', '北京', '东城区', '');
COMMIT;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_no` varchar(20) DEFAULT NULL,
  `teacher_name` varchar(20) DEFAULT NULL,
  `cellphone` varchar(11) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `birthday` varchar(20) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  `education` varchar(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `idcard` varchar(30) DEFAULT NULL,
  `voucher` varchar(30) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `county` varchar(20) DEFAULT NULL,
  `detailed_address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
BEGIN;
INSERT INTO `teacher` VALUES (2, '20170102', 'teacher-1', '18237458129', '男', '02/05/1985', 1, '本科', '江苏省扬州市广陵区扬州大学', '32282519283746248392', '44282519283746248392', '江苏', '扬州', '广陵区', '扬州大学');
INSERT INTO `teacher` VALUES (3, '20170103', 'teacher-2', '18237458130', '女', '02/04/1986', 1, '博士', '江苏省常州市钟楼区常州大学', '32282519283746248392', '44282519283746248392', '江苏', '常州', '钟楼区', '常州大学');
INSERT INTO `teacher` VALUES (4, '20170104', 'teacher-3', '18237458131', '男', '02/04/1987', 9, '硕士', '江苏省扬州市广陵区扬州大学', '32282519283746248392', '44282519283746248392', '江苏', '扬州', '广陵区', '扬州大学');
INSERT INTO `teacher` VALUES (6, '20170106', 'teacher-4', '18237458133', '女', '02/04/1989', 1, '博士', '四川省成都市青羊区电子科大', '32282519283746248392', '44282519283746248392', '四川', '成都', '青羊区', '扬州大学');
INSERT INTO `teacher` VALUES (12, '20170112', 'teacher-5', '18237458139', '女', '02/04/1995', 1, '博士', '江苏省扬州市广陵区扬州大学', '32282519283746248392', '44282519283746248392', '江苏', '扬州', '广陵区', '扬州大学');
INSERT INTO `teacher` VALUES (13, '20170113', 'teacher-6', '18237458140', '女', '02/04/1996', 1, '博士', '江苏省扬州市广陵区扬州大学', '32282519283746248392', '44282519283746248392', '江苏', '扬州', '广陵区', '扬州大学');
INSERT INTO `teacher` VALUES (14, '20170114', 'teacher-7', '18237458141', '女', '02/04/1997', 1, '博士', '江苏省扬州市广陵区扬州大学', '32282519283746248392', '44282519283746248392', '江苏', '扬州', '广陵区', '扬州大学');
INSERT INTO `teacher` VALUES (15, '20170115', 'teacher-8', '18237458142', '女', '02/04/1998', 1, '博士', '江苏省扬州市广陵区扬州大学', '32282519283746248392', '44282519283746248392', '江苏', '扬州', '广陵区', '扬州大学');
INSERT INTO `teacher` VALUES (16, '20170116', 'teacher-9', '18237458143', '女', '02/04/1999', 1, '博士', '江苏省扬州市广陵区扬州大学', '32282519283746248392', '44282519283746248392', '江苏', '扬州', '广陵区', '扬州大学');
INSERT INTO `teacher` VALUES (17, '20170117', 'teacher-10', '18237458144', '女', '02/04/2000', 1, '博士', '江苏省扬州市广陵区扬州大学', '32282519283746248392', '44282519283746248392', '江苏', '扬州', '广陵区', '扬州大学');
INSERT INTO `teacher` VALUES (18, '20170118', 'teacher-11', '18237458145', '女', '02/04/2001', 1, '博士', '江苏省扬州市广陵区扬州大学', '32282519283746248392', '44282519283746248392', '江苏', '扬州', '广陵区', '扬州大学');
INSERT INTO `teacher` VALUES (19, '20170119', 'teacher-12', '18237458146', '女', '02/04/2002', 1, '博士', '江苏省扬州市广陵区扬州大学', '32282519283746248392', '44282519283746248392', '江苏', '扬州', '广陵区', '扬州大学');
INSERT INTO `teacher` VALUES (20, '20170120', 'teacher-13', '18237458147', '女', '02/04/2003', 1, '博士', '江苏省扬州市广陵区扬州大学', '32282519283746248392', '44282519283746248392', '江苏', '扬州', '广陵区', '扬州大学');
COMMIT;

-- ----------------------------
-- Table structure for teaching
-- ----------------------------
DROP TABLE IF EXISTS `teaching`;
CREATE TABLE `teaching` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_id` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `semester_id` int(11) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teaching
-- ----------------------------
BEGIN;
INSERT INTO `teaching` VALUES (1, 2, 28, 6, 20);
INSERT INTO `teaching` VALUES (2, 4, 38, 6, 21);
INSERT INTO `teaching` VALUES (3, 2, 28, 1, 25);
INSERT INTO `teaching` VALUES (4, 2, 28, 1, 20);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
