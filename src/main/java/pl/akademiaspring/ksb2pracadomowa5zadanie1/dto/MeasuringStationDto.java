package pl.akademiaspring.ksb2pracadomowa5zadanie1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "stationName",
        "gegrLat",
        "gegrLon",
        "city",
        "addressStreet"
})
public class MeasuringStationDto {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("stationName")
    private String stationName;
    @JsonProperty("gegrLat")
    private String gegrLat;
    @JsonProperty("gegrLon")
    private String gegrLon;
    @JsonProperty("city")
    private CityDto city;
    @JsonProperty("addressStreet")
    private String addressStreet;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("stationName")
    public String getStationName() {
        return stationName;
    }

    @JsonProperty("stationName")
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @JsonProperty("gegrLat")
    public String getGegrLat() {
        return gegrLat;
    }

    @JsonProperty("gegrLat")
    public void setGegrLat(String gegrLat) {
        this.gegrLat = gegrLat;
    }

    @JsonProperty("gegrLon")
    public String getGegrLon() {
        return gegrLon;
    }

    @JsonProperty("gegrLon")
    public void setGegrLon(String gegrLon) {
        this.gegrLon = gegrLon;
    }

    @JsonProperty("city")
    public CityDto getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(CityDto city) {
        this.city = city;
    }

    @JsonProperty("addressStreet")
    public String getAddressStreet() {
        return addressStreet;
    }

    @JsonProperty("addressStreet")
    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    @Override
    public String toString() {
        return "MeasuringStationDto{" +
                "id=" + id +
                ", stationName='" + stationName + '\'' +
                ", gegrLat='" + gegrLat + '\'' +
                ", gegrLon='" + gegrLon + '\'' +
                ", city=" + city +
                ", addressStreet='" + addressStreet + '\'' +
                '}';
    }
}
