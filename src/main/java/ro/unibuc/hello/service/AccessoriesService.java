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

    @Autowired
    private AccessoriesRepository accessoriesRepository;

    public List<Accessories> getAllAccessories() {
        return accessoriesRepository.findAll();
    }

    public Accessories getAccessoryById(int id) {
        Optional<Accessories> optionalAccessory = accessoriesRepository.findById(id);
        return optionalAccessory.orElse(null);
    }

    public Accessories createAccessory(Accessories accessory) {
        return accessoriesRepository.save(accessory);
    }

    public Accessories updateAccessory(int id, Accessories accessory) {
        Optional<Accessories> optionalAccessory = accessoriesRepository.findById(id);
        if (optionalAccessory.isPresent()) {
            Accessories existingAccessory = optionalAccessory.get();
            existingAccessory.setName(accessory.getName());
            existingAccessory.setPrice(accessory.getPrice());
            return accessoriesRepository.save(existingAccessory);
        }
        return null;
    }

    public boolean deleteAccessory(int id) {
        Optional<Accessories> optionalAccessory = accessoriesRepository.findById(id);
        if (optionalAccessory.isPresent()) {
            accessoriesRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
