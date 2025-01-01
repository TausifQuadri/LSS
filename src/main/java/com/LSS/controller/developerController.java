package com.LSS.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.LSS.models.*;
import com.LSS.Service.*;


import jakarta.servlet.http.HttpSession;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Controller
@RequestMapping("/developer")
public class developerController {
    @GetMapping("/Login")
    public String createInitialLogin() {
        // Ensure "createInitialLogin" matches the template name in /templates folder
        return "Login"; 
    }
    // Handle the login form submission (POST request)
    @PostMapping("/createInitialLogin")
    public String processInitialLogin(
            @RequestParam String developerId,
            @RequestParam String password,
            Model model) {

        // Example validation logic (replace with actual authentication logic)
        if ("admin".equals(developerId) && "password123".equals(password)) {
            // Redirect to a dashboard or success page
            return "redirect:/developer/dashboard";
        } else {
            // Return to login page with an error message
            model.addAttribute("error", "Invalid Developer ID or Password");
            return "createInitialLogin"; // Show the login page again with an error
        }
    }
}
	
	

	


