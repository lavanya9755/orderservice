package com.order.orderserive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import org.springframework.beans.factory.annotation.Value;
import com.order.orderserive.client.InventoryClient;



public class RestClientConfig {

    @Value("${inventory.url}")
    public String inventoryServiceUrl;

    @Bean
    public InventoryClient inventoryClinet() {

        RestClient restClient = RestClient.builder().baseUrl(inventoryServiceUrl).build();

        var restClientAdapter = RestClientAdapter.create(restClient);
        var httpServiceProxyFactory = HttpServiceProxyFactory.builderFor(restClientAdapter).build();
        return httpServiceProxyFactory.createClient(InventoryClient.class);
    }
}
