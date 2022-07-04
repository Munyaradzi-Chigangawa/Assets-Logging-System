package com.example.backend.Services;
import com.example.backend.Models.Laptop;
import com.example.backend.Repositories.LaptopRepository;
import com.example.backend.dto.LaptopDto;
import com.example.backend.exceptions.LaptopNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class LaptopService {

        @Autowired
        private final LaptopRepository laptopRepository;
        public Laptop save (LaptopDto laptop) {
        Laptop laptop1 = Laptop.builder()
                .laptopName(laptop.getLaptopName())
                .laptopModel(laptop.getLaptopModel())
                .LaptopBrand(laptop.getLaptopBrand())
                .laptopSerialNumber(laptop.getLaptopSerialNumber())
                .processor(laptop.getProcessor())
                .ram(laptop.getRam())
                .storage(laptop.getStorage())
                .createdAt(laptop.getCreatedAt())
                .updatedAt(laptop.getUpdatedAt())
                .build();
        return laptopRepository.save(laptop1);
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }

    public Laptop getLaptop(Long id) {
        return laptopRepository.findById(id)
                .orElseThrow(() -> new LaptopNotFound("Laptop id " + id + "was not found"));
    }

    public Laptop deleteLaptop(Long id) {
        laptopRepository.deleteById(id);
        return null;
    }

}
