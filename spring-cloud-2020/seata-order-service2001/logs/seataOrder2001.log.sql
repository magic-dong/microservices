2020-09-25 10:10:51,267 [http-nio-2001-exec-2] ==>  Preparing: SELECT t.id, t.user_id, t.product_id, t.count, t.money, t.`status` FROM t_order AS t 
2020-09-25 10:10:51,460 [http-nio-2001-exec-2] ==> Parameters: 
2020-09-25 10:10:51,481 [http-nio-2001-exec-2] <==      Total: 0
2020-09-25 10:11:24,135 [http-nio-2001-exec-4] ==>  Preparing: SELECT t.id, t.user_id, t.product_id, t.count, t.money, t.`status` FROM t_order AS t 
2020-09-25 10:11:24,137 [http-nio-2001-exec-4] ==> Parameters: 
2020-09-25 10:11:24,146 [http-nio-2001-exec-4] <==      Total: 1
2020-09-25 10:12:20,493 [http-nio-2001-exec-7] ==>  Preparing: SELECT t.id, t.user_id, t.product_id, t.count, t.money, t.`status` FROM t_order AS t 
2020-09-25 10:12:20,494 [http-nio-2001-exec-7] ==> Parameters: 
2020-09-25 10:12:20,498 [http-nio-2001-exec-7] <==      Total: 1
2020-09-25 10:13:38,136 [http-nio-2001-exec-10] ==>  Preparing: SELECT t.id, t.user_id, t.product_id, t.count, t.money, t.`status` FROM t_order AS t 
2020-09-25 10:13:38,137 [http-nio-2001-exec-10] ==> Parameters: 
2020-09-25 10:13:38,139 [http-nio-2001-exec-10] <==      Total: 0
2020-09-25 10:31:34,058 [http-nio-2001-exec-2] ==>  Preparing: insert into t_order (user_id,product_id,count,money,status) values (?,?,?,?,0); 
2020-09-25 10:31:34,332 [http-nio-2001-exec-2] ==> Parameters: 1(Long), 1(Long), 10(Integer), 100(BigDecimal)
2020-09-25 10:31:34,582 [http-nio-2001-exec-2] <==    Updates: 1
2020-09-25 10:40:41,781 [http-nio-2001-exec-6] ==>  Preparing: insert into t_order (user_id,product_id,count,money,status) values (?,?,?,?,0); 
2020-09-25 10:40:41,783 [http-nio-2001-exec-6] ==> Parameters: 1(Long), 1(Long), 10(Integer), 100(BigDecimal)
2020-09-25 10:40:41,872 [http-nio-2001-exec-6] <==    Updates: 1
2020-09-25 10:40:42,557 [http-nio-2001-exec-6] ==>  Preparing: update t_order set status = 1 where user_id=? and status = ?; 
2020-09-25 10:40:42,599 [http-nio-2001-exec-6] ==> Parameters: 1(Long), 0(Integer)
2020-09-25 10:40:42,656 [http-nio-2001-exec-6] <==    Updates: 1
2020-09-25 10:46:41,941 [http-nio-2001-exec-9] ==>  Preparing: insert into t_order (user_id,product_id,count,money,status) values (?,?,?,?,0); 
2020-09-25 10:46:41,943 [http-nio-2001-exec-9] ==> Parameters: 1(Long), 1(Long), 10(Integer), 100(BigDecimal)
2020-09-25 10:46:41,984 [http-nio-2001-exec-9] <==    Updates: 1
2020-09-25 10:49:37,764 [http-nio-2001-exec-4] ==>  Preparing: insert into t_order (user_id,product_id,count,money,status) values (?,?,?,?,0); 
2020-09-25 10:49:37,924 [http-nio-2001-exec-4] ==> Parameters: 1(Long), 1(Long), 10(Integer), 100(BigDecimal)
2020-09-25 10:49:38,688 [http-nio-2001-exec-4] <==    Updates: 1
2020-09-25 10:50:31,984 [http-nio-2001-exec-7] ==>  Preparing: insert into t_order (user_id,product_id,count,money,status) values (?,?,?,?,0); 
2020-09-25 10:50:31,985 [http-nio-2001-exec-7] ==> Parameters: 1(Long), 1(Long), 10(Integer), 100(BigDecimal)
2020-09-25 10:50:32,099 [http-nio-2001-exec-7] <==    Updates: 1
2020-09-25 11:26:05,556 [http-nio-2001-exec-3] ==>  Preparing: insert into t_order (user_id,product_id,count,money,status) values (?,?,?,?,0); 
2020-09-25 11:26:05,895 [http-nio-2001-exec-3] ==> Parameters: 1(Long), 1(Long), 10(Integer), 100(BigDecimal)
2020-09-25 11:26:06,269 [http-nio-2001-exec-3] <==    Updates: 1
2020-09-25 11:29:42,713 [http-nio-2001-exec-1] ==>  Preparing: insert into t_order (user_id,product_id,count,money,status) values (?,?,?,?,0); 
2020-09-25 11:29:42,916 [http-nio-2001-exec-1] ==> Parameters: 1(Long), 1(Long), 10(Integer), 100(BigDecimal)
2020-09-25 11:29:43,216 [http-nio-2001-exec-1] <==    Updates: 1
2020-09-25 11:38:34,145 [http-nio-2001-exec-1] ==>  Preparing: insert into t_order (user_id,product_id,count,money,status) values (?,?,?,?,0); 
2020-09-25 11:38:34,414 [http-nio-2001-exec-1] ==> Parameters: 1(Long), 1(Long), 10(Integer), 100(BigDecimal)
2020-09-25 11:38:34,839 [http-nio-2001-exec-1] <==    Updates: 1
2020-09-25 11:43:27,996 [http-nio-2001-exec-2] ==>  Preparing: insert into t_order (user_id,product_id,count,money,status) values (?,?,?,?,0); 
2020-09-25 11:43:27,997 [http-nio-2001-exec-2] ==> Parameters: 1(Long), 1(Long), 10(Integer), 100(BigDecimal)
2020-09-25 11:43:28,068 [http-nio-2001-exec-2] <==    Updates: 1
2020-09-25 11:49:57,716 [http-nio-2001-exec-2] ==>  Preparing: insert into t_order (user_id,product_id,count,money,status) values (?,?,?,?,0); 
2020-09-25 11:49:57,874 [http-nio-2001-exec-2] ==> Parameters: 1(Long), 1(Long), 10(Integer), 100(BigDecimal)
2020-09-25 11:49:58,277 [http-nio-2001-exec-2] <==    Updates: 1
2020-09-25 11:50:00,818 [http-nio-2001-exec-2] ==>  Preparing: update t_order set status = 1 where user_id=? and status = ?; 
2020-09-25 11:50:00,824 [http-nio-2001-exec-2] ==> Parameters: 1(Long), 0(Integer)
2020-09-25 11:50:00,968 [http-nio-2001-exec-2] <==    Updates: 1
