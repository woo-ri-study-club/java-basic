import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

class PersonTest {

    @DisplayName("Person 생성")
    @Test
    void createPerson() {
        //given
        String name = "Unknown";
        int age = 0;

        //when
        Person sangmin = new Person(name, age);

        //then
        assertSoftly(softly -> {
            softly.assertThat(sangmin).isInstanceOf(Person.class);
            softly.assertThat(sangmin.getName()).isEqualTo("Unknown");
            softly.assertThat(sangmin.getAge()).isEqualTo(0);
        });
    }
}