## 环境隔离
1 namespace(命名空间) 用来做环境空间
2 每个namespace都有唯一的Id
3 不同namespace下服务不可见

  cloud:
    nacos:
      server-addr: 127.0.0.1:8848
      discovery:
        cluster-name: HN #集群名字可以自定义
        namespace: 0432b581-c1f8-4ab7-abe2-74b3f001f0b5 #namespace命名空间环境隔离