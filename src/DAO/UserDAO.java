package DAO;

import java.util.ArrayList;
import java.util.Map;

import Model.User;

public abstract class UserDAO {

	public abstract void addUser(User user);

	public abstract User getUser(int userId);

	public abstract ArrayList<User> getUsers();

	public abstract Map<Boolean, User> checkUser(User user);

	public abstract boolean setUser(User user);
}
