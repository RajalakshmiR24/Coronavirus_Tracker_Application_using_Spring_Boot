package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.LocationStates;
import com.example.demo.services.CoronaVirusDataServices;
@Controller
public class HomeController {
 private final CoronaVirusDataServices crnService;
 @Autowired
 public HomeController(CoronaVirusDataServices crnService) {
 this.crnService = crnService;
 }
 @GetMapping("/")
 public String home(Model model) {
 List<LocationStates> allStates = crnService.getAllstates();
 int totalDeathsReported =
allStates.stream().mapToInt(LocationStates::getLatestTotalDeaths).sum();
 model.addAttribute("LocationStates", allStates);
 model.addAttribute("totalDeathsReported", totalDeathsReported);
 return "home";
 }
 @GetMapping("/chart")
 public String getChart(Model model) {
 List<LocationStates> allStates = crnService.getAllstates();
 List<String> countries = new ArrayList<>();
 List<Integer> deaths = new ArrayList<>();
 for (LocationStates state : allStates) {
 countries.add(state.getCountry());
 deaths.add(state.getLatestTotalDeaths());
 }
 model.addAttribute("countries", countries);
 model.addAttribute("deaths", deaths);
 return "chart";
 }
}
