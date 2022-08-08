package ai.overmind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ai.overmind.model.dto.Movie;
import ai.overmind.service.MovieService;


@Controller
public class MovieController {
	
	
	
	@Autowired
	MovieService movieService;
	
	@RequestMapping
	public ModelAndView listAll(){
		List<Movie> movieList = movieService.listMovies("chart/bottom", "en");
		ModelAndView modelAndView = new  ModelAndView("lista");
		modelAndView.addObject("lista",movieList);
		return modelAndView;
	}
	
}
