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
public class AnalysisController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("bigData")
    @ResponseBody
    public List<Map<String, Object>> listData(){
        //中国每日各省份数据
        String sql = "select * from bigData";
        return jdbcTemplate.queryForList(sql);
    }
}
