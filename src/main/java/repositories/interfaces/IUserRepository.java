package repositories.interfaces;

import entities.User;
import repositories.interfaces.base.IRepository;

public interface IUserRepository extends IRepository<User> {
    User getUserByLogin(String username, String password);
    User getUserByUsername(String issuer);
}
