# lyadmin_jfinal

## 项目介绍

lyadmin_jfinal是零云官方推出的java版本，lyadmin全称零云lyadmin是一套轻量级通用后台，采用ThinkPHP+Bootstrap3制作，内置系统设置、上传管理、权限管理、模块管理、插件管理等功能，独有的Builder页面自动生成技术节省50%开发成本，先进的模块化开发的支持让开发成本一降再降，致力于为个人和中小型企业打造全方位的PHP企业级开发解决方案。另外提供整套企业开发解决方案，集PC、手机、微信、App、小程序五端于一体，更有用户中心模块、门户模块、钱包支付中心模块、商城模块、OAuth2统一登陆、内部Git模块、Docker模块可供选择。


## 官网：

http://lyadmin.lingyun.net

## 后台截图

![lyadmin](http://of7audkb0.bkt.clouddn.com/lyadmin.png)

## 优秀特性

### Builder页面自动生成

长久以来，以织梦CMS、帝国CMS为代表的一系列老牌CMS在模板标签的使用上可以说是炉火纯青，模板标签的出现让前端开发页面变得十分轻松，然而后端开发人员却一直没有优秀的开发模式帮助后端人员从前端页面中解脱出来，而Builder的出现就是为了解决这个问题。

从测试版本发布以来，我们一直在探索如何封装后台的页面生成以解放后端开发人员的生产力。

在传统的MVC分层设计中，开发者需要写MVC三层逻辑代码，而在ThinkPHP的开发中，M层实际上是可以不写的。不写的原因是ThinkPHP分封装了数据层，ORM模式简化了数据库操作，没有数据模型也很方便。

那么剩下的C层和V层中，我们通过研究发现在后台开发时，V层是一项非常费时费力却又包含重复劳动的开发，

再后来，CoreThink在1.0正式版本中终于推出自己Builder，并且用Builder重写了后台的全部页面（除了个别特殊页面）。我们认为程序的后台在早期对页面复杂度的要求停留在两个核心关键：表单＋列表。所以我们抽象出了对应的Builder分别为FormBuilder、Listbuilder。

简单来讲FormBuilder用来帮助后端开发自动生成表单页面，比如发布文章、编辑文章；而Listbuilder则用来帮助后端人员自动生成列表页面，比如用户列表、文章列表。可以说，Builder的出现必将WEB开发带入一个新的世纪。

### 积木式模块化

系统功能采用模块化、组件化、插件化等开放化低耦合设计，应用商城拥有丰富的功能模块、插件、主题，便于用户灵活扩展和二次开发。


### 多终端多平台支持
采用element-ui，融合了更多适合国人使用的前端组建。


## 目录结构
```
│
├─src java源码目录
├─WebRoot jar包及web相关
│  └─WEB-INF 
│     ├─lib 第三方依赖jar包
│     ├─classes java代码编译后的文件存放目录
│     └─web.xml web相关配置
└─.classpath 依赖包位置描述文件
```

##问题反馈

在使用中有任何问题，欢迎反馈给我们，可以用以下联系方式跟我们交流

* 邮件: admin@lingyun.net
* QQ群: 252262604

##感激

感谢以下的项目,排名不分先后

* [JFinal](http://www.jfinal.com)
* [Vue](https://cn.vuejs.org)
* [element](http://element.eleme.io)

##关于我们

南京科斯克网络科技有限公司
