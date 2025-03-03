package  ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;
import ticket.booking.utils.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

class UserBookingService {
    private final User user;
    private final static String USER_DB_PATH = "app/src/main/java/ticket/booking/db/users.json";
    private final List<User> userList;


    UserBookingService(User user) throws IOException {
        this.user = user;

        File users = new File(USER_DB_PATH);
        ObjectMapper objectMapper = new ObjectMapper();
        this.userList = objectMapper.readValue(users, new TypeReference<List<User>>() {

        });
    }

    public Boolean loginUser() {
        Optional<User> foundUser = userList.stream().filter(user -> {
            return user.getEmail().equals(this.user.getEmail()) && UserServiceUtil.checkPassword(this.user, user);
        }).findFirst();

        return foundUser.isPresent();
    }

    public Boolean signupUser(User user) throws IOException{
        userList.add(user);
        saveUserListToFile();
        return Boolean.TRUE;
    }

    private void saveUserListToFile() {

    }
}