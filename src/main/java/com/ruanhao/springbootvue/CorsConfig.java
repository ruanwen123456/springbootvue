package com.ruanhao.springbootvue;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域请求全局配置
 * @author user
 *
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") //项目地址
		.allowedHeaders("*") //头文件
		.allowedMethods("*") //方法名
		.maxAge(1800)        //最大请求次数
		.allowedOrigins("http://localhost:8000");//请求域
	}
	
}
