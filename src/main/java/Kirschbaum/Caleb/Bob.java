package Kirschbaum.Caleb;

import java.time.LocalDate;
import java.util.Objects;

import com.revature.annotations.Column;
import com.revature.annotations.Entity;
import com.revature.annotations.Id;

@Entity(tableName = "Food")
//@Entity
public class Bob {

	@Id
	int id;
	String name;
	int calories;
	@Column(columnName = "creationDate")
	LocalDate d;

	public Bob() {
	}

	public Bob(int id, String name, int calories) {
		this.id = id;
		this.name = name;
		this.calories = calories;
	}

	public Bob(String name, int calories, LocalDate timeOfCreation) {
		this.name = name;
		this.calories = calories;
		d = timeOfCreation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(calories, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		Bob other = (Bob) obj;
		return (calories == other.calories) && (id == other.id) && Objects.equals(name, other.name);
	}

}
