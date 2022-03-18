package Kirschbaum.Caleb;

import java.time.LocalDate;
import java.util.List;

import com.revature.Account;
import com.revature.annotations.Column;
import com.revature.annotations.Entity;
import com.revature.annotations.Id;
import com.revature.annotations.JoinColumn;
import com.revature.annotations.ManyToMany;

@Entity
public class Users {

	@Id(serial = true)
	private Long id;
	@Column(columnName = "username", nullable = false, unique = true, length = 15)
	private String userName;
	@Column(columnName = "pwd", nullable = false, length = 15)
	private String password;
	@Column(columnName = "first_name", nullable = false)
	private String firstName;
	@Column(columnName = "last_name", nullable = true)
	private String lastName;

	private short height;
	@Column(default_value = "false")
	private Boolean verified;
	private LocalDate DoB;

	@ManyToMany
	@JoinColumn(mappedByTable = "Accounts", mappedByColumn = "owners")
	private List<Account> accounts;

}
