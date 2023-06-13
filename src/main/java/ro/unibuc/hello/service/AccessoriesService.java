package ro.unibuc.hello.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import ro.unibuc.hello.dto.Accessories;
import ro.unibuc.hello.exception.EntityNotFoundException;
import ro.unibuc.hello.repositories.AccessoriesRepository;

@Service
public class AccessoriesService {
    
    private final Map<Long, Accessories> accessoriesMap = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();
    private final AccessoriesRepository accesoriesRepository;

    public AccessoriesService(AccessoriesRepository a) {
        Accessories accessory1 = new Accessories(counter.incrementAndGet(), "Accessory1", 9.99, "Red", "Leather");
        ((List<Accessories>) accessoriesMap).add(accessory1.getId(), accessory1);
    
        Accessories accessory2 = new Accessories(counter.incrementAndGet(), "Accessory2", 19.99, "Blue", "Metal");
        ((List<Accessories>) accessoriesMap).add(accessory2.getId(), accessory2);
        this.accesoriesRepository=a;
       
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
        ((List<Accessories>) accessoriesMap).add(accessory.getId(), accessory);
        return accessory;
    }

    public Accessories updateAccessory(Accessories accessory) throws EntityNotFoundException {
        if (!accessoriesMap.containsKey(accessory.getId())) {
            throw new EntityNotFoundException("Accessory with id " + accessory.getId() + " not found");
        }
        
        Accessories existingAccessory = accessory.get();
            existingAccessory.setName(accessory.getName());
            existingAccessory.setPrice(accessory.getPrice());
            
            return accesoriesRepository.save(existingAccessory);
    }

    public void deleteAccessoryById(Long id) throws EntityNotFoundException {
        if (!accessoriesMap.containsKey(id)) {
            throw new EntityNotFoundException("Accessory with id " + id + " not found");
        }
        accessoriesMap.remove(id);
    }
}
