package net.suncaper.epidemicdataanalysis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/uv")
public class worldDaysController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("worldData")
    @ResponseBody
    public List<Map<String, Object>> listUvCovid(){
        //世界每日死亡数
//        String sql = "select date,sum(value) value from world_data_per_country_by_date group by date";//
        String sql = "select * from world_data_per_country_by_date order by date";
        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);

        return results;
    }
    @Configuration
    public class CorsConfig {
        @Bean
        public WebMvcConfigurer corsConfigurer() {
            return new WebMvcConfigurer() {
                @Override
                public void addCorsMappings(CorsRegistry registry) {
                    registry.addMapping("/api/**")
                            .allowedOrigins("http://localhost:63342");//允许域名访问，如果*，代表所有域名
                }
            };
        }
    }
}
