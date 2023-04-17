package com.nfeeds.business.routerin.controller;

import com.nfeeds.business.routerin.services.RouterInService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/routerin")
public class RouterInController {

    private final RouterInService routerInService;

    public RouterInController(RouterInService routerInService) {
        this.routerInService = routerInService;
    }
}
