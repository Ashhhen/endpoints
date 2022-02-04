package com.toolstore.rest;

import com.toolstore.model.Tool;
import com.toolstore.service.IToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class RestToolController {

    @Autowired
    IToolService iToolService;

    @RequestMapping(value = "/tool/{id}", method = RequestMethod.GET)
    public Tool getTool(@PathVariable int id) {
        Tool tool = iToolService.getToolById(id);
        return tool;
    }

    @RequestMapping(value = "/tool/getall", method = RequestMethod.GET)
    public List<Tool> getTools() {
        return iToolService.getAllTools();
    }

    @RequestMapping(value = "/tool/updatetool", method = RequestMethod.POST)
    public void updateTool(@RequestBody Tool tool) {
        iToolService.updateTool(tool);
    }
}


