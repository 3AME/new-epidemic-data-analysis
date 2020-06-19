package net.suncaper.epidemicdataanalysis.controller;

import net.suncaper.epidemicdataanalysis.domain.covid_test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/uv")
public class covidController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("covid_test")
    @ResponseBody
    public List<Map<String, Object>> listUvCovid(){
//        String sql = "SELECT * FROM covid_test";

        //世界每日死亡数
        String sql = "select date,sum(value) value from world_data_per_country_by_date group by date";//
//        String sql = "select distinct date from world_data_per_country_by_date";
        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);

        return results;
    }
}
