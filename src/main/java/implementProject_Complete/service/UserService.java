package implementProject_Complete.service;

import implementProject_Complete.domain.User;
import implementProject_Complete.shared.AbstractCRUD;

public interface UserService extends AbstractCRUD<User>{

	User getUserByEmail(String email);
	
}
