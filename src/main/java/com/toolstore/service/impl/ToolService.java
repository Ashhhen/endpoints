package com.toolstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.toolstore.database.DB;
import com.toolstore.database.IToolDAO;
import com.toolstore.model.Tool;
import com.toolstore.service.IToolService;

import java.util.List;
import java.util.Optional;

@Service
public class ToolService implements IToolService {

    @Autowired
    IToolDAO toolDAO;

    public List<Tool> getAllTools() {
        return this.toolDAO.getTools();
    }

    @Override
    public Tool getToolById(int toolId) {
        Optional<Tool> toolOptional = toolDAO.getToolById(toolId);

        if (toolOptional.isEmpty()) {
            return null;
        }

        return toolOptional.get();
    }

    @Override
    public void updateTool(Tool tool) {
        this.toolDAO.updateTool(tool);

    }
}
