package pl.suskia.system.vacation.dao;

import org.springframework.stereotype.Repository;
import pl.suskia.system.vacation.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class UserPostgresDataAccessService implements UserDao {
    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public Optional<User> getUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public int updateUser(UUID id, User user) {
        return 0;
    }

    @Override
    public int deleteUserById(UUID id) {
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        return 0;
    }
}