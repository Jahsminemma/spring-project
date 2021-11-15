package com.jahsminemma.repository;

import com.jahsminemma.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
