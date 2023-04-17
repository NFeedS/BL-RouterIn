package com.nfeeds.business.routerin.services;

import org.springframework.stereotype.Service;

@Service
public class RouterInService {

    private final RouterInService routerInService;

    public RouterInService(RouterInService routerInService) {
        this.routerInService = routerInService;
    }
}
