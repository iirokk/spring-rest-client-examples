package guru.springframework.api.domain;

import java.io.Serializable;

public class Card implements Serializable {

    private String type;
    private String number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;
}
