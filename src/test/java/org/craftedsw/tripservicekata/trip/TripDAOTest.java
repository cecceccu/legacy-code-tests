package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.exception.CollaboratorCallException;
import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserSession;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TripDAOTest {
    @Test
    @DisplayName("Test TripDAO exception")
    void testExpectedException()
    {
        assertThrows(CollaboratorCallException.class, () -> TripDAO.findTripsByUser(new User()));
    }

}
