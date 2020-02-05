package pl.akademiaspring.ksb2pracadomowa5zadanie1.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.akademiaspring.ksb2pracadomowa5zadanie1.dto.MeasuringStationDto;

@Controller
public class MeasuringStationClient {

    private MeasuringStationDto[] measuringStationDtoTable;

    public MeasuringStationClient() {

        RestTemplate restTemplate = new RestTemplate();

        this.measuringStationDtoTable = restTemplate.getForObject(
                "http://api.gios.gov.pl/pjp-api/rest/station/findAll",
                MeasuringStationDto[].class
        );
    }

    public MeasuringStationDto[] getMeasuringStationDtoTable() {
        return measuringStationDtoTable;
    }

    public void setMeasuringStationDtoTable(MeasuringStationDto[] measuringStationDtoTable) {
        this.measuringStationDtoTable = measuringStationDtoTable;
    }
}
