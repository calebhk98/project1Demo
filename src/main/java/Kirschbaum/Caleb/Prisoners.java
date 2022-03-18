package Kirschbaum.Caleb;

import com.revature.annotations.Entity;
import com.revature.annotations.Id;
import com.revature.annotations.JoinColumn;
import com.revature.annotations.ManyToOne;

@Entity
public class Prisoners {

	@Id(serial = true)
	int id;
	String name;

	@ManyToOne
	@JoinColumn(mappedByTable = "Prison", mappedByColumn = "id")
	int prisonId;

	@Override
	public String toString() {
		return "Prisoners [id=" + id + ", name=" + name + ", prisonId=" + prisonId + "]";
	}

	public Prisoners() {
	}

	public Prisoners(String name, int prisonId) {
		this.name = name;
		this.prisonId = prisonId;
	}

}
