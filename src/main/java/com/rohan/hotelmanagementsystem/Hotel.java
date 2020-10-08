package com.rohan.hotelmanagementsystem;

public class Hotel {
	private String name;
	private int regularWeekdayRate, regularWeekendRate; //, rewardWeekdayRate, rewardweekendRate;
	//private int rating;
	
	public Hotel(String name, int regularWeekdayRate, int regularWeekendRate) {
		this.name = name;
//		this.rating = rating;
		this.regularWeekdayRate = regularWeekdayRate;
		this.regularWeekendRate = regularWeekendRate;
//		this.rewardWeekdayRate = rewardWeekdayRate;
//		this.rewardweekendRate = rewardweekendRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegularWeekdayRate() {
		return regularWeekdayRate;
	}

	public void setRegularWeekdayRate(int regularWeekdayRate) {
		this.regularWeekdayRate = regularWeekdayRate;
	}

	public int getRegularWeekendRate() {
		return regularWeekendRate;
	}

	public void setRegularWeekendRate(int regularWeekendRate) {
		this.regularWeekendRate = regularWeekendRate;
	}

//	public int getRewardWeekdayRate() {
//		return rewardWeekdayRate;
//	}
//
//	public void setRewardWeekdayRate(int rewardWeekdayRate) {
//		this.rewardWeekdayRate = rewardWeekdayRate;
//	}
//
//	public int getRewardweekendRate() {
//		return rewardweekendRate;
//	}
//
//	public void setRewardweekendRate(int rewardweekendRate) {
//		this.rewardweekendRate = rewardweekendRate;
//	}
//
//	public int getRating() {
//		return rating;
//	}
//
//	public void setRating(int rating) {
//		this.rating = rating;
//	}
	
}
