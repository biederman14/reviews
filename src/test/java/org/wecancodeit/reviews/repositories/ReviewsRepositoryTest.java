package org.wecancodeit.reviews.repositories;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import java.util.Collection;

import static org.hamcrest.Matchers.equalTo;
import org.wecancodeit.reviews.model.Review;
import static org.hamcrest.Matchers.is;
import org.wecancodeit.reviews.repositroies.ReviewRepository;

public class ReviewsRepositoryTest {

	private ReviewRepository reviewRepo = new ReviewRepository();

	@Test
	public void shouldAcceptReviews() {
		// arrange
		Review yosemite = new Review(31100L, "Yosemite",
				"http://www.trbimg.com/img-59cc4419/turbine/ct-yosemite-rock-fall-20170927", "", "", "", "");
		// Act
		int repoSizeBeforeAdding = reviewRepo.size();
		reviewRepo.add(yosemite);
		int repoSizeAfterAdding = reviewRepo.size();
		assertThat(repoSizeAfterAdding, is(equalTo(repoSizeBeforeAdding + 1)));

	}

	@Test
	public void addOneAndReturnOneReview() {
		Review yosemite = new Review(31100L, "Yosemite",
				"http://www.trbimg.com/img-59cc4419/turbine/ct-yosemite-rock-fall-20170927", "", "", "", "");
		reviewRepo.add(yosemite);
		Review result = reviewRepo.findOne(31100L);

		assertThat(result.getTitle(), is("Yosemite"));

	}

	@Test
	public void findAllShouldReturnAllReviews() {
		Review yosemite = new Review(31100L, "Yosemite",
				"http://www.trbimg.com/img-59cc4419/turbine/ct-yosemite-rock-fall-20170927", "", "", "", "");
		Review pickles = new Review(32100L, "Pickles",
				"http://www.trbimg.com/img-59cc4419/turbine/ct-yosemite-rock-fall-20170927", "", "", "", "");
		reviewRepo.add(yosemite);
		reviewRepo.add(pickles);
		Collection<Review> result = reviewRepo.findAll();

		assertThat(result, hasItems(yosemite, pickles));

	}
}
