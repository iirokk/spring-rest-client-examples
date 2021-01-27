package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Location implements Serializable {
    private String street;
    private String city;
    private String state;
    private String postcode;

}
