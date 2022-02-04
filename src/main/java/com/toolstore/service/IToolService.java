package com.toolstore.service;

import com.toolstore.model.Tool;

import java.util.List;

public interface IToolService {
    List<Tool> getAllTools();
    Tool getToolById(int toolId);
    void updateTool(Tool tool);
}
