CREATE DATABASE mylab_user_db
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_general_ci
;
CREATE DATABASE mylab_order_db
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_general_ci
;

use mylab_user_db;
create table `user`
(
    id                   bigint(20) not null,
    username       varchar(32) not null comment '用户名',
    `password`     varchar(64) not null comment '密码',
    tel       varchar(50) not null comment '电话',
    create_time          datetime default current_timestamp,
    create_by_name       varchar(60),
    create_by            bigint(20),
    update_time          datetime default current_timestamp on update current_timestamp,
    update_by_name       varchar(60),
    update_by            bigint(20),
    remark               varchar(255),
    del_flag             char(1) not null default '0',
    primary key (id)
);
create unique index `idx_user_username` using btree on `user`(`username`);
create unique index `idx_user_tel` using btree on `user`(`tel`);


use mylab_order_db;
create table `order_order`
(
    id                   bigint(20) not null,
    user_id     		  bigint(20) not null comment 'useid',
    order_no    		 varchar(10) not null default '' comment '订单号',
    order_title       varchar(50) not null default '' comment '案件类型名称',
    order_amount       decimal(24,4) not null default 0 comment '订单总金额',
    goods_id      	 bigint(20) not null default '0' comment '商品id',
    goods_name       varchar(50) not null default '' comment '商品名',
    goods_quanlity       int not null default 1 comment '商品数量',
    goods_unit_price       decimal(24,4) not null default 0 comment '商品单价',
    receiver_tel       varchar(50) not null default '' comment '收货人电话',
    receiver_name       varchar(50) not null default '' comment '收货人姓名',
    receiver_addr       varchar(100) not null default '' comment '收货人地址',
    create_time          datetime default current_timestamp,
    create_by_name       varchar(60),
    create_by            bigint(20),
    update_time          datetime default current_timestamp on update current_timestamp,
    update_by_name       varchar(60),
    update_by            bigint(20),
    remark               varchar(255),
    del_flag             char(1) not null default '0',
    primary key (id)
);
create index `idx_order_order_no` using btree  on `order_order`(`order_no`);
create index `idx_order_user_id` using btree  on `order_order`(`user_id`);