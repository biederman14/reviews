package org.wecancodeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.wecancodeit.reviews.repositroies.ReviewRepository;

@Controller
public class ReviewsController {
	private ReviewRepository reviewRepo = new ReviewRepository();

	@GetMapping("/reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";

	}
}
