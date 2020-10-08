package com.rohan.hotelmanagementsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelReservation {
	public static Map<String, Hotel> hotelMap = new HashMap<>();

	// Add new hotel
	public static void addHotel() {
		hotelMap.put("Lakewood", new Hotel("Lakewood", 110, 90));
		hotelMap.put("Bridgewood", new Hotel("Bridgewood", 160, 60));
		hotelMap.put("Ridgewood", new Hotel("Ridgewood", 220, 150));
	}

	// extract date in numbers
	public static int extractDate(String date) {
		date = date.replaceAll("[^\\d]", " ");
		String[] dates = date.split(" ");
		int dateNum = Integer.parseInt(dates[0]);
		return dateNum;
	}

	// finding cheapest hotel for given dates
	public static void cheapestHotel(Scanner scanner) {
		System.out.println("Enter date range \nFrom : ");
		String from = scanner.nextLine();
		System.out.println("To : ");
		String to = scanner.nextLine();
		int fromDate = extractDate(from);
		int toDate = extractDate(to);
		int cost = Integer.MAX_VALUE;
		String cheapHotel = "";
		for (Map.Entry<String, Hotel> entry : hotelMap.entrySet()) {
			int newCost = entry.getValue().getRegularWeekdayRate() * (toDate - fromDate + 1);
			if (newCost < cost) {
				cheapHotel = entry.getKey();
				cost = newCost;
			}
		}
		System.out.println("Cheapest hotel : " + cheapHotel + ", Total Rates : $" + cost);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program");
		Scanner scanner = new Scanner(System.in);
		addHotel();
		cheapestHotel(scanner);

		scanner.close();
	}
}
