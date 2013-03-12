/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.opencolegio.controller;

import com.app.opencolegio.domain.Colegios;
import com.app.opencolegio.service.ColegioService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author fernando
 */
@Controller
public class ColegioController {
    
    @Autowired
    private ColegioService colegioService;
    
    @RequestMapping("/index.htm")
    public ModelAndView listarPosts() {
        List<Colegios> colegio = colegioService.getListColegio();
        ModelAndView m = new ModelAndView("list", "colegio", colegio);
        return m;
    }
    
    @RequestMapping("/page.htm")
    public String page(Map<String, Object> map) {
        return "page";
    }
}