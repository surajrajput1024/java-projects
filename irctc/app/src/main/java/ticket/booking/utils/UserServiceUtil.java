package ticket.booking.utils;

import ticket.booking.entities.User;

public class UserServiceUtil {
    public static boolean checkPassword(User currentUser, User dbUser)  {
        // Need to hash current password and then we need to match with db passed (hashed)
        return currentUser.getPassword().equals(dbUser.getPassword());
    }
}
