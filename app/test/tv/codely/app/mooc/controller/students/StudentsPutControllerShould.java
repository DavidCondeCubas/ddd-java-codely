package tv.codely.app.mooc.controller.students;

import org.junit.jupiter.api.Test;
import tv.codely.app.mooc.controller.RequestTestCase;

import static org.junit.jupiter.api.Assertions.*;

final class StudentsPutControllerShould extends RequestTestCase {

    @Test
    void create_an_valid_user() throws Exception {
        assertRequestWithBody(
            "PUT",
            "/students/52ab832e-7641-11ec-90d6-0242ac120003",
            "{\"firstName\": \"Pedro\", \"lastName\": \"Infante\", \"dni\":\"50568918U\"}",
            201);
    }

    @Test
    void create_an_user_with_empty_data() throws Exception {
        assertRequestWithBody(
            "PUT",
            "/students/52ab832e-7641-11ec-90d6-0242ac120003",
            "",
            400);
    }
}
