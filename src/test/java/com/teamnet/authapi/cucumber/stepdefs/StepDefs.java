package com.teamnet.authapi.cucumber.stepdefs;

import com.teamnet.authapi.AuthapiApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AuthapiApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
