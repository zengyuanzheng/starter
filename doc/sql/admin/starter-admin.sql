

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `uuid` varchar(255) NOT NULL COMMENT '主键',
  `name` varchar(255) NOT NULL COMMENT '权限名称',
  `code` varchar(255) NOT NULL COMMENT '权限代码',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_time` varchar(255) NOT NULL COMMENT '创建时间',
  `create_user_uuid` varchar(255) DEFAULT NULL COMMENT '创建用户',
  `update_time` varchar(255) NOT NULL COMMENT '修改时间',
  `update_user_uuid` varchar(255) DEFAULT NULL COMMENT '修改用户',
  `state` int(11) NOT NULL COMMENT '{启用:1,禁用:2}',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `uuid` varchar(255) NOT NULL COMMENT '主键',
  `name` varchar(255) NOT NULL COMMENT '角色名称',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_time` varchar(255) NOT NULL COMMENT '创建时间',
  `create_user_uuid` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_time` varchar(255) NOT NULL COMMENT '修改时间',
  `update_user_uuid` varchar(255) DEFAULT NULL COMMENT '修改人',
  `state` int(11) NOT NULL COMMENT '{启用:1,禁用:2}',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `uuid` varchar(255) NOT NULL COMMENT '主键',
  `role_uuid` varchar(255) NOT NULL COMMENT '角色主键',
  `permission_uuid` varchar(255) NOT NULL COMMENT '权限主键',
  `create_time` varchar(255) NOT NULL COMMENT '创建时间',
  `create_user_uuid` varchar(255) DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`uuid`),
  KEY `role_uuid` (`role_uuid`),
  KEY `permission_uuid` (`permission_uuid`),
  CONSTRAINT `role_permission_ibfk_1` FOREIGN KEY (`role_uuid`) REFERENCES `role` (`uuid`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `role_permission_ibfk_2` FOREIGN KEY (`permission_uuid`) REFERENCES `permission` (`uuid`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uuid` varchar(255) NOT NULL COMMENT '主键',
  `email` varchar(255) NOT NULL COMMENT '用户邮箱',
  `phone` varchar(255) DEFAULT NULL COMMENT '用户手机',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_time` varchar(255) NOT NULL COMMENT '创建时间',
  `create_user_uuid` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_time` varchar(255) NOT NULL COMMENT '修改时间',
  `update_user_uuid` varchar(255) DEFAULT NULL COMMENT '修改人',
  `state` int(11) NOT NULL COMMENT '{启用:1,禁用:2}',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `user` VALUES ('1e18b539a94145c2867f50909aa23072', '864867366@qq.com', '15258920215', '3335474112287-91-8967-119741474-12831-61', '测帐', '2017-03-28 11:31:50', null, '2017-03-28 11:31:50', null, '1');


DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `uuid` varchar(255) NOT NULL COMMENT '主键',
  `user_uuid` varchar(255) NOT NULL COMMENT '用户主键',
  `role_uuid` varchar(255) NOT NULL COMMENT '角色主键',
  `create_time` varchar(255) NOT NULL COMMENT '创建时间',
  `create_user_uuid` varchar(255) DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`uuid`),
  KEY `user_uuid` (`user_uuid`),
  KEY `role_uuid` (`role_uuid`),
  CONSTRAINT `user_role_ibfk_1` FOREIGN KEY (`user_uuid`) REFERENCES `user` (`uuid`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `user_role_ibfk_2` FOREIGN KEY (`role_uuid`) REFERENCES `role` (`uuid`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

