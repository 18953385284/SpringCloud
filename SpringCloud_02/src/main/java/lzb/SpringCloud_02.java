package lzb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * @author lzb
 * @date 2023/1/31 22:12
 */
@SpringBootApplication
public class SpringCloud_02 {
  public static void main(String[] args) {
      SpringApplication.run(SpringCloud_02.class);
  }
}
