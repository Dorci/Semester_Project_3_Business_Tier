package startApplication.Database;

import startApplication.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserDataAccessService implements UserDb
{
    private static List<User> users = new ArrayList<>();

    @Override
    public int createUser(UUID id, User user)
    {
        users.add(new User(user.getUserId(), user.getFirstName(),user.getLastName(),user.getEmailAddress(),user.getAge()));
        return 1;
    }
}
