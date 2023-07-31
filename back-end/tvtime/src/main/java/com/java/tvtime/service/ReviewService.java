package com.java.tvtime.service;

import com.java.tvtime.model.Review;

public interface ReviewService {
    
    public Review createReview(String reviewBody, String imdbId);
}
