package packages.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan("packages")
@EnableWebMvc//让json数据能够转换为实体类
public class springMVC_config {




}
