# Demo-service-xxx系列的使用说明
这是一套简单易用、支持DDD与微服务的技术框架, 它一方面演示了整个微服务的技术架构, 同时为微服务下如何打造支持快速交付的技术中台提出了全新的思想。
该示例包含如下项目：

```bash
demo-parent             本示例所有项目的父项目, 它集成了springboot, springcloud, 并定义各项目如何maven打包
demo-service-eureka     微服务注册中心eureka
demo-service-config     微服务配置中心config
demo-service-turbine    各微服务断路器运行状况监控turbine
demo-service-zuul       服务网关zuul
demo-ddd-service-parent    各业务微服务的父项目
demo-ddd-service-support   各业务微服务底层技术框架
demo-ddd-service-customer  用户管理微服务
demo-ddd-service-product   产品管理微服务
demo-ddd-service-supplier  供应商管理微服务
demo-ddd-service-order     订单管理微服务
```
更多详细信息详见demo-ddd-service-support项目  
本示例可以从客户端访问的服务：

```bash
service-order:
curl -X POST http://localhost:9005/query/orderQry
```
