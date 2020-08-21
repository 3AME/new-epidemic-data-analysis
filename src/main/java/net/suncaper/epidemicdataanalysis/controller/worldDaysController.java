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
public class WorldDaysController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("worldData")
    @ResponseBody
    public List<Map<String, Object>> listUvCovid(){
        //世界每日死亡数
        String sql = "select * from world_data_per_country_by_date order by date";
        
        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("worldLineChart")
    @ResponseBody
    public List<Map<String, Object>> listLineChart(){
        //世界每日死亡数
        String sql = "select * from world_line_chart";

        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("worldCure")
    @ResponseBody
    public List<Map<String, Object>> listWorldCure(){
        //世界每日死亡数
        String sql = "select * from world_top_10_cure_rate";

        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("worldDeath")
    @ResponseBody
    public List<Map<String, Object>> listWorldDeath(){
        //世界每日死亡数
        String sql = "select * from world_top_10_death_rate";

        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("worldForecast")
    @ResponseBody
    public List<Map<String, Object>> listWorldForecast(){
        //世界每日死亡数
        String sql = "select * from world_forecast";

        return jdbcTemplate.queryForList(sql);
    }

}
