package mission1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CircleTest {

    @DisplayName("원의 넓이를 구한다.")
    @Test
    void calculateArea() {
    	// given
    	Circle circle = new Circle(4);

    	// when
        double area = circle.calculateArea();

        // then
    	assertThat(area).isEqualTo(50.24);
    }

}