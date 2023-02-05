## Feign使用步骤
1,引入依赖
2,在启动类添加@EnableFeignClients注解
3,编写FeignClient接口

    @FeignClient("SpringCloudNaCos01")//远程调用名称
    public interface SpringCloudNaCos01Clients {
        @GetMapping("IdentitySelect/{Id}")
        Identity SelectIdentity(@PathVariable("Id") int Id);
    }

