package org.wecancodeit.reviews.model;

public class Review {

	private Long id;
	private String title;
	private String imageURL;
	private String category;
	private String content;
	private String date;
	private String description;

	public Review(Long id, String title, String imageURL, String category, String content, String date,
			String description) {
		super();
		this.id = id;
		this.title = title;
		this.imageURL = imageURL;
		this.category = category;
		this.content = content;
		this.date = date;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getImage() {
		return imageURL;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

}