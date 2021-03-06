package pl.akademiaspring.ksb2pracadomowa5zadanie1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "communeName",
        "districtName",
        "provinceName"
})
public class CommuneDto {

    @JsonProperty("communeName")
    private String communeName;
    @JsonProperty("districtName")
    private String districtName;
    @JsonProperty("provinceName")
    private String provinceName;

    @JsonProperty("communeName")
    public String getCommuneName() {
        return communeName;
    }

    @JsonProperty("communeName")
    public void setCommuneName(String communeName) {
        this.communeName = communeName;
    }

    @JsonProperty("districtName")
    public String getDistrictName() {
        return districtName;
    }

    @JsonProperty("districtName")
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @JsonProperty("provinceName")
    public String getProvinceName() {
        return provinceName;
    }

    @JsonProperty("provinceName")
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public String toString() {
        return "CommuneDto{" +
                "communeName='" + communeName + '\'' +
                ", districtName='" + districtName + '\'' +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }
}
