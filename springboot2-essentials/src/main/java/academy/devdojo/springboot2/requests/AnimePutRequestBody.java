package academy.devdojo.springboot2.requests;

import lombok.Data;

@Data
public class AnimePutRequestBody {
    private Long Id;
    private String name;
}
