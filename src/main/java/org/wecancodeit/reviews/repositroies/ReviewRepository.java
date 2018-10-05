package org.wecancodeit.reviews.repositroies;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.wecancodeit.reviews.model.Review;

public class ReviewRepository {

	private Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		add(new Review(16100L, "Red River Gorge",
				"https://upload.wikimedia.org/wikipedia/commons/6/6b/Red_River_Gorge_-_Long_Wall_-_Rock_Wars_1a.jpg",
				"Kentucky",
				"Red River Gorge is a great place for those who like juggy overhangs, whacko wacos, and driving through impossible country roads.",
				"October 5, 2014",
				"Red River Gorge is a premier climbing location in the Daniel Boone National Forest, located in Slade, Kentucky."));
	}

	private void add(Review review) {
		reviews.put(review.getId(), review);

	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

}
