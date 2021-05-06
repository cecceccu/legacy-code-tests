package org.craftedsw.tripservicekata.user;

import org.craftedsw.tripservicekata.TripService_Original;
import org.craftedsw.tripservicekata.exception.CollaboratorCallException;
import org.craftedsw.tripservicekata.trip.Trip;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    private User user;

    @BeforeEach
    void setUserBeforeEach()
    {
        user = new User();
    }

    @AfterEach
    void cleanUserAfterEach()
    {
        user = null;
    }


    @Test
    @DisplayName("Test add friend method")
    void addFriendsTest()
    {
        User friend = new User();
        user.addFriend(friend);
        assertEquals(user.friends.get(0), friend);
    }

    @Test
    @DisplayName("Test add trip method")
    void addTripTest()
    {
        Trip trip = new Trip();
        user.addTrip(trip);
        assertEquals(user.trips.get(0), trip);
    }

    @Test
    @DisplayName("Test user session exception")
    void testExpectedException()
    {
        UserSession session = new UserSession();
        assertThrows(CollaboratorCallException.class, () -> session.getLoggedUser());
    }


}
