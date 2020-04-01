package com.board.admin.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**/*.js").addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/**/*.css").addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/**/*.img").addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/**/*.scss").addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/**/*.svg").addResourceLocations("classpath:/static/");
	}
	
}