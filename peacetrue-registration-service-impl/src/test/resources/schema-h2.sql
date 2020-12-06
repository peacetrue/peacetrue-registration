DROP TABLE IF EXISTS `registration`;
CREATE TABLE `registration`
(
    id            BIGINT AUTO_INCREMENT PRIMARY KEY,
    name          VARCHAR(32)  NOT NULL COMMENT '姓名',
    age           TINYINT      NOT NULL COMMENT '年龄',
    mobile        VARCHAR(32)  NOT NULL COMMENT '手机',
    type_id       BIGINT       NOT NULL COMMENT '报名类型',
    email         VARCHAR(32)  NOT NULL COMMENT '电子邮箱',
    remark        VARCHAR(255) NOT NULL COMMENT '备注',
    creator_id    bigint       not null comment '创建者主键',
    created_time  datetime     not null comment '创建时间',
    modifier_id   bigint       not null comment '修改者主键',
    modified_time datetime     not null comment '最近修改时间'
);

COMMENT ON TABLE `registration` IS '报名申请';
COMMENT ON COLUMN `registration`.id IS '主键';

