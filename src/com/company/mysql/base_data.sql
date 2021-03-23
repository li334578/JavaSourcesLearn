/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : new_test

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 23/03/2021 17:48:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `c_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `c_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `t_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('01', '语文', '02');
INSERT INTO `course` VALUES ('02', '数学', '01');
INSERT INTO `course` VALUES ('03', '英语', '03');

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`  (
  `s_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `c_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `s_score` int(3) NULL DEFAULT NULL,
  PRIMARY KEY (`s_id`, `c_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES ('01', '01', 80);
INSERT INTO `score` VALUES ('01', '02', 90);
INSERT INTO `score` VALUES ('01', '03', 99);
INSERT INTO `score` VALUES ('02', '01', 70);
INSERT INTO `score` VALUES ('02', '02', 60);
INSERT INTO `score` VALUES ('02', '03', 80);
INSERT INTO `score` VALUES ('03', '01', 80);
INSERT INTO `score` VALUES ('03', '02', 80);
INSERT INTO `score` VALUES ('03', '03', 80);
INSERT INTO `score` VALUES ('04', '01', 50);
INSERT INTO `score` VALUES ('04', '02', 30);
INSERT INTO `score` VALUES ('04', '03', 20);
INSERT INTO `score` VALUES ('05', '01', 76);
INSERT INTO `score` VALUES ('05', '02', 87);
INSERT INTO `score` VALUES ('06', '01', 31);
INSERT INTO `score` VALUES ('06', '03', 34);
INSERT INTO `score` VALUES ('07', '02', 89);
INSERT INTO `score` VALUES ('07', '03', 98);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `s_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `s_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `s_birth` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `s_sex` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`s_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('01', '赵雷', '1990-01-01', '男');
INSERT INTO `student` VALUES ('02', '钱电', '1990-12-21', '男');
INSERT INTO `student` VALUES ('03', '孙风', '1990-05-20', '男');
INSERT INTO `student` VALUES ('04', '李云', '1990-08-06', '男');
INSERT INTO `student` VALUES ('05', '周梅', '1991-12-01', '女');
INSERT INTO `student` VALUES ('06', '吴兰', '1992-03-01', '女');
INSERT INTO `student` VALUES ('07', '郑竹', '1989-07-01', '女');
INSERT INTO `student` VALUES ('08', '王菊', '1990-01-20', '女');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `t_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `t_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`t_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('01', '张三');
INSERT INTO `teacher` VALUES ('02', '李四');
INSERT INTO `teacher` VALUES ('03', '王五');

SET FOREIGN_KEY_CHECKS = 1;
