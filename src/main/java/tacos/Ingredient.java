package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import tacos.web.Type;

@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

}
