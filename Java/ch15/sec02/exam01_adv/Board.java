package ch15.sec02.exam01_adv;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Board {
    private String subject;
    private String content;
    private String writer;

}
