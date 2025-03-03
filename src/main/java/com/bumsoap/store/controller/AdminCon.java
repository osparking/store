package com.bumsoap.store.controller;

import com.bumsoap.store.model.Admin;
import com.bumsoap.store.service.AdminServ;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminCon {
    private final AdminServ adminServ;

    @PostMapping("/add")
    public void add(@RequestBody Admin admin) {
        adminServ.add(admin);
    }
}
