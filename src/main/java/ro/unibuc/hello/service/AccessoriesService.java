package ro.unibuc.hello.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import ro.unibuc.hello.dto.Accessories;
import ro.unibuc.hello.exception.EntityNotFoundException;

@Service
public class AccessoriesService {
    
    private final Map<Long, Accessories> accessoriesMap = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    public AccessoriesService() {
        Accessories accessory1 = new Accessories(counter.incrementAndGet(), "Accessory1", 9.99, "Red", "Leather");
        accessoriesMap.put(accessory1.getId(), accessory1);
    
        Accessories accessory2 = new Accessories(counter.incrementAndGet(), "Accessory2", 19.99, "Blue", "Metal");
        accessoriesMap.put(accessory2.getId(), accessory2);
    }
    

    public List<Accessories> getAllAccessories() {
        return new ArrayList<>(accessoriesMap.values());
    }

    public Accessories getAccessoryById(Long id) throws EntityNotFoundException {
        if (!accessoriesMap.containsKey(id)) {
            throw new EntityNotFoundException("Accessory with id " + id + " not found");
        }
        return accessoriesMap.get(id);
    }

    public Accessories createAccessory(Accessories accessory) {
        accessory.setId(counter.incrementAndGet());
        accessoriesMap.put(accessory.getId(), accessory);
        return accessory;
    }

    public Accessories updateAccessory(Accessories accessory) throws EntityNotFoundException {
        if (!accessoriesMap.containsKey(accessory.getId())) {
            throw new EntityNotFoundException("Accessory with id " + accessory.getId() + " not found");
        }
        Accessories existingAccessory = optionalAccessory.get();
            existingAccessory.setName(accessory.getName());
            existingAccessory.setPrice(accessory.getPrice());
            return accessoriesRepository.save(existingAccessory);
    }

    public void deleteAccessoryById(Long id) throws EntityNotFoundException {
        if (!accessoriesMap.containsKey(id)) {
            throw new EntityNotFoundException("Accessory with id " + id + " not found");
        }
        accessoriesMap.remove(id);
    }
}
