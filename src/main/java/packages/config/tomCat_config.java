package packages.config;

//这个类是让Tomcat加载springMVC-config的配置

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//1.0 配置
/*
public class tomCat_config extends AbstractDispatcherServletInitializer {

    //加载springMVC容器的配置
    //springMVC是做表现层的相关处理
    @Override
    protected WebApplicationContext createServletApplicationContext() {

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(springMVC_config.class);
        return ctx;

    }

    //设置哪些请求归属springMVC处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
        //表示所有请求归springMVC处理
    }


    //加载spring容器配置
    //spring是做业务逻辑层的相关处理
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(spring_config.class);
        return ctx;
    }
}
*/

//2.0配置
public class tomCat_config extends AbstractAnnotationConfigDispatcherServletInitializer {

    //加载spring容器配置
    //spring是做业务逻辑层的相关处理
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{spring_config.class};
    }


    //加载springMVC容器的配置
    //springMVC是做表现层的相关处理
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{springMVC_config.class};
    }

    //设置哪些请求归属springMVC处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
        //表示所有请求归springMVC处理
    }
}