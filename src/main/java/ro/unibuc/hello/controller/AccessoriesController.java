package ro.unibuc.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import ro.unibuc.hello.dto.Accessories;

@RestController
@RequestMapping("/accessories")
public class AccessoriesController {

    private final List<Accessories> accessories = new ArrayList<>();

    @GetMapping
    public List<Accessories> getAll() {
        return accessories;
    }

    @GetMapping("/{id}")
    public Accessories getById(@PathVariable int id) {
        return accessories.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Accessory not found"));
    }

    @PostMapping
    public Accessories create(@RequestBody Accessories accessory) {
        accessories.add(accessory);
        return accessory;
    }

    @PutMapping("/{id}")
    public Accessories update(@PathVariable int id, @RequestBody Accessories accessory) {
        Accessories existingAccessory = getById(id);
        existingAccessory.setName(accessory.getName());
        existingAccessory.setPrice(accessory.getPrice());
        existingAccessory.setColor(accessory.getColor());
        existingAccessory.setMaterial(accessory.getMaterial());
        return existingAccessory;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        Accessories existingAccessory = getById(id);
        accessories.remove(existingAccessory);
    }
}
