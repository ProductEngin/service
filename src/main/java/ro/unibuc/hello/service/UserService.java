package ro.unibuc.hello.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import ro.unibuc.hello.dto.User;
import ro.unibuc.hello.exception.EntityNotFoundException;

@Service
public class UserService {
    

    private final Map<Long, User> userMap = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    public UserService() {
        User user1 = new User(counter.incrementAndGet(), "John", "Doe", "john.doe@example.com");
        userMap.put(user1.getId(), user1);
    
        User user2 = new User(counter.incrementAndGet(), "Jane", "Doe", "jane.doe@example.com");
    
        userMap.put(user2.getId(), user2);
    }
    

    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    public User getUserById(Long id) throws EntityNotFoundException {
        if (!userMap.containsKey(id)) {
            throw new EntityNotFoundException("User with id " + id + " not found");
        }
        return userMap.get(id);
    }

    public User createUser(User user) {
        user.setId(counter.incrementAndGet());
        userMap.put(user.getId(), user);
        return user;
    }

    public User updateUser(User user) throws EntityNotFoundException {
        if (!userMap.containsKey(user.getId())) {
            throw new EntityNotFoundException("User with id " + user.getId() + " not found");
        }
        userMap.put(user.getId(), user);
        return user;
    }

    public void deleteUserById(Long id) throws EntityNotFoundException {
        if (!userMap.containsKey(id)) {
            throw new EntityNotFoundException("User with id " + id + " not found");
        }
        userMap.remove(id);
    }
    public User addUser(User user) {
        user.setId(counter.incrementAndGet());
        userMap.put(user.getId(), user);
        return user;
    }

    public User updateUser(Long id, User user) throws EntityNotFoundException {
        if (!userMap.containsKey(id)) {
            throw new EntityNotFoundException("User with id " + id + " not found.");
        }
        user.setId(id);
        userMap.put(id, user);
        return user;
    }

    public void deleteUser(Long id) throws EntityNotFoundException {
        if (!userMap.containsKey(id)) {
            throw new EntityNotFoundException("User with id " + id + " not found.");
        }
        userMap.remove(id);
    }

}