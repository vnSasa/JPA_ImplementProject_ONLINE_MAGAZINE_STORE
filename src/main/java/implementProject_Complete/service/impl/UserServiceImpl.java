package implementProject_Complete.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import implementProject_Complete.dao.UserDao;
import implementProject_Complete.dao.impl.UserDaoImpl;
import implementProject_Complete.domain.User;
import implementProject_Complete.service.UserService;

public class UserServiceImpl implements UserService {
	private static Logger LOGGER = Logger.getLogger(UserServiceImpl.class);
	private static UserService userServiceImpl;
	private UserDao userDao;

	private UserServiceImpl() {
		userDao = new UserDaoImpl();
	}

	public static UserService getUserService() {
		if (userServiceImpl == null) {
			userServiceImpl = new UserServiceImpl();
		}

		return userServiceImpl;
	}

	@Override
	public User create(User t) {

		return userDao.create(t);
	}

	@Override
	public User read(Integer id) {
		return userDao.read(id);
	}

	@Override
	public User update(User t) {
		return userDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}

	@Override
	public List<User> readAll() {
		return userDao.readAll();
	}

	@Override
	public User getUserByEmail(String email) {
		return userDao.getUserByEmail(email);
	}

}
