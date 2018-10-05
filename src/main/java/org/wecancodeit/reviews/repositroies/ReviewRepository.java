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
		add(new Review(35100L, "New River Gorge",
				"https://www.nps.gov/common/uploads/grid_builder/ner/crop1_1/B8CEDB9C-1DD8-B71B-0B52A515CFC79854.jpg?width=640&quality=90&mode=crop",
				"West Virginia",
				"New River Gorge provides a little bit of everything for all climbing styles. Trad is available at Junk Yard Wall and Bridge Buttress, while beginners can take their first lead whippers at Butcher's Branch with the 4 star classic \"Flight of the Gumby\".",
				"November 11, 2015", "New River Gorge is a premier climbing location in Fayetteville, West Virginia."));
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
