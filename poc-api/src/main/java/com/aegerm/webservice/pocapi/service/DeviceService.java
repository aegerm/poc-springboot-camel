package com.aegerm.webservice.pocapi.service;

import com.aegerm.webservice.pocapi.entity.Device;
import com.aegerm.webservice.pocapi.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DeviceService {

    private final DeviceRepository deviceRepository;

    public void saveDevice(Device device) {
        this.deviceRepository.save(device);
    }
}