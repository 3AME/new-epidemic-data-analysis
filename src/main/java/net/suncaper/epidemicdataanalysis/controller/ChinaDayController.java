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
public class ChinaDayController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("chinaData")
    @ResponseBody
    public List<Map<String, Object>> listUvCovid(){
        //中国每日各省份数据
        String sql = "select * from chn_data_per_province_by_date";
        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("chinaCure")
    @ResponseBody
    public List<Map<String, Object>> listCure(){
        //中国每日各省份数据
        String sql = "select * from chn_cure_rate_per_province";
        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("chinaDeath")
    @ResponseBody
    public List<Map<String, Object>> listDeath(){
        //中国每日各省份数据
        String sql = "select * from chn_death_rate_per_province";
        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("chinaLineChart")
    @ResponseBody
    public List<Map<String, Object>> listLineChart(){
        String sql = "select * from china_line_chart";
        return jdbcTemplate.queryForList(sql);
    }
}
