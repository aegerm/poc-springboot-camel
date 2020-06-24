package com.aegerm.webservice.pocapi.controller;

import com.aegerm.webservice.pocapi.entity.Device;
import com.aegerm.webservice.pocapi.service.DeviceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/device/value")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class DeviceController {

    private final DeviceService deviceService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Device device) {
        log.info("####SALVANDO-DEVICE####");
        this.deviceService.saveDevice(device);
        return ResponseEntity.ok().build();
    }
}