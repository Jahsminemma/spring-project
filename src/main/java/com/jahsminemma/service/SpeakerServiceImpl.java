package com.jahsminemma.service;

import com.jahsminemma.model.Speaker;
import com.jahsminemma.repository.HibernateSpeakerRepositoryImpl;
import com.jahsminemma.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
   private SpeakerRepository repository;

   public SpeakerServiceImpl (SpeakerRepository speakerRepository){
       repository = speakerRepository;
   }
    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
