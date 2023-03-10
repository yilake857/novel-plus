## 项目介绍

精品小说屋 是一个多端阅读，功能完善的原创文学 CMS 系统。由前台门户系统、作家后台管理系统、平台后台管理系统多个子系统构成，包括小说推荐、作品检索、小说排行、小说阅读、小说评论、会员中心、作家专区等功能、支持作家管理小说、查看稿费，会员充值、新闻发布和实时统计报表等。

## 项目结构

```
novel-plus -- 父工程
├── novel-common -- 通用模块
├── novel-front -- 前台门户&作家后台
├── novel-admin -- 管理后台
└── templates -- 前端模版
```

## 技术选型

| 技术                  | 说明
|---------------------| ---------------------------
| Spring Boot         | Spring 应用快速开发脚手架
| MyBatis             | 持久层 ORM 框架
| MyBatis Dynamic SQL | Mybatis 动态 sql
| PageHelper          | MyBatis 分页插件
| MyBatis Generator    | 持久层代码生成插件
| Sharding-JDBC       | 代码层分库分表中间件
| JJWT                | JWT 登录支持
| Apache Shiro               | 安全框架
| Ehcache             | Java 进程内缓存框架(默认缓存)
| Redis               | 分布式缓存(缓存替换方案，默认关闭，一行配置开启)
| Elasticsearch       | 搜索引擎(搜索增强方案，默认关闭，一行配置开启)
| RabbitMQ            | 消息队列(流量削峰，默认关闭，一行配置开启)
| Aliyun OSS          | 阿里云对象存储服务(图片存储方式之一，一行配置即可切换)
| FastDFS             | 开源轻量级分布式文件系统(图片存储方式之一，一行配置即可切换)
| Lombok              | 简化对象封装工具
| MySQL               | 数据库服务
| Thymeleaf           | 模板引擎
| Layui               | 前端 UI 框架

## 项目截图

### 橙色主题模版截图

#### PC站截图

1. 首页

![img](https://s3.ax1x.com/2020/12/27/r5400A.png)

2. 分类索引页

![img](https://oscimg.oschina.net/oscnet/up-d0b2e03129bfae47b8bb96a491b73d383c5.png)

3. 搜索页

![img](https://s3.ax1x.com/2020/12/27/r5TO8x.png)

![img](https://oscimg.oschina.net/oscnet/up-ed5f689557718924acac76bc3ebca36afcb.png)

4. 排行榜

![img](https://oscimg.oschina.net/oscnet/up-78d5a68586cd92a86c669311f414508f922.png)

5. 详情页

![img](https://oscimg.oschina.net/oscnet/up-8be2495a2869f93626b0c9c1df6f329747a.png)

6. 阅读页

![img](https://oscimg.oschina.net/oscnet/up-517c84148d2db8e11717a8bbecc57fa1be7.png)

7. 用户中心

![img](https://oscimg.oschina.net/oscnet/up-805a30e7a663a3fd5cb39a7ea26bc132a01.png)

8. 充值

![img](https://oscimg.oschina.net/oscnet/up-5a601b0b3af3224d0bebcfe12fc15075d34.png)

![img](https://oscimg.oschina.net/oscnet/up-face25d02c07b05b2ce954cc4bf4ee6a0cc.png)

9. 作家专区

![img](https://oscimg.oschina.net/oscnet/up-30766372cc7f56480ff1d7d55198204f6ea.png)

![img](https://s3.ax1x.com/2020/11/17/DVFiQI.png)

![img](https://s1.ax1x.com/2020/11/09/B7X5oF.png)

![img](https://s1.ax1x.com/2020/11/09/B7XLsx.png)

10. 购买

![img](https://oscimg.oschina.net/oscnet/up-ce0f585efd82a9670335f118cf5897c85e9.png)

![img](https://oscimg.oschina.net/oscnet/up-f849960f4c1303fea77d26e64fc505a7180.png)

#### 手机站截图

<p align="center">

   <img src="https://s3.ax1x.com/2020/12/27/r5447n.jpg"  width="300" />
   <img src="https://s3.ax1x.com/2020/12/27/r55xKg.jpg"  width="300" />
   <img src="https://s3.ax1x.com/2020/12/28/roZWOf.jpg"  width="300" />
   <img src="https://s3.ax1x.com/2020/12/27/r55Stx.jpg"  width="300" />


#### 后台管理系统截图

![img](https://oscimg.oschina.net/oscnet/up-0552343538674a22a64819834100558f39b.png)

![img](https://s3.ax1x.com/2020/12/01/DWgLNT.png)

![img](https://s3.ax1x.com/2020/12/01/DfmRCd.png)

![img](https://oscimg.oschina.net/oscnet/up-faf5dda7320674c29a1772bc0c81d74762e.png)

### 深色主题模版截图

#### PC站截图

1. 首页

   ![index](https://static.oschina.net/uploads/img/202006/24151811_wIus.png)

#### 手机站截图

<p align="center">
      <img src="https://static.oschina.net/uploads/img/202006/24151812_OOob.jpg"  width="300" />
      <img src="https://static.oschina.net/uploads/img/202006/24151812_ZosF.png"  width="300" />
      <img src="https://static.oschina.net/uploads/img/202006/24151812_Krva.png"  width="300" />
      <img src="https://static.oschina.net/uploads/img/202006/24151813_fDgT.png"  width="300" />

</p>



