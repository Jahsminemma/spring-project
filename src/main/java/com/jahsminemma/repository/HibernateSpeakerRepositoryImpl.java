package com.jahsminemma.repository;

import com.jahsminemma.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Emmanuel");
        speaker.setLastName("Okonkwo");
        speakers.add(speaker);

        return speakers;

    }
}
