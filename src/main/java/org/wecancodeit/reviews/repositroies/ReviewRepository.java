package org.wecancodeit.reviews.repositroies;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.wecancodeit.reviews.model.Review;

public class ReviewRepository {

	private Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		add(new Review(16100L, "Red River Gorge", "/images/RedRiverGorge.jpg", "Kentucky",
				"Red River Gorge is a great place for those who like juggy overhangs, whacko wacos, and driving through impossible country roads.",
				"October 5, 2014",
				"Red River Gorge is a premier climbing location in the Daniel Boone National Forest, located in Slade, Kentucky."));
		add(new Review(35100L, "New River Gorge", "/images/NRG.jpg", "West Virginia",
				"New River Gorge provides a little bit of everything for all climbing styles. Trad is available at Junk Yard Wall and Bridge Buttress, while beginners can take their first lead whippers at Butcher's Branch with the 4 star classic \"Flight of the Gumby\".",
				"November 11, 2015", "New River Gorge is a premier climbing location in Fayetteville, West Virginia."));
		add(new Review(31100L, "Yosemite", "/images/yosemite.jpg", "California",
				"Yosemite is Mecca for modern big-wall rock climbing and full of stiff boulders that will humble anyone who didn't grow up a monkey.",
				"March 24, 2018", "Yosemite Valley is where moderate climbers become experts or die."));
	}

	public void add(Review review) {
		reviews.put(review.getId(), review);

	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(Long id) {
		return reviews.get(id);
	}

	public int size() {
		return reviews.size();
	}

}
