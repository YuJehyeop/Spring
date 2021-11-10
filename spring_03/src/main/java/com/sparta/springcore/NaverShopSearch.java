package com.sparta.springcore;

import lombok.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

@Comoonet
//@PropertySource("classpath:config.properties")

public class NaverShopSearch {

    @Value("${X-Naver-Client-Id}") // config.properties에 저장된 키 값 가져오기
    private String xNaverClientId;

    @Value("${X-Naver-Client-Secret}") // config.properties에 저장된 키 값 가져오기
    private String xNaverClientSecret;

    public String search() {
        RestTemplate rest = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Naver-Client-Id", xNaverClientId);
        headers.add("X-Naver-Client-Secret", xNaverClientSecret);
        String body = "";

        HttpEntity<String> requestEntity = new HttpEntity<String>(body, headers);
        ResponseEntity<String> responseEntity = rest.exchange("https://openapi.naver.com/v1/search/shop.json?query=adidas", HttpMethod.GET, requestEntity, String.class);
        HttpStatus httpStatus = responseEntity.getStatusCode();
        int status = httpStatus.value();
        String response = responseEntity.getBody();
        System.out.println("Response status: " + status);
        System.out.println(response);

        return response;
    }

    public static void main(String[] args) {
        NaverShopSearch naverShopSearch = new NaverShopSearch();
        naverShopSearch.search();
    }
}