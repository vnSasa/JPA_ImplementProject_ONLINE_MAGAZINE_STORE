package implementProject_Complete.dao;

import implementProject_Complete.domain.User;
import implementProject_Complete.shared.AbstractCRUD;

public interface UserDao extends AbstractCRUD<User> {

	User getUserByEmail(String email);
	
}
