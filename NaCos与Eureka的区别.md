##NaCos和Eureka的区别
1，都支持服务注册和服务拉取
2，都支持服务提供者心跳方式做健康检测

NaCos和Eureka的区别
1 NaCos支持服务端主动检测提供者状态，临时实例采用心跳模式，非临时实例采用主动检测方式
2 临时实例心跳不正常会被剔除，非临时实例不会被剔除，健康状态会显示false
3 NaCos支持服务列表变更的消息推送模式，服务列表更新更及时
4 NaCos集群默认采用AP方式，当集群中存在非临时实例时，采用CP模式；Eureka采用AP方式