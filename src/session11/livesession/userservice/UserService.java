package session11.livesession.userservice;

public interface UserService {

    void createUser(User user);
    User findUserByID(long id);
    void deleteUser(long id);
}
