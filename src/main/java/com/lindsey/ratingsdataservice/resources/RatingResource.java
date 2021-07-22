package com.lindsey.ratingsdataservice.resources;

import com.lindsey.ratingsdataservice.models.Rating;
import com.lindsey.ratingsdataservice.models.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId){
        return new Rating(movieId, 1);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("123", 5),
                new Rating("124", 4),
                new Rating("125", 1)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);

        return userRating;
    }


}
