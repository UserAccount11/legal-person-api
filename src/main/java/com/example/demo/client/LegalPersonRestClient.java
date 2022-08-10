package com.example.demo.client;

import com.example.demo.dto.LegalPersonDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class LegalPersonRestClient {

    private final RestTemplate restTemplate;

    @Value("${rest-client.token}")
    private String token;

    public LegalPersonDto getLegalPersonDto(String type, String ruc) {
        String uri = String.format("http://wsruc.com/Ruc2WS_JSON.php?tipo=%s&ruc=%s&token=%s", type, ruc, token);
        return restTemplate.getForObject(uri, LegalPersonDto.class);
    }

}
