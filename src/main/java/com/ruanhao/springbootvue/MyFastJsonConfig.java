package com.ruanhao.springbootvue;

import java.nio.charset.Charset;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Configuration
public class MyFastJsonConfig {
	/**
	 *	QuoteFieldNames	输出key时是否使用双引号,默认为true	
	 *	UseSingleQuotes	使用单引号而不是双引号,默认为false	
	 *	WriteMapNullValue	是否输出值为null的字段,默认为false	
	 *	WriteEnumUsingToString	Enum输出name()或者original,默认为false	
	 *	UseISO8601DateFormat	Date使用ISO8601格式输出，默认为false	
	 *	WriteNullListAsEmpty	List字段如果为null,输出为[],而非null	
	 *	WriteNullStringAsEmpty	字符类型字段如果为null,输出为”“,而非null	
	 *	WriteNullNumberAsZero	数值字段如果为null,输出为0,而非null	
	 *	WriteNullBooleanAsFalse	Boolean字段如果为null,输出为false,而非null	
	 *	SkipTransientField	如果是true，类中的Get方法对应的Field是transient，序列化时将会被忽略。默认为true	
	 *	SortField	按字段名称排序后输出。默认为false	
	 *	WriteTabAsSpecial	把\t做转义输出，默认为false	不推荐
	 *	PrettyFormat	结果是否格式化,默认为false	
	 *	WriteClassName	序列化时写入类型信息，默认为false。反序列化是需用到	
	 *	DisableCircularReferenceDetect	消除对同一对象循环引用的问题，默认为false	
	 *	WriteSlashAsSpecial	对斜杠’/’进行转义	
	 * @return
	 */
	@Bean
	FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setDateFormat("yyyy-MM-dd");
		fastJsonConfig.setCharset(Charset.forName("UTF-8"));
		fastJsonConfig.setSerializerFeatures(
				SerializerFeature.WriteClassName, 		//序列化时写入类型信息，默认为false。反序列化是需用到
				SerializerFeature.WriteMapNullValue,  //是否输出值为null的字段,默认为false
				SerializerFeature.PrettyFormat,		//结果是否格式化,默认为false
				SerializerFeature.WriteNullListAsEmpty,//List字段如果为null,输出为[],而非null
				SerializerFeature.WriteNullStringAsEmpty //字符类型字段如果为null,输出为"",而非null
		);
		converter.setFastJsonConfig(fastJsonConfig);
		return converter;
	}
	
	
}
