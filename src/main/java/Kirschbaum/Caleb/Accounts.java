package Kirschbaum.Caleb;

import java.util.List;

import com.revature.annotations.Column;
import com.revature.annotations.Entity;
import com.revature.annotations.Id;
import com.revature.annotations.JoinColumn;
import com.revature.annotations.ManyToMany;

@Entity
public class Accounts {

	@Id(serial = true)
	private int id;
	@Column(scale = 2, precision = 13, default_value = "0")
	private double balance;
	@ManyToMany
	@JoinColumn(mappedByTable = "Users", mappedByColumn = "accounts")
	private List<Users> owners;
}
