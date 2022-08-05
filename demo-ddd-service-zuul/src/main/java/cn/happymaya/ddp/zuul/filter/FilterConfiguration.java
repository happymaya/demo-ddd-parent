/* 
 * create by 2020年2月10日 下午8:10:56
 */
package cn.happymaya.ddp.zuul.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fangang
 */
@Configuration
public class FilterConfiguration {
	@Bean
	public PreRequestLogFilter preRequestLogFilter() {
		return new PreRequestLogFilter();
	}
}
