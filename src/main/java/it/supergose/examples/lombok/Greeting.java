package it.supergose.examples.lombok;

import lombok.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Getter
@Builder
public class Greeting {
    @NonNull
    private final long id;
    @NonNull
    private final String content;
}
