package com.turkcell.spring.starter.service.impl;

import com.turkcell.spring.starter.repositories.OtherPersonelRepository;
import com.turkcell.spring.starter.service.OtherPersonelService;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public class OtherPersonelImpl implements OtherPersonelService {
    private OtherPersonelRepository otherPersonelRepository;

    public OtherPersonelImpl(OtherPersonelRepository otherPersonelRepository) {
        this.otherPersonelRepository = otherPersonelRepository;
    }
}
