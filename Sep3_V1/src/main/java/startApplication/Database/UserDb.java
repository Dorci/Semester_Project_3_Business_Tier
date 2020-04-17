package startApplication.Database;

import startApplication.model.User;

import java.util.UUID;

public interface UserDb
{
   int createUser(UUID id, User user);

   default int createUser(User user)
   {
       UUID id = UUID.randomUUID();
       return createUser(id,user);
   }

}
