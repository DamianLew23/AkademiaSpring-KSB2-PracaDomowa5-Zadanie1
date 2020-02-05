package pl.akademiaspring.ksb2pracadomowa5zadanie1.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiaspring.ksb2pracadomowa5zadanie1.client.MeasuringStationClient;
import pl.akademiaspring.ksb2pracadomowa5zadanie1.dto.MeasuringStationDto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/stations")
public class MeasuringStationApi {

    private MeasuringStationClient measuringStationClient;

    MeasuringStationApi(
            MeasuringStationClient measuringStationClient
    ) {
        this.measuringStationClient = measuringStationClient;
    }

    @GetMapping
    public ResponseEntity<List<MeasuringStationDto>> getMeasuringStationsDto() {
        List<MeasuringStationDto> measuringStationDtoList =
                Arrays.stream(measuringStationClient.getMeasuringStationDtoTable())
                        .collect(Collectors.toList());
        return new ResponseEntity<>(measuringStationDtoList, HttpStatus.OK);
    }

}
