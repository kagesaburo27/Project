package repositories.interfaces;

import entities.UserBook;
import repositories.interfaces.base.IRepository;

import java.util.List;

public interface IUserBookRepository extends IRepository<UserBook> {
    List<UserBook> getUserBooksByUserId(int userId);
    List<UserBook> getUserBooksByBookId(int bookId);
}
