package tv.codely.app.mooc.controller.courses;

import org.junit.jupiter.api.Test;
import tv.codely.app.mooc.controller.RequestTestCase;

final class CoursesPutControllerShould extends RequestTestCase {

    @Test
    void create_a_valid_course() throws Exception {
        assertRequestWithBody(
            "PUT",
            "/courses/52ab832e-7641-11ec-90d6-0242ac120003",
            "{\"name\": \"The best course\", \"duration\": \"5 hours\"}",
            201);
    }

    @Test
    void create_a_invalid_course() throws Exception {
        assertRequestWithBody(
            "PUT",
            "/courses/52ab832e-7641-11ec-90d6-0242ac120003",
            "",
            400);
    }

}

