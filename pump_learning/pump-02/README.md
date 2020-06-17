SpringBoot+MyBatis搭建基本骨架

1.pom.xml中引入
		<!--Mysql数据库驱动-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.15</version>
        </dependency>
		
		<!--MyBatis分页插件-->
        <!--MyBatis分页插件，简单的几行代码就能实现分页，在与SpringBoot整合时，只要整合了PagerHelper就自动整合了MyBatis-->
        <!-- PageHelper.startPage(pageNum, pageSize);
			//之后进行查询操作将自动进行分页
			List<Useraccount> userList = useraccountMapper.selectByExample(new UseraccountExample());
			//通过构造PageInfo对象获取分页信息，如当前页码，总页数，总条数
			PageInfo<Useraccount> pageInfo = new PageInfo<Useraccount>(list); -->
        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper-spring-boot-starter</artifactId>
            <version>1.2.10</version>
        </dependency>
		
		<!-- Mybatis-generator自动代码生成器 -->
        <dependency>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-core</artifactId>
            <version>1.3.7</version>
        </dependency>
		
2.generator.properties文件中定义数据库相应信息，application.yml中配置数据源、MyBatis，供generatorConfig.xml配置文件引入

3.使用Mybatis-generator自动代码生成器
	1创建generatorConfig.xml配置文件，配置数据库连接，控制生成代码规则、路径
	2创建相应路径接收保存生成的代码
	3若有自定义注释，创建自定义注释生成器类继承DefaultCommentGenerator重写相应方法，并在generatorConfig.xml中配置
	4创建生成器类Generator，执行main方法读取generatorConfig.xml配置文件生成代码（执行前保证数据库连接，存在实体）