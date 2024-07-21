package com.projectors.chat.controller.project;

import com.projectors.chat.service.project.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectController {

    private ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/main")
    public String mainPage(Model model) {

        String userId = projectService.getCurrentUserId();
        model.addAttribute("userId", userId);

        return "/view/project/home";
    }

}
