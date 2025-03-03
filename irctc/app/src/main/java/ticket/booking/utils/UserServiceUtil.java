package ticket.booking.utils;

import org.mindrot.jbcrypt.BCrypt;

public class UserServiceUtil {
    public static boolean checkPassword(String plainPassword, String hashedPassword)  {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }

    public  static  String hashedPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }
}
