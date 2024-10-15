package weatherapp.services;

import java.util.List;
import java.util.UUID;

import weatherapp.entities.Locations;
import weatherapp.repositories.LocationsRepository;

@Service
@RequiredArgsConstructor
public class LocationsService {
    private final LocationsRepository locationsRepository;

    public List<Locations> findAll(){
        return locationsRepository.findAll();
    }

    public Locations findById(UUID id){
        return locationsRepository.findById(id);
    }

    public Locations saveLocation(Locations locations){
        return locationsRepository.save(locations);
    }

    public List<Locations> findByCity(String city){
        return locationsRepository.findByCity(city);
    }

    public Locations findByRegion(String region){
        return locationsRepository.findByRegion(region);
    }

    public Locations findByCountry(String country){
        return locationsRepository.findByCountry(country);
    }

    public Locations findByLatitude(String latitude){
        return locationsRepository.findByLatitude(latitude);
    }

    public Locations findByLongitude(String longitude){
        return locationsRepository.findByLongitude(longitude);
    }
}
