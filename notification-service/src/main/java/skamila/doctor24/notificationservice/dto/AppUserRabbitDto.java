package skamila.doctor24.notificationservice.dto;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class AppUserRabbitDto implements Serializable {

    private String name;

    private String email;

}
