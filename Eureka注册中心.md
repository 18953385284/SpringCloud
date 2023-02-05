## Eureka 注册中心
 Eureka有什么作用？
 答：记录和管理这些微服务(模块)
 
 Eureka架构中又有Eureka Client和Eureka Server
 EurekaServer:注册中心服务端
 1记录服务信息
 2心跳监控
 Eureka Client:客户端
 1 Provider:服务提供者
 
 注册自己的信息到EurekaServer中
 每隔30秒向EurekaServer发送一次心跳
 
 2 consumer:服务消费者
 根据服务者名称从EurekaServer拉取服务列表
 基于服务列表做负载均衡，选中一个服务者发起远程调用
 
 不管是服务者还是消费者启动时都会注册到Eureka中，消费者可以在Eureka拉取服务列表，但并不是每次都拉取拉取后有个服务列表缓存。
 服务列表缓存每隔30秒更新一次
 拿到服务列表缓存后使用负载均衡去挑取一个服务者然后进行远程调用，为了防止服务者有挂掉的服务者会每隔30秒向Eureka发送一次心跳,
 确认自己的健康状态。如果不在发送心跳Eureka就会从列表中删除。
 
 