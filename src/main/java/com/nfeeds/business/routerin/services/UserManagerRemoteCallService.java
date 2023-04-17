package com.nfeeds.business.routerin.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserManagerRemoteCallService {

    @Value("${nfeeds.ad.usermanager.url}")
    private String baseUrl;
}
