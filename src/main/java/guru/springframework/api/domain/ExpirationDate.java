package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ExpirationDate implements Serializable {
    private LocalDateTime date;
    private Integer timezoneType;
    private String timezone;
}
