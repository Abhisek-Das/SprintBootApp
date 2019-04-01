package com.abhi.boot.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="subject")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="subjects_subjectid")
	long subjectId;
	@Column(name="subjects_subtitle")
    String subtitle;
	@Column(name="subjects_hours")
	int durationInHours;
	@ManyToMany(cascade= { /*CascadeType.PERSIST, CascadeType.MERGE,*/ CascadeType.ALL } )
	@JoinTable(name="subject_book_mapping_table",joinColumns= {@JoinColumn(name="subjectId")},inverseJoinColumns= {@JoinColumn(name="bookId")})
	List<Book> references;
	
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public int getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}
	public List<Book> getReferences() {
		return references;
	}
	public void setReferences(List<Book> references) {
		this.references = references;
	}
//	@Override
//	public String toString() {
//		return "Subject [subjectId=" + subjectId + ", subtitle=" + subtitle + ", durationInHours=" + durationInHours
//				+ ", references=" + references + "]";
//	}
	public Subject() {
//		super();
	}
//	public Subject(long subjectId, String subtitle, int durationInHours, List<Book> references) {
//		super();
//		this.subjectId = subjectId;
//		this.subtitle = subtitle;
//		this.durationInHours = durationInHours;
//		this.references = references;
//	}
	
	

}
