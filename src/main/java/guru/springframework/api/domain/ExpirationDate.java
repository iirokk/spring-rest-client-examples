package guru.springframework.api.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ExpirationDate implements Serializable {

    private LocalDateTime date;
    private Integer timezoneType;
    private String timezone;
}
