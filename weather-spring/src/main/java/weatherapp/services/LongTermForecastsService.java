package weatherapp.services;

import java.util.List;
import java.util.UUID;

import weatherapp.entities.LongTermForecasts;
import weatherapp.repositories.LongTermForecastsRepository;

@Service 
@RequiredArgsConstructor
public class LongTermForecastsService {
    private final LongTermForecastsRepository longTermForecastsRepository;

    public List<LongTermForecasts> findAll(){
        return longTermForecastsRepository.findAll();
    }

    public LongTermForecasts findById(UUID id){
        return longTermForecastsRepository.fidnById();
    }

    public LongTermForecasts saveLongTermForecasts(LongTermForecasts longTermForecasts){
        return longTermForecastsRepository.save(longTermForecasts);
    }

    public List<Locations> findByCity(String city){
        return longTermForecastsRepository.findByCity(city);
    }

    public Locations findByRegion(String region){
        return longTermForecastsRepository.findByRegion(region);
    }

    public Locations findByCountry(String country){
        return longTermForecastsRepository.findByCountry(country);
    }

    public Locations findByLatitude(String latitude){
        return longTermForecastsRepository.findByLatitude(latitude);
    }

    public Locations findByLongitude(String longitude){
        return longTermForecastsRepository.findByLongitude(longitude);
    }
}
