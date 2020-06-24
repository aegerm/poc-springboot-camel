package com.aegerm.poccamel.service;

import com.aegerm.poccamel.domain.Device;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Service;

@Service
public class DeviceService extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:devices").
            routeId("rota-devices").
            multicast().
            to("direct:http-post");

        from("direct:http-post").
            routeId("rota-http-post").
            split().xpath("/device/params/value").
            unmarshal().jacksonxml(Device.class).
            marshal().json().
            log("Enviando dispositivo para API via HTTP POST").
            setHeader(Exchange.CONTENT_TYPE, constant("application/json")).
            to("http://localhost:8080/device/value");
    }
}