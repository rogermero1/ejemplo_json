package prueba.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChuckNorrisJoke {
	private String icon_url;
    private String id;
    private String url;
    private String value;
}
