spring+mybatis整合方法二

导包：spring的包，mybatis的包，插件包：mybatis-spring-1.3.0.jar，数据库包，c3p0包
配置db.properties,log4j.properties配置文件
配置mapper文件（不写dao层的实现类，将mapper写到dao层下，名字与dao接口相同）
配置MyBatis-config.xml,applicationContext.xml文件，将大部分mybatis配置写到applicationContext.xml中

需要在applicationContext.xml中配置“自动扫描dao下的mapper文件”，然后把MyBatis-config.xml中原来model的映射删除