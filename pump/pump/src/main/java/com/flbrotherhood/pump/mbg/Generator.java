package com.flbrotherhood.pump.mbg;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 根据generatorConfig.xml生产代码
 * @author ctyFL
 * @date 2020年6月17日
 */
public class Generator {
	//运行main方法生成代码
	public static void main(String[] args) throws Exception {
		//MBG执行过程中的警告信息
		List<String> warnings = new ArrayList<String>();
		//当生成的代码重复时，覆盖原代码
		boolean overwrite = true;
		
		/**读取generatorConfig.xml配置文件 
		 * 1.Class.getResourceAsStream(String path) ：
	     *	 path不以'/'开头时默认是从此类所在的包下取资源，以'/'开头则是从classpath(Src根目录)根下获取。
		 * 2.ClassLoader.getResourceAsStream()  无论要查找的资源前面是否带'/' 都会从classpath的根路径下查找。
		 */
		InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(is);
		is.close();
		
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		//创建MBG生成器
		MyBatisGenerator mbGrenerator = new MyBatisGenerator(config, callback, warnings);
		//执行生成代码
		mbGrenerator.generate(null);
		//输出警告信息到控制台
		for(String warning: warnings) {
			System.out.println(warning);
		}
	}
	
}
