package net.suncaper.epidemicdataanalysis.controller;

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
public class UsDaysController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("usData")
    @ResponseBody
    public List<Map<String, Object>> listUvCovid(){
        //美国各州每日数据
        String sql = "select * from us_data_per_state_by_date order by date";
        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("usDeath")
    @ResponseBody
    public List<Map<String, Object>> listUsDeath(){
        //美国各州每日数据
        String sql = "select * from us_death_rate_by_states";
        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("usLineChart")
    @ResponseBody
    public List<Map<String, Object>> listUsLineChart(){
        //美国各州每日数据
        String sql = "select * from us_line_chart";
        return jdbcTemplate.queryForList(sql);
    }
}
