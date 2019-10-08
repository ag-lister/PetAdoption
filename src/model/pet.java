package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="pet")
public class pet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	@JoinTable
	( 
			name="agency",
			joinColumns= { @JoinColumn(name="PET_ID", referencedColumnName="PET_ID") },
			inverseJoinColumns={ @JoinColumn(name="PET_ID", referencedColumnName="PET_ID", unique=true) }
			)
	private int petID;
	@Column(name="PET_SPECIES")
	private String species;
	@Column(name="PET_BREED")
	private String breed;
	@Column(name="PET_NAME")
	private String name;
	@Column(name="PET_AGE")
	private int age;
	@Column(name="DATE_SHELTERED")
	private LocalDate dateSheltered;
	public pet() {
		super();
	}
	public pet(int petID, String species, String breed, String name, int age, LocalDate dateSheltered) {
		super();
		this.petID = petID;
		this.species = species;
		this.breed = breed;
		this.name = name;
		this.age = age;
		this.dateSheltered = dateSheltered;
	}
	public pet(String species, String breed, String name, int age, LocalDate dateSheltered) {
		super();
		this.species = species;
		this.breed = breed;
		this.name = name;
		this.age = age;
		this.dateSheltered = dateSheltered;
	}
	public int getPetID() {
		return petID;
	}
	public void setPetID(int petID) {
		this.petID = petID;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDateSheltered() {
		return dateSheltered;
	}
	public void setDateSheltered(LocalDate dateSheltered) {
		this.dateSheltered = dateSheltered;
	}
	@Override
	public String toString() {
		return "pet [petID=" + petID + ", species=" + species + ", breed=" + breed + ", name=" + name + ", age=" + age
				+ ", dateSheltered=" + dateSheltered + "]";
	}

}
