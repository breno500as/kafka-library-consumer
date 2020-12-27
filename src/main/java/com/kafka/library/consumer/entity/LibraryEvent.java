package com.kafka.library.consumer.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LibraryEvent {

	@Id
	@GeneratedValue
	private Integer libraryEventId;

	@Enumerated(EnumType.STRING)
	private LibraryEventType libraryEventType;

	@OneToOne(mappedBy = "libraryEvent", cascade = { CascadeType.ALL })
	private Book book;

	public LibraryEvent(Integer libraryEventId, LibraryEventType libraryEventType, Book book) {
		super();
		this.libraryEventId = libraryEventId;
		this.libraryEventType = libraryEventType;
		this.book = book;
	}

	public Integer getLibraryEventId() {
		return libraryEventId;
	}

	public void setLibraryEventId(Integer libraryEventId) {
		this.libraryEventId = libraryEventId;
	}

	public LibraryEventType getLibraryEventType() {
		return libraryEventType;
	}

	public void setLibraryEventType(LibraryEventType libraryEventType) {
		this.libraryEventType = libraryEventType;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
