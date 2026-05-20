package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
	
	private Integer roomNumber;
	private LocalDate checkIn, checkOut;
	
	private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public LocalDate getCheckin() {
		return checkIn;
	}

		
	public LocalDate getCheckOut() {
		return checkOut;
	}


	public long duration() {
		long diff = ChronoUnit.DAYS.between(checkIn , checkOut);
		return diff;
	}
	
	public String updateDates(LocalDate checkIn, LocalDate checkOut) {
		LocalDate now = LocalDate.now();
		if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
			return "Error in reservation: Reservation dates for update must be future dates";
		}
		if (!checkOut.isAfter(checkIn)) {
			return "Error in reservation: Check-out date must be after check-in date ";
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
		
	}
	
	
	@Override
	public String toString() {
		return "Reservation: "
				+ "Room "
				+ roomNumber
				+ ", check-in: "
				+ getCheckin().format(fmt1)
				+ ", check-out: "
				+ getCheckOut().format(fmt1)
				+ ", "
				+ duration()
				+ " nights";
		
	}

}
