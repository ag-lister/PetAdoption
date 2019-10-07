package model;

import java.time.LocalDate;

public class pet {
	private int petID;
	private String species;
	private String breed;
	private String name;
	private int age;
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
