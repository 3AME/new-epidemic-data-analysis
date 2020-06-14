package net.suncaper.ecommerceanalysis.controller;

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
public class CovidtestController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("covid_test")
    @ResponseBody
    public List<Map<String, Object>> listUvMonth() {
        String sql = "SELECT * FROM covid_test";

        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);

        return results;
    }
}
