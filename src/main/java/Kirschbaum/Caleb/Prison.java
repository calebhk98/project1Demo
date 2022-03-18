package Kirschbaum.Caleb;

import java.util.List;

import com.revature.annotations.Entity;
import com.revature.annotations.Id;
import com.revature.annotations.JoinColumn;
import com.revature.annotations.OneToMany;

@Entity
public class Prison {

	@Id(serial = true)
	int id;
	String name;

	@OneToMany
	@JoinColumn
	List<Prisoners> prisoners;

	public Prison() {
	}

	public Prison(String name, List<Prisoners> prisoners) {
		this.name = name;
		this.prisoners = prisoners;
	}

}
