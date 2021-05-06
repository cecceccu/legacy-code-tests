package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.exception.CollaboratorCallException;
import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TripServiceTest {

    @Test
    @DisplayName("Test CollaboratCallException in get trips by user method")
    void CollaboratorCallExceptionTest()
    {
        User user = new User();
        TripService trip = new TripService();
        Assertions.assertThrows(CollaboratorCallException.class, ()-> trip.getTripsByUser(user));
    }

    @Test
    @DisplayName("Test UserNotLoggedInException in get trips method")
    void UserNotLoggedInExceptionTest()
    {
        TripService trip = new TripService();
        Assertions.assertThrows(UserNotLoggedInException.class, ()-> trip.getTrips(null, null, null, false));
    }
	
}
