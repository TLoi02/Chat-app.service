package chatroom.service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Message {
    private String username;
    private String message;
    private LocalDateTime sendAt;
}
