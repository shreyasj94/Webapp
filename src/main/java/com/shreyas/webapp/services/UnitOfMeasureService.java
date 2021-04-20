package com.shreyas.webapp.services;

import com.shreyas.webapp.commands.UnitOfMeasureCommand;


import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
